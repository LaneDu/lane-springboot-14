package com.lagou;

import com.lagou.config.EnableRegisterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRegisterServer
public class SpringBootMytestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestsApplication.class, args);
	}

}
