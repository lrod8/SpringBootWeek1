package com.lisa.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
	
}
