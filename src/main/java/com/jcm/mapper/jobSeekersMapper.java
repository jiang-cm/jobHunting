package com.jcm.mapper;

import com.jcm.pojo.JSInfo;
import com.jcm.pojo.JobSeekers;
import com.jcm.pojo.Jobs;
import com.jcm.pojo.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author shkstart
 * @create 2020-03-14 17:23
 */
@Mapper
@Repository
public interface jobSeekersMapper {
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
	 * 修改简历信息
	 */
	int updateResume(Resume resume);
}
