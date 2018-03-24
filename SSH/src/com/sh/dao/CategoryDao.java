package com.sh.dao;

import java.util.List;

import com.sh.domain.Category;

/**
 * @author Amaze_lee
 * @date 2017年10月26日 下午5:54:26 
 * @version V1.0  
 * @Description: 
 */
public interface CategoryDao extends BaseDao<Category>{

	/**
	 * @return
	 */
	List<Category> getCategoryList();

}
