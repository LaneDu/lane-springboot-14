package com.lagou.config;

import com.lagou.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lane
 * @date 2021年04月22日 上午11:51
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class StartConfiguration {

	static {
		System.out.println("执行start配置类.....");
	}

	@Bean
	public SimpleBean simpleBean(){
		return new SimpleBean();
	}

}
