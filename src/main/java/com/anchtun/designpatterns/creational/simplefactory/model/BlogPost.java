package com.anchtun.designpatterns.creational.simplefactory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class BlogPost extends Post {
	private String author;
	private String[] tags;
}