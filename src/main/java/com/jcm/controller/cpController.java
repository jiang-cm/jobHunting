package com.jcm.controller;

import com.jcm.pojo.CPInfo;
import com.jcm.service.companyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-03-21 15:15
 */
@Controller
public class cpController {
	@Autowired
	private companyService companyService;

	/**
	 * 提交招聘者基本信息*/
	@RequestMapping("/addCpInfo")
	private String addCpInfo(CPInfo cpInfo){
		System.out.println("addCpInfo==========>"+cpInfo);
		companyService.addCpInfo(cpInfo);
		return "login";
	}
}
