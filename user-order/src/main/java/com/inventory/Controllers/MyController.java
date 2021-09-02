package com.inventory.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.Services.UserOrderService;
import com.inventory.Services.UserOrderServiceInterface;
import com.inventory.entities.OrderItem;
import com.inventory.entities.Orders;

@RestController
@RequestMapping(path = "/orders")
public class MyController {
	@Autowired
	UserOrderServiceInterface userorderService;
	
	  @PostMapping(produces = "Application/json", consumes = "Application/json")
	    Orders saveOrder(@RequestBody Orders order)
	    {
	        return userorderService.createOrder(order);
	    }

	    @GetMapping(path = "/{id}", produces = "Application/json")
	    Orders getOrderById(@PathVariable("id") Long id)
	    {
	        return userorderService.findOrderById(id);
	    }
	    
	    @GetMapping(produces = "application/json")
	    List<Orders> getAllOrders(){
	    	List<Orders> orders=userorderService.getAllOrders();
	    	System.out.println(orders);
	    	return orders;
	    }
		
	

}
