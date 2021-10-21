package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lane
 * @date 2021年04月27日 下午10:35
 */
@RestController
public class clientController {

		@RequestMapping("/index")
		public String index() {
			return "这是index";
		}
		@RequestMapping("/home")
		public String home() {
			return "这是home";
		}

}
