package com.anchtun.solid.liskovsubstitution.wrong;

//So Square class is extending from Rectangle class, but Square has all of its sides of the same length.
public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	@Override
	public void setHeight(int height) {
		setSide(height);
	}

	public void setSide(int side) {
		super.setWidth(side);
		super.setHeight(side);
	}
}
