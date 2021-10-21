package com.lagou.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author lane
 * @date 2021年04月27日 下午9:23
 */
@Configuration
@Profile("online")
public class ProfileConfigOnline {

	public ProfileConfigOnline(){
		System.out.println("online.......");
	}
}
