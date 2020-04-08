package com.jcm.controller;

import com.jcm.pojo.JSInfo;
import com.jcm.pojo.Resume;
import com.jcm.service.jobSeekersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class jsController {
	@Autowired
	private jobSeekersService seekersService;

	/**
	 * 提交求职者基本信息*/
	@RequestMapping("/addJsInfo")
	private String addJsInfo(JSInfo jsInfo){
		System.out.println("addJsInfo==========>"+jsInfo);
		seekersService.addJsInfo(jsInfo);
		return "jobSeeker/resume";
	}

	/**
	 * 添加简历
	 */
	@RequestMapping("/addReume")
	private String addReume(Resume resume, HttpSession session){
		Object jId = session.getAttribute("jId");
		int i1 = Integer.parseInt(String.valueOf(jId));
		System.out.println("i1====="+i1);
		resume.setJobseekerID(i1);
		System.out.println("addResume======>"+resume);
		seekersService.addResume(resume);
		return "login";
	}

	/**
	 * 查看简历
	 */
	@RequestMapping("/viewResume/{id}")
	private String viewResume(@PathVariable("id") int id, Model model){
		System.out.println("viewResume=======id=========>"+id);
		Resume resume = seekersService.viewResume(id);
		System.out.println("viewResume======resume======>"+resume);
		model.addAttribute("resume",resume);
		return "jobSeeker/viewResume";
	}

	/**
	 * 修改简历
	 */
	@RequestMapping(value = "/updateReume",method = RequestMethod.POST,produces = "text/html;charset=utf-8")
	@ResponseBody
	private String updateReume(Resume resume) throws ParseException {
		int reID = resume.getReID();
		System.out.println("updateReume==========reID============>"+reID);
		System.out.println("updateReume==========resume============>"+resume);
		int i = seekersService.updateResume(resume);
		if(i==1){
			return "OK";
		}else{
			return "FALSE";
		}
	}
}
