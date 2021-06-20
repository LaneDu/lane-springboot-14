package com.lagou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author lane
 * @date 2021年04月28日 下午2:27
 */
@Configuration
@ComponentScan("com.lagou")
public class AppConfig {
    //将dispatcherServlet放入到ioc容器，并加载到tomcat上下文中去
    //注意dispatcherServlet不能放在启动类，因为也可以被reactive响应式编程替换掉servlet,也可以不是web项目
    @Bean
    public DispatcherServlet myDispatcherServlet(){
        return new DispatcherServlet();
    }
}
