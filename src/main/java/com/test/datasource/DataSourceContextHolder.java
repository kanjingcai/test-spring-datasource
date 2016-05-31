package com.test.datasource;

public class DataSourceContextHolder {

	private static final ThreadLocal<DataSourceType> D_THREAD_LOCAL = new ThreadLocal<DataSourceType>();

	public static void set(DataSourceType sourceType) {
		D_THREAD_LOCAL.set(sourceType);
	}

	public static DataSourceType get() {
		return D_THREAD_LOCAL.get();
	}

	public static void remove() {
		D_THREAD_LOCAL.remove();
	}

}
