package com.lagou;

import com.lagou.config.AppConfig;
import com.lagou.config.MyServlet;
import com.lagou.config.MyTomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @author lane
 * @date 2021年04月28日 下午2:26
 */
public class SpringApplication {

    public static void main(String[] args) throws Exception{
        //1.初始化ioc，
        // 为什么要先初始化ioc，而不是先启动tomcat，因为ioc是必须的，而tomcat可以被其他中间件替换
        AnnotationConfigWebApplicationContext ac=new AnnotationConfigWebApplicationContext();
        //2.注册配置类
        ac.register(AppConfig.class);
        ac.refresh();                          //刷新
        //3.启动tomcat
        MyTomcat.start();

    }

}
