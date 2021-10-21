package com.lagou.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lane
 * @date 2021年04月25日 上午10:20
 */
@Data
public class Employee implements Serializable {

	private Integer id;
	private String lastName;
	private String email;
	private Integer gender; //性别 1男 0女
	private Integer dId;

}
