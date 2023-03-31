package com.hussien.restapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hussien.restapi.entity.Post;
import com.hussien.restapi.service.PostsService;

@RestController
public class PostsController {

	@Autowired
	private PostsService postService;
	
	public PostsController(PostsService postService) {
		this.postService = postService;
	}

	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return postService.getPosts();
	}

	@RequestMapping("/posts/{postId}")
	public Post getPost(@PathVariable int postId) {
		return postService.getPost(postId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post post) {
		postService.addPost(post);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/posts")
	public void updatePost(@RequestBody Post post) {
		postService.updatePost(post);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{postId}")
	public void deletePost(@PathVariable int postId) {
		postService.deletePost(postId);
	}
}
