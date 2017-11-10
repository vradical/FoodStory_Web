package com.foodstory.repositories;

import org.springframework.data.repository.CrudRepository;

import com.foodstory.domains.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
