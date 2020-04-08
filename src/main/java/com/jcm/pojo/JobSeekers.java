package com.jcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-03-14 17:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekers {
	private int jobseekersID;
	private String username;
	private String password;
}
