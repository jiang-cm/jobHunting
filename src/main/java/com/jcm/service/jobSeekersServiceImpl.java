package com.jcm.service;

import com.jcm.mapper.jobSeekersMapper;
import com.jcm.pojo.JSInfo;
import com.jcm.pojo.JobSeekers;
import com.jcm.pojo.Jobs;
import com.jcm.pojo.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-03-16 10:17
 */
@Service
public class jobSeekersServiceImpl implements jobSeekersService {
	@Autowired
	private jobSeekersMapper seekerMapper;

	public void setSeekerMapper(jobSeekersMapper seekerMapper) {
		this.seekerMapper = seekerMapper;
	}

	/**
	 * 注册一个求职者用户*/
	@Override
	public int addSeeker(JobSeekers seeker) {
		return seekerMapper.addSeeker(seeker);
	}

	/**
	 * 求职者用户登录*/
	@Override
	public String querySeekers(String username, String password) {
		return seekerMapper.querySeekers(username,password);
	}

	/**
	 * 求职者基本信息填写*/
	@Override
	public int addJsInfo(JSInfo jsInfo) {
		return seekerMapper.addJsInfo(jsInfo);
	}

	/**
	 * 查询所有招聘信息
	 */
	@Override
	public Jobs queryAllJobs() {
		return seekerMapper.queryAllJobs();
	}

	/**
	 * 添加简历
	 */
	@Override
	public int addResume(Resume resume) {
		return seekerMapper.addResume(resume);
	}

	/**
	 * 根据id查看简历
	 */
	@Override
	public Resume viewResume(int id) {
		return seekerMapper.viewResume(id);
	}

	/**
	 * 修改简历
	 */
	@Override
	public int updateResume(Resume resume) {
		return seekerMapper.updateResume(resume);
	}
}
