package com.lisa.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.lisa.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
