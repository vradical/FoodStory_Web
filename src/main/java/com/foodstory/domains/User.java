package com.foodstory.domains;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String fbLogin;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "user")
	private Set<OrderInfo> orderList;
	
	public User() {
		
	}
	
	public User(String name, String email, String phone, String address, String fbLogin) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.fbLogin = fbLogin;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFbLogin() {
		return fbLogin;
	}

	public void setFbLogin(String fbLogin) {
		this.fbLogin = fbLogin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Set<OrderInfo> getOrderList() {
		return orderList;
	}

	public void setOrderList(Set<OrderInfo> orderList) {
		this.orderList = orderList;
	}
	

}
