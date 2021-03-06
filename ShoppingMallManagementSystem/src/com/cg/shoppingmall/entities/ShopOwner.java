package com.cg.shoppingmall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_owner")
public class ShopOwner 
{
	@Id
	@Column(name="id")
     private int id;
	
	@Column(name="dateOfPurchase")
     private String dateOfPurchase;     //LocalDateTime dateOfPurchase;
     
	@Column(name="total")
	private float total;
	
	@Column(name="customer_id")
     private Customer customer_id;
	
	@Column(name="paymentMethod")
     private String paymentMethod;
	
	@Column(name="shop_id")
     private Shop shop_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Customer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Shop getShop_id() {
		return shop_id;
	}
	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
     
     
}
