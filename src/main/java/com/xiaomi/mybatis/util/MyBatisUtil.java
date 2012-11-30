package com.xiaomi.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private final static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "Configuration.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);

		} catch (IOException e) {
			System.out.println(e);
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
