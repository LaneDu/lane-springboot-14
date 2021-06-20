package com.lagou;

import com.lagou.config.JarObject;
import com.lagou.config.JdbcConfiguration;
import com.lagou.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @author lane
 * @date 2021年04月18日 下午3:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTest {

    @Autowired
    Person peroson ;
    @Test
    public void testPerson(){
        System.out.println(peroson);
    }


    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcConfiguration jdbcConfiguration;
    @Test
    public void testValue(){

        System.out.println(jdbcConfiguration);
    }


    @Autowired
    JarObject jarObject;
    @Test
    public void testCon(){
        System.out.println(jarObject);
    }
}



