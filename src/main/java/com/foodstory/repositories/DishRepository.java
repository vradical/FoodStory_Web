package com.foodstory.repositories;

import org.springframework.data.repository.CrudRepository;

import com.foodstory.domains.Dish;

public interface DishRepository extends CrudRepository<Dish, Long>{

}
