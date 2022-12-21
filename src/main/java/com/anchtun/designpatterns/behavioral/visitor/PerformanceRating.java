package com.anchtun.designpatterns.behavioral.visitor;

import lombok.Data;

@Data
public class PerformanceRating {

	private int id;
	
	private int personalRating;
	
	private int teamAverageRating;
	
	private int finalRating;

	public PerformanceRating(int id, int personalRating) {
		this.id = id;
		this.personalRating = personalRating;
	}
	
}