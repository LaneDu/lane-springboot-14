package com.lagou.controller;

import com.lagou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lane
 * @date 2021年04月24日 下午2:49
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/findAllProductM")
	public String findAllProductM(){
		productService.findAllProductM();
		return "master";
	}

	@RequestMapping("/findAllProductS")
	public String findAllProductS(){
		productService.findAllProductS();
		return "slave";
	}


}
