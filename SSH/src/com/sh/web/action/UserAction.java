package com.sh.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sh.domain.Category;
import com.sh.domain.User;
import com.sh.service.UserService;




import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	private UserService userService;
	
	@Override
	public User getModel() {
		return user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 获得用户列表
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		// 1.调用service查询类别数据
		List<User> userList = userService.getUserList();
		// 2.将categoryList放入request域，转发到页面显示
		ActionContext.getContext().put("userList", userList);
		return "list";
	}
}
