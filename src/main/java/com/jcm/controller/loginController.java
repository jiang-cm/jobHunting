package com.jcm.controller;


import com.jcm.pojo.Company;
import com.jcm.pojo.JobSeekers;
import com.jcm.service.companyService;
import com.jcm.service.jobSeekersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class loginController {
	@Autowired
	private jobSeekersService seekersService;

	@Autowired
	private companyService companyService;

	/**
	 * 注册一个求职者*/
	@RequestMapping("/seekerLogin")
	public String seekerRegister(JobSeekers seekers, String repassword, Model model,HttpSession session){
		System.out.println("seekerRegister==========================》"+"jobseekers:"+seekers+"确认密码："+repassword);
		if(seekers.getPassword().equals(repassword)){
			seekersService.addSeeker(seekers);
			System.out.println("getJobseekersID=============>"+seekers.getJobseekersID());
			model.addAttribute("ID",seekers.getJobseekersID());
			session.setAttribute("jId",seekers.getJobseekersID());
			return "jobSeeker/jobSeekerInfo";
		}else{
			model.addAttribute("msg","两次输入的密码不一致!");
			return "register";
		}
	}

	/**
	 * 注册一个招聘者*/
	@RequestMapping("/employeeLogin")
	public String employeeRegister(Company company, String repassword, Model model){
		System.out.println("employeeRegister==========================》"+"company:"+company+"确认密码："+repassword);
		if(company.getPassword().equals(repassword)){
			companyService.addCompanies(company);
			System.out.println("getCompanyID=============>"+company.getCompanyID());
			model.addAttribute("ID2",company.getCompanyID());
			return "company/companyInfo";
		}else{
			model.addAttribute("msg","两次输入的密码不一致!");
			return "register";
		}
	}

	/**
	 * 用户登录*/
	@RequestMapping("/userLogin")
	public String userLogin(String username, String password, Model model, HttpSession session){
		System.out.println("userLogin=================================》"+"用户名："+username+"密码："+password);
		String jobSeekers = seekersService.querySeekers(username, password);
		System.out.println("jobSeekers===========>"+jobSeekers);
		if(jobSeekers==null || "".equals(jobSeekers)){
			Company company = companyService.queryCompanies(username, password);
			if(company==null || "".equals(company)){
				model.addAttribute("msg","用户名或密码错误！");
				return "login";
			}else{

				session.setAttribute("username",username);
				return "company/companyIndex";
			}
		}else{
			session.setAttribute("sID",jobSeekers);
			session.setAttribute("username",username);
			return "jobSeeker/jobSeekerIndex";
		}
	}

	/**
	 * 退出登录
	 */
	@RequestMapping("/loginOut")
	public String loginOut(HttpSession session){
		session.invalidate();
		return "redirect:/toLogin";
	}
}