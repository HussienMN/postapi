package com.hussien.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hussien.restapi.entity.Post;
import com.hussien.restapi.repository.PostRepository;

@Service
public class PostsService {

	@Autowired
	private PostRepository postRepo;

	public List<Post> getPosts() {
		List<Post> postList = new ArrayList<>();
		for(Post post: postRepo.findAll()) {
			postList.add(post);
		}
		return postList;
	}

	public Post getPost(int postId) {
		return postRepo.findById(postId).get();
	}

	public void addPost(Post post) {
		postRepo.save(post);
	}

	public void updatePost(Post post) {
		postRepo.save(post);
	}

	public void deletePost(int postId) {
		postRepo.deleteById(postId);
	}

}
