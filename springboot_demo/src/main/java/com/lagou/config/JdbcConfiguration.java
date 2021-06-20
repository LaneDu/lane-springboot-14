package com.lagou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author lane
 * @date 2021年04月20日 上午10:35
 */
@Configuration
public class JdbcConfiguration {

    @Value("${jdbc.driverClassName}")
    private  String driverClassName;
    @Value("${jdbc.url}")
    private  String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    //默认方法名作为bean的id放入ioc
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    //通过下面这个注解给第三方jar中的对象注入属性放入ioc容器中
    //该注解也可以放在类上配合@Component 完成全局Set方法注入
    @ConfigurationProperties(prefix = "jar")
    @Bean
    public JarObject jarObject(){
        return new JarObject();
    }



    @Override
    public String toString() {
        return "JdbcConfiguration{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
