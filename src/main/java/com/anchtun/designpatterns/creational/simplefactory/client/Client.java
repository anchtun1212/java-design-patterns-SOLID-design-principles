package com.anchtun.designpatterns.creational.simplefactory.client;

import com.anchtun.designpatterns.creational.simplefactory.factory.PostFactory;
import com.anchtun.designpatterns.creational.simplefactory.model.Post;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	public static void main(String[] args) {
		Post newsPost = PostFactory.createPost("news");
		Post blogPost = PostFactory.createPost("blog");
		log.info("\n" + blogPost + "\n" + newsPost);
	}
}
