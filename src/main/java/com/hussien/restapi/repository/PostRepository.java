package com.hussien.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.hussien.restapi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
