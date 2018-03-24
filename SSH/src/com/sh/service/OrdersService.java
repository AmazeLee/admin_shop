package com.sh.service;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;

import com.sh.utils.PageBean;

public interface OrdersService {
	
	//分页查询
	PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//通过oid查询订单详情
	List<Map<String, Object>> findOrderInfoByOid(String oid);
}
