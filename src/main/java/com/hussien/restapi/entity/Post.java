package com.hussien.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@Column(name = "post_id")
	private int postId;
	@Column(name = "post_title")
	private String postTitle;
	@Column(name = "post_body")
	private String postBody;

	public Post() {}

	public Post(int postId, String postTitle, String postBody) {
		this.postId = postId;
		this.postTitle = postTitle;
		this.postBody = postBody;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostBody() {
		return postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

}
