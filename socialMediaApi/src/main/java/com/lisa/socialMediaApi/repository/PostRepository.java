package com.lisa.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
