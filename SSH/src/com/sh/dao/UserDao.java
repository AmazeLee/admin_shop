package com.sh.dao;

import java.util.List;

import com.sh.domain.ShopAdmin;
import com.sh.domain.User;

public interface UserDao extends BaseDao<User>{

	List<User> getUserList();

}
