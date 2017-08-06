package com.test.order.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.order.po.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	@Override
	public Order findOrderById(Long id) {
		List<Order> list = sessionFactory.getCurrentSession().createCriteria(Order.class).add(Restrictions.eq("id", id)).list();
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}
