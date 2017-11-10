package com.foodstory.repositories;

import org.springframework.data.repository.CrudRepository;

import com.foodstory.domains.OrderInfo;


public interface OrderRepository extends CrudRepository<OrderInfo, Long>{

}
