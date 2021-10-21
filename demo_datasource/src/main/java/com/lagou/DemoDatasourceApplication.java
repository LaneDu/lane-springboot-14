package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.lagou.mapper")
public class DemoDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDatasourceApplication.class, args);
    }

}
