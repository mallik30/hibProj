package com.mtc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="product_id")
	private int id;
	@Column(name="product_name")
	private String name;
	@Column(name="product_description")
	private String description;
	@Column(name="product_price")
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "Id : "+id+"\nName : "+"\nPrice : "+price+"\nDescription : "+description+"\n"; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
