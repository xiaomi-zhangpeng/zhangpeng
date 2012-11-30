package com.xiaomi.mybatis.mapper;

import com.xiaomi.mybatis.bean.User;

public interface UserMapper {

	public void insertUser(User user);

	public User getUser(String name);
}
