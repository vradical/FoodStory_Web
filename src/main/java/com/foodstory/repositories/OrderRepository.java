package com.foodstory.repositories;

import org.springframework.data.repository.CrudRepository;

import com.foodstory.domains.Order;


public interface OrderRepository extends CrudRepository<Order, Long>{

}
