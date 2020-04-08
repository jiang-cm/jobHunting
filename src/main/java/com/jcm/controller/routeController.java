package com.jcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-03-11 14:22
 */
@Controller
public class routeController {
	/**
	 * 跳转到登录页面
	 **/
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "login";
	}

	/**
	 * 跳转到注册页面
	 **/
	@RequestMapping("/toRegister")
	public String toRegister(){
		return "register";
	}

	/**
	 * 跳转到求职者首页
	 **/
	@RequestMapping("/tojobSeekerIndex")
	public String tojobSeekerIndex(){
		return "jobSeeker/jobSeekerIndex";
	}

	/**
	 * 跳转到招聘者首页
	 **/
	@RequestMapping("/toCompanyIndex")
	public String toCompanyIndex(){
		return "company/companyIndex";
	}

	@RequestMapping("/toJoblist")
	public String toJoblist(){
		return "jobSeeker/joblist";
	}

	/**
	 * 跳转到求职者基本信息填写界面
	 **/
	@RequestMapping("/toJsInfo")
	public String toJsInfo(){
		return "jobSeeker/jobSeekerInfo";
	}

	/**
	 * * 跳转到招聘者基本信息填写界面
	 **/
	@RequestMapping("/toCompanyInfo")
	public String toCompanyInfo(){
		return "company/companyInfo";
	}

	/**
	 * 跳转到填写简历页面
	 */
	@RequestMapping("/toResume")
	public String toResume(){
		return "jobSeeker/resume";
	}


}
