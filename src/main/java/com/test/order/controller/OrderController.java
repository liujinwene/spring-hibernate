package com.test.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.order.po.Order;
import com.test.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	private final static Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/findById")
	public Order findById(Long id) {
		return orderService.findOrderById(id);
	}

}
