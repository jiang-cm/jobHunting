package com.jcm.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resume {
	private int reID;
	private String fullName;
	private String reSex;
	private String reBirth;
	private String jhStatus;
	private String startWorkTime;
	private String rsPhone;
	private String rsMalis;
	private String desiredPosition;
	private String salaryExpectation;
	private String cName;
	private String sInServiceTime;
	private String eInServiceTime;
	private String jType;
	private String jobContent;
	private String schoolName;
	private String reEducation;
	private String reMajor;
	private String sSchoolHours;
	private String eSchoolHours;
	private String reHobbies;
	private String selfEvaluation;
	private int jobseekerID;

}
