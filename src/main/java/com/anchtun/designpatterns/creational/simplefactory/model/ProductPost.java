package com.anchtun.designpatterns.creational.simplefactory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class ProductPost extends Post{
	private String imageUrl;
	private String name;
}
