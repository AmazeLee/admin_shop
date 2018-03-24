package com.sh.service.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;

import com.sh.dao.OrdersDao;
import com.sh.dao.ProductDao;
import com.sh.domain.Category;
import com.sh.domain.Orders;
import com.sh.domain.Product;
import com.sh.service.CategoryService;
import com.sh.service.OrdersService;
import com.sh.utils.PageBean;


public class OrdersServiceImpl implements OrdersService{

	private OrdersDao od;
	
	@Override
	public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		//调用dao查询总记录数
		Integer totalCount = od.getTotalCount(dc);
		//创建pageBean对象
		PageBean pb = new PageBean(currentPage, totalCount, pageSize);
		//调用Dao查询分页列表数据
		List<Orders> list = od.getPageList(dc,pb.getStart(),pb.getPageSize());
		//列表数据放入pageBean中，并返回
		pb.setList(list);
		return pb;
	}

	public OrdersDao getOd() {
		return od;
	}

	public void setOd(OrdersDao od) {
		this.od = od;
	}

	@Override
	public List<Map<String, Object>> findOrderInfoByOid(String oid) {
		List<Map<String, Object>> mapList = null;
		mapList = od.findOrderInfoByOid(oid);
		return mapList;
	}

}
