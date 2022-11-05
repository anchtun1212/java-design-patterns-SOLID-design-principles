package com.anchtun.designpatterns.creational.simplefactory.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class NewsPost extends Post{
	private String headline;
	private LocalDate newsTime;
}
