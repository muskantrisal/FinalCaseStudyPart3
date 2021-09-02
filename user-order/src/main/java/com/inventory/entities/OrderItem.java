package com.inventory.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long productId;
    private int quantity;
    private BigDecimal productPrice;

    public OrderItem(Long productId, int quantity, BigDecimal productPrice)
    {
        this.productId = productId;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

}
