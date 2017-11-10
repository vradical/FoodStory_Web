package com.foodstory.repositories;

import org.springframework.data.repository.CrudRepository;

import com.foodstory.domains.Hawker;

public interface HawkerRepository extends CrudRepository<Hawker, Long> {

}
