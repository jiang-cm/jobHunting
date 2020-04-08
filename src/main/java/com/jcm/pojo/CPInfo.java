package com.jcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-03-21 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CPInfo {
	private int cpID;
	private String cpName;
	private String cpPeople;
	private String cpCharacter;
	private String cpBirth;
	private String cpIntroduction;
	private int companyID;
}
