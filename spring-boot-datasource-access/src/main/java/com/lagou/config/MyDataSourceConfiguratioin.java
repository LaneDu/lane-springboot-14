package com.lagou.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lane
 * @date 2021年04月24日 下午2:53
 */
@Configuration
public class MyDataSourceConfiguratioin {

	Logger logger = LoggerFactory.getLogger(MyDataSourceConfiguratioin.class);
	@Bean
	@ConfigurationProperties(prefix = "spring.druid.datasource.master")
	public DataSource masterDataSource(){
		logger.info("masterDatasource...");
		 return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.druid.datasource.slave")
	public DataSource slaveDataSource(){
		logger.info("slaveDatasource...");
		return DataSourceBuilder.create().build();
	}


	@Bean
	@Primary
	public DataSource primaryDataSource(
			@Autowired @Qualifier("masterDataSource") DataSource masterDataSource,
			@Autowired @Qualifier("slaveDataSource") DataSource slaveDataSource
	){
		logger.info("create routing dataSource ...");
		Map<Object,Object> map = new HashMap<>();
		map.put("masterDataSource",masterDataSource);
		map.put("slaveDataSource",slaveDataSource);
		RoutingDataSource routingDataSource = new RoutingDataSource();
		routingDataSource.setTargetDataSources(map);
		return routingDataSource;
	}


}
