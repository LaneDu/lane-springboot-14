package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lane
 * @date 2021年04月28日 下午2:37
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("hello world");
        return "hello";
    }

}
