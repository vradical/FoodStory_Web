package com.foodstory.domains;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Timestamp dateTime;
	private double totalPrice;
	
	@ManyToOne
	private User user;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "order_dish")
	private Set<Dish> dishList;
	
	public Order() {
		
	}
	
	public Order(Timestamp dateTime, double totalPrice) {
		this.dateTime = dateTime;
		this.totalPrice = totalPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Dish> getDishList() {
		return dishList;
	}

	public void setDishList(Set<Dish> dishList) {
		this.dishList = dishList;
	}
	
	
}
