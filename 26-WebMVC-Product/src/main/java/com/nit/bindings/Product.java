package com.nit.bindings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, Double price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
