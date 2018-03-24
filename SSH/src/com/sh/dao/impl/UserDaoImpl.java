package com.sh.dao.impl;

import java.util.List;

import com.sh.dao.UserDao;
import com.sh.domain.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements  UserDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		return (List<User>) this.getHibernateTemplate().find("from User");
	}

}
