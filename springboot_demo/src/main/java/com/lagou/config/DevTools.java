package com.lagou.config;

import org.springframework.beans.factory.InitializingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * @author lane
 * @date 2021年04月18日 上午11:08
 */
@Component
public class DevTools implements InitializingBean {
    private static final Logger log = LoggerFactory.getLogger(DevTools.class);
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("guava-jar classLoader: " +
                DispatcherServlet.class.getClassLoader().toString());
        log.info("Devtools ClassLoader: " +
                this.getClass().getClassLoader().toString());

    }
}
