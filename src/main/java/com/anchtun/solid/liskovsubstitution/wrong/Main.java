package com.anchtun.solid.liskovsubstitution.wrong;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println(rectangle.computeArea());
		Square square = new Square(5);
		System.out.println(square.computeArea());
		useRectangle(rectangle);
		useRectangle(square);
	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(15);
		rectangle.setWidth(20);
		System.out.println("Height = " + rectangle.getHeight());
		System.out.println("Width = " + rectangle.getWidth());
		//we have modified the behavior that is expected of the base class.
		//The only way to validate Liskov substitution principle is that we need to break 
		//this relationship (Square extends Rectangle), because even though geometrically
		//or mathematically it makes sense that square is a rectangle when it comes to object oriented programming,
		//that relationship is not really valid because it violates our contract offset height and width method
		//of rectangle class.
		if (rectangle.getHeight() != 15) {
			System.err.println("Height Not equal to 15");
		}
		if (rectangle.getWidth() != 20) {
			System.err.println("Width Not equal to 20");
		}
	}
}
