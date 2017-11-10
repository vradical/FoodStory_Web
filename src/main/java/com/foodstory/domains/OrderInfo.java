package com.foodstory.domains;

import java.util.Date;
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
public class OrderInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date dateTime;
	private double totalPrice;
	
	@ManyToOne
	private User user;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "order_dish")
	private Set<Dish> dishes;
	
	public OrderInfo() {
	}
	
	public OrderInfo(Date dateTime, double totalPrice) {
		this.dateTime = dateTime;
		this.totalPrice = totalPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
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

	public Set<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}
	
}
