package com.jcm.mapper;

import com.jcm.pojo.CPInfo;
import com.jcm.pojo.Company;
import com.jcm.pojo.JobSeekers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author shkstart
 * @create 2020-03-18 16:07
 */
@Mapper
@Repository
public interface companyMapper {
	/**
	 * 注册一个求职者用户
	 * */
	int addCompanies(Company company);

	/**
	 * 招聘者用户登录
	 * */
	Company queryCompanies(String username,String password);

	/**
	 * 填写招聘者基本信息
	 * */
	int addCpInfo(CPInfo cpInfo);
}
