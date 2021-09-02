package com.inventory.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@AllArgsConstructor
//@ToString
public class Orders {
    public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerEmail;
    private String customerAddress;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> items;

    public Orders(String customerEmail, String customerAddress, List<OrderItem> items)
    {
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.items = items;
    }

    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public List<OrderItem> getItems() {
		return items;
	}


	public void setItems(List<OrderItem> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress
				+ ", items=" + items + "]";
	}
    
}