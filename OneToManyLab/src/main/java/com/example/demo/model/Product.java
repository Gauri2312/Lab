 //Q.2) Wap to implement OneToMany mapping between customer and product Entity
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductInfo")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long pId;
private String pName;
@ManyToOne
@JoinColumn(name = "c_id")
private Customer customer;

public Product(String pName, Customer customer) {
	super();
	this.pName = pName;
	this.customer = customer;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
	
	

}
