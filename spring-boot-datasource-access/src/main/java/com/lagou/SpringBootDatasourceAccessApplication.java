package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.annotation.HandlesTypes;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.lagou.mapper")

public class SpringBootDatasourceAccessApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatasourceAccessApplication.class, args);
	}


}
