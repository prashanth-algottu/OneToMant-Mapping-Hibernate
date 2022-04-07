package com.tec.hibernateo_OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer 
{
	@Id
	private int custoid;
	private String name;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> orders;

	public int getCustoid() {
		return custoid;
	}

	public void setCustoid(int custoid) {
		this.custoid = custoid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [custoid=" + custoid + ", name=" + name + ", orders=" + orders + "]";
	}

	public Customer(int custoid, String name) {
		super();
		this.custoid = custoid;
		this.name = name;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
