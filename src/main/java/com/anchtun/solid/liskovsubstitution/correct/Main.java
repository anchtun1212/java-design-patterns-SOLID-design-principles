package com.anchtun.solid.liskovsubstitution.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		log.info("" + rectangle.computeArea());
		Square square = new Square(5);
		log.info("" + square.computeArea());
	}
}
