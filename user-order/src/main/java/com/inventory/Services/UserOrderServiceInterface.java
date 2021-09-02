package com.inventory.Services;

import java.util.List;

import com.inventory.entities.Orders;

public interface UserOrderServiceInterface {
	
	public Orders createOrder(Orders orders);
	public Orders findOrderById(Long id);
	List<Orders> getAllOrders();

}
