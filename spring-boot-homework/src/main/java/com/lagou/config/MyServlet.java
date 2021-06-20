package com.lagou.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author lane
 * @date 2021年04月28日 下午3:26
 */

@Component
public class MyServlet implements ApplicationContextAware {

    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext:"+applicationContext);
        context = applicationContext;
    }
    //从ApplicationContext中获取DispatcherServlet实例
    public static DispatcherServlet getDispatcherServlet(){
        DispatcherServlet myDispatcherServlet =(DispatcherServlet) context.getBean("myDispatcherServlet");
        return myDispatcherServlet;
    }

}
