package com.jcm.service;

import com.jcm.pojo.JSInfo;
import com.jcm.pojo.JobSeekers;
import com.jcm.pojo.Jobs;
import com.jcm.pojo.Resume;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-03-16 10:14
 */

public interface jobSeekersService {
	/**
	 * 注册一个求职者用户
	 * */
	int addSeeker(JobSeekers seeker);

	/**
	 * 求职者用户登录
	 * */
	String querySeekers(String username,String password);

	/**
	 * 求职者基本信息填写*/
	int addJsInfo(JSInfo jsInfo);

	/**
	 * 查询所有招聘信息
	 */
	Jobs queryAllJobs();

	/**
	 * 添加简历
	 */
	int addResume(Resume resume);

	/**
	 * 根据id查看简历
	 */
	Resume viewResume(int id);

	/**
	 * 修改简历
	 */
	int updateResume(Resume resume);
}
