package com.lagou.config;

/**
 * 用于动态存储数据源的key
 * @author lane
 * @date 2021年04月24日 下午3:21
 */
public class RoutingDataSourceContext {

	static final ThreadLocal<String> threadLocalDataSourceKey = new ThreadLocal<>();


	public RoutingDataSourceContext(String key){
		threadLocalDataSourceKey.set(key);
	}

	public static String getKey(){

		String key = threadLocalDataSourceKey.get();
		return key==null?"masterDataSource":key;

	}

	public void close(){
		threadLocalDataSourceKey.remove();
	}
}
