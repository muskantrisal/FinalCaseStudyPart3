package com.inventory.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.Dao.UserOrderDao;
import com.inventory.entities.Orders;

@Service
public class UserOrderService implements UserOrderServiceInterface {

	@Autowired
	UserOrderDao userorderDao;

	public Orders createOrder(Orders orders) {
		return userorderDao.save(orders);
	}

	public Orders findOrderById(Long id) {
		return userorderDao.getOrdersById(id);
	}

	public List<Orders> getAllOrders() {

		return userorderDao.findAll();
	}

}
