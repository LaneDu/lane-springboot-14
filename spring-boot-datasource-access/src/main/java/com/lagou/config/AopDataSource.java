package com.lagou.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author lane
 * @date 2021年04月24日 下午3:46
 */
@Component
@Aspect
public class AopDataSource {

	@Around("@annotation(myDataSource)")
	public Object around(ProceedingJoinPoint joinPoint,MyDataSource myDataSource) throws Throwable {

		String value = myDataSource.value();
		RoutingDataSourceContext routingDataSourceContext = new RoutingDataSourceContext(value);
		Object proceed = joinPoint.proceed();
		return proceed;

	}



}
