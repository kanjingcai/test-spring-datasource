package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.test.datasource.DataSourceType;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

	/**
	 * 数据源类型，默认是MASTER 主库
	 * 
	 * @return
	 * @see 2016年5月13日
	 * @author kanjc
	 */
	public abstract DataSourceType values() default DataSourceType.MASTER;

}
