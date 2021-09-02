package com.inventory.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Orders;
@Repository
public interface UserOrderDao extends JpaRepository<Orders, Long>{
	 Orders getOrdersById(Long id);
	

}
