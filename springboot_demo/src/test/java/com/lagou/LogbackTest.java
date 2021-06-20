package com.lagou;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lane
 * @date 2021年04月20日 下午3:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogbackTest {

   private Logger log =  LoggerFactory.getLogger(this.getClass());

    @Test
    public void logTest(){
        System.out.println("传统输出信息、、、、、、");
        //trace<debug<info<warn<error
        //springboot的默认输出级别是info,低于这个级别的不显示，可以修改默认级别
        log.trace("trace 日志、、、、、、、");
        log.debug("debug 日志、、、、、、、");
        log.info("info 日志、、、、、、、");
        log.warn("warn 日志、、、、、、、");
        log.error("error 日志、、、、、、、");
    }
}
