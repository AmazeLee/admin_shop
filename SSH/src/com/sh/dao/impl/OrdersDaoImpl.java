package com.sh.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.QueryParameter;
import org.springframework.orm.hibernate4.HibernateCallback;

import com.sh.dao.OrdersDao;
import com.sh.domain.Orders;

public class OrdersDaoImpl extends BaseDaoImpl<Orders> implements OrdersDao{

	@Override
	public List<Map<String, Object>> findOrderInfoByOid(String oid) {
		
		/*return (List<Map<String, Object>>) this.getHibernateTemplate().find("from Orderitem","oid");*/
		
		Session session = getHibernateTemplate().getSessionFactory().openSession();  
        Transaction tx = session.beginTransaction();  
          
        String hql = "select p.pimage,p.pname,p.shop_price,i.count,i.subtotal "+
				" from Orderitem i,Product p "+
				" where i.pid=p.pid and i.oid=? ";;//简单写法  
        Query query = session.createQuery(hql);  
        List<Map<String, Object>> list = query.list();  
        System.out.println(list);  
          
        tx.commit();  
        session.close();
		return list; 
		
		
	
	}

}
