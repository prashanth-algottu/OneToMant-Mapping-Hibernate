package com.tec.hibernateo_OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders 
{
	@Id
	private int ordoId;
	private String item;
	private int price;
	
	@JoinColumn(name = "chinnnu")
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;

	public int getOrdoId() {
		return ordoId;
	}

	public void setOrdoId(int ordoId) {
		this.ordoId = ordoId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [ordoId=" + ordoId + ", item=" + item + ", price=" + price + ", customer=" + customer + "]";
	}

	public Orders(int ordoId, String item, int price) {
		super();
		this.ordoId = ordoId;
		this.item = item;
		this.price = price;
	
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
