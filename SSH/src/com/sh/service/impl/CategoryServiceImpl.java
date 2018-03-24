package com.sh.service.impl;

import java.util.List;

import com.sh.dao.CategoryDao;
import com.sh.domain.Category;
import com.sh.service.CategoryService;

/**
 * @author Amaze_lee
 * @date 2017年10月26日 下午8:59:33 
 * @version V1.0  
 * @Description: 
 */
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDao cd;
	
	@Override
	public List<Category> getCategoryList() {
		List<Category> categoryList = cd.getCategoryList();
		return categoryList;
	}

	public void setCd(CategoryDao cd) {
		this.cd = cd;
	}

	@Override
	public Category getById(String cid) {
		return cd.getById(cid);
	}

	@Override
	public void update(Category category) {
		cd.update(category);	
	}

	@Override
	public void save(Category category) {
		cd.save(category);	
	}

	@Override
	public void delById(String cid) {
		cd.delete(cid);
		
	}
	
}
