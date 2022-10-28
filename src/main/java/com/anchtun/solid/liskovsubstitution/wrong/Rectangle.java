package com.anchtun.solid.liskovsubstitution.wrong;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {

	protected int width;
	protected int height;

	protected int computeArea() {
		return width * height;
	}
}
