package com.sh.service;

import java.util.List;

import com.sh.dao.CategoryDao;
import com.sh.domain.Category;
import com.sh.domain.User;

public interface UserService {

	public List<User> getUserList();

}
