package com.lagou.config;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import java.io.File;

/**
 * @author lane
 * @date 2021年04月28日 下午2:59
 */
@Component
public class MyTomcat {

    public static void start() throws LifecycleException, ServletException {
        //创建tomcat服务器
        Tomcat tomcatServer = new Tomcat();
        //设置port
        tomcatServer.setPort(8085);
        //读取项目路径,'/'可以加载静态资源
        StandardContext ctx = (StandardContext) tomcatServer.addWebapp("/", new File("src/main").getAbsolutePath());
        //禁止重新载入
        ctx.setReloadable(false);
        //class文件读取地址
        File addtionWebInfoClasses = new File("target/classes");
        //创建WebRoot
        WebResourceRoot resources = new StandardRoot(ctx);
        //tomcat内部读取class文件进行执行
        //内部虚拟Tomcat空间
        resources.addPreResources(new DirResourceSet(resources,"/WEB-INF/classes",addtionWebInfoClasses.getAbsolutePath(),"/"));
        tomcatServer.start();
        System.out.println("创建Tomcat启动成功");
        //异步进行接收请求
        tomcatServer.getServer().await();

    }
    /**
     * 绝对路径启动
     * @author lane
     * @date 2021/4/28 下午4:54
     */
    public static void start2() throws LifecycleException, ServletException {

        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8081);
        tomcat.addWebapp("/","/Volumes/workspace/startspace/spring-boot-homework");
        tomcat.start();
        System.out.println("创建Tomcat启动成功");
        //因为  tomcat.start();是非阻塞型的，所以要阻塞一下，不能让服务停止。
        tomcat.getServer().await();
    }
    }


