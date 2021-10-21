package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 包含@responseBody和@controller
 * @author lane
 * @date 2021年04月18日 上午10:27
 */
@RestController
public class DemoController {
    //http://localhost:8081/springboot/demo
    @RequestMapping("/demo")
    public String demoTest(){

        return "热部署00hello spring boot";
    }
}
