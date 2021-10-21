package com.lagou.controller;

import com.lagou.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @author lane
 * @date 2021年04月24日 上午11:23
 */
@Controller
public class UserController {


	private UserService userService;

	public String UserInfo(){
		userService.findAllUser();

		return "ok";
	}
}




