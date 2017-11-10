package com.foodstory.domains;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hawker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	private String phone;
	private double addLat;
	private double addLong;
	private String website;
	private String description;
	private String coverPhoto;
	private boolean store;
	private boolean delivery;

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "dish")
	private Set<Dish> dishList;
	
	public Hawker() {
		
	}
	
	public Hawker(String name, String email, String phone, double addLat, double addLong, String website,
			String description, String coverPhoto, boolean store, boolean delivery) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addLat = addLat;
		this.addLong = addLong;
		this.website = website;
		this.description = description;
		this.coverPhoto = coverPhoto;
		this.store = store;
		this.delivery = delivery;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAddLat() {
		return addLat;
	}

	public void setAddLat(double addLat) {
		this.addLat = addLat;
	}

	public double getAddLong() {
		return addLong;
	}

	public void setAddLong(double addLong) {
		this.addLong = addLong;
	}

	public String getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public boolean isStore() {
		return store;
	}

	public void setStore(boolean store) {
		this.store = store;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public Set<Dish> getDishList() {
		return dishList;
	}

	public void setDishList(Set<Dish> dishList) {
		this.dishList = dishList;
	}
	
}
