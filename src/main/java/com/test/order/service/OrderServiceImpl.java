package com.test.order.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.order.po.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	@Override
	public Order findOrderById(Long id) {
		String sql = "select id from `order` where id="+id;
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		List<Order> list = query.list();
		
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}
