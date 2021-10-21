package com.lagou.pojo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lane
 * @date 2021年04月24日 上午10:13
 */
@Data
public class User {

	private Integer id;
	private String username;
	private Integer age;

}
