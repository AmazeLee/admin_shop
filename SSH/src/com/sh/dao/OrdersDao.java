package com.sh.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;

import com.sh.domain.Orders;
import com.sh.domain.Product;

public interface OrdersDao extends BaseDao<Orders>{

	List<Map<String, Object>> findOrderInfoByOid(String oid);
}
