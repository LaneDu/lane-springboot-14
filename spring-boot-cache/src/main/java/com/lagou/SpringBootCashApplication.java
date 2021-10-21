package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.lagou.mapper")
@EnableCaching //开启基于注解的缓存
public class SpringBootCashApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCashApplication.class, args);
	}

}
