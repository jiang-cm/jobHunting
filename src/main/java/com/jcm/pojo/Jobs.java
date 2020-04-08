package com.jcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-03-23 19:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {
	private int jobsID;
	private String jobsName;
	private String jobsType;
	private String jobsPeople;
	private String jobsSalary;
	private String jobsdescription;
	private String degree;
	private String experienceRequire;
	private String companyID;
}
