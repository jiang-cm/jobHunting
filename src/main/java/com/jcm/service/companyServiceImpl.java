package com.jcm.service;

import com.jcm.mapper.companyMapper;
import com.jcm.pojo.CPInfo;
import com.jcm.pojo.Company;
import com.jcm.pojo.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;

/**
 * @author shkstart
 * @create 2020-03-18 16:23
 */
@Service
public class companyServiceImpl implements companyService{
	@Autowired
	private companyMapper companyMapper;

	public void setCompanyMapper(com.jcm.mapper.companyMapper companyMapper) {
		this.companyMapper = companyMapper;
	}

	/**
	 * 注册一个招聘者用户*/
	@Override
	public int addCompanies(Company company){
		return companyMapper.addCompanies(company);
	}

	/**
	 * 招聘者用户登录*/
	@Override
	public Company queryCompanies(String username, String password) {
		return companyMapper.queryCompanies(username,password);
	}

	/**
	 * 填写招聘者基本信息
	 * */
	@Override
	public int addCpInfo(CPInfo cpInfo) {
		return companyMapper.addCpInfo(cpInfo);
	}


}
