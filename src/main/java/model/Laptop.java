package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LAPTOP")
public class Laptop {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="PRICE")
	private  int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id 
				+ ", brand=" + brand 
				+ ", price=" + price 
				+ "]";
	}
	
	
}
