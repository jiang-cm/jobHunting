package com.jcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-03-18 16:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	private int companyID;
	private String username;
	private String password;
}
