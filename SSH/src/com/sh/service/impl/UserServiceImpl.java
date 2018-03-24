package com.sh.service.impl;

import java.util.List;

import com.sh.dao.UserDao;
import com.sh.domain.User;
import com.sh.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao ud;
	@Override
	public List<User> getUserList() {
		List<User> userList = ud.getUserList();
		return userList;
	}
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
}
