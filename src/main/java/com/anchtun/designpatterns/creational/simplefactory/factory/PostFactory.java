package com.anchtun.designpatterns.creational.simplefactory.factory;

import com.anchtun.designpatterns.creational.simplefactory.model.BlogPost;
import com.anchtun.designpatterns.creational.simplefactory.model.NewsPost;
import com.anchtun.designpatterns.creational.simplefactory.model.Post;
import com.anchtun.designpatterns.creational.simplefactory.model.ProductPost;

// This class acts as a simple factory for creation of different posts on web site.
public class PostFactory {

	public static Post createPost(String type) {
		switch(type) {
		case "blog":
				return new BlogPost();
		case "news":
				return new NewsPost();
		case "product":
				return new ProductPost();
		default:
				throw new IllegalArgumentException("Post type is unown");	
		}
	}
	
}