package com.test.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.order.po.Order;
import com.test.order.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring-config.xml")
public class OrderTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void findOrder() {
		Order order = orderService.findOrderById(1L);
		System.out.println(order);
	}
}
