package com.lagou.config;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author lane
 * @date 2021年04月28日 下午2:32
 */

@HandlesTypes({MySpringServletContainerInitializer.class})
public class MySpringServletContainerInitializer extends MyServlet implements ServletContainerInitializer {
   //当实现了Servlet3.0规范的容器（比如Tomcat7及以上版本）启动时，
   // 会通过SPI扩展机制自动扫描所有jar包里META-INF/services/javax.servlet.ServletContainerInitializer文件中指定的全路径类
   //（该类需实现ServletContainerInitializer接口），并实例化该类，并回调类中的onStartup方法。
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("执行了MySpringServletContainerInitializer");
        ServletRegistration.Dynamic dynamic =servletContext.addServlet("myDispatcherServlet",super.getDispatcherServlet());
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("/");


    }
}
