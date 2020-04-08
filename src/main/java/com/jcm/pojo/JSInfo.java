package com.jcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-03-20 16:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSInfo {
	private int jsID;
	private String jsName;
	private String jsSex;
	private String jsBirth;
	private String jsEducation;
	private String jobSeekerID;
}
