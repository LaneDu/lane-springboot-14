package com.lagou.service;

import com.lagou.config.MyDataSource;
import com.lagou.config.RoutingDataSourceContext;
import com.lagou.mapper.ProductMapper;
import com.lagou.pojo.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lane
 * @date 2021年04月24日 下午2:45
 */
@Service
public class ProductService {

	@Autowired
	private ProductMapper productMapper;

	Logger logger = LoggerFactory.getLogger(this.getClass());


	@MyDataSource("masterDataSource")
	public List<Product> findAllProductM(){
//		String key ="masterDataSource";
//		RoutingDataSourceContext routingDataSourceContext = new RoutingDataSourceContext(key);
		List<Product> allProductM = productMapper.findAllProductM();
		logger.info("master:"+allProductM.toString());
		return allProductM;

	}
	@MyDataSource("slaveDataSource")
	public List<Product> findAllProductS(){

//		String key ="slaveDataSource";
//		RoutingDataSourceContext routingDataSourceContext = new RoutingDataSourceContext(key);
		List<Product> allProductS = productMapper.findAllProductS();
		logger.info("slave:"+allProductS.toString());
		return allProductS;

	}

}
