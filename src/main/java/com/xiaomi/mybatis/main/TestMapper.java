package com.xiaomi.mybatis.main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.xiaomi.mybatis.bean.User;
import com.xiaomi.mybatis.mapper.UserMapper;
import com.xiaomi.mybatis.util.MyBatisUtil;

public class TestMapper {

	static SqlSessionFactory sqlSessionFacotry = null;
	static {
		sqlSessionFacotry = MyBatisUtil.getSqlSessionFactory();
	}

	@Test
	public void testAdd() {
		SqlSession sqlSession = sqlSessionFacotry.openSession();

		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("tom", new Integer(5));
			userMapper.insertUser(user);

			sqlSession.commit();

		} finally {
			sqlSession.close();
		}

	}
	
	
}
