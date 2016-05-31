package com.test.datasource;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.test.annotation.DataSource;

/**
 * 通过AOP实现注解的方式，动态切换数据源
 * 
 * @author kanjc
 * @version 1.0, 2016年5月13日
 */
public class DataSourceInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		DataSource dataSource = invocation.getMethod().getAnnotation(
				DataSource.class);
		if (dataSource != null) {
			DataSourceType type = dataSource.values();
			if (type != null) {
				DataSourceContextHolder.set(type);
			} else {
				DataSourceContextHolder.remove();
			}
		} 
		return invocation.proceed();
	}

}
