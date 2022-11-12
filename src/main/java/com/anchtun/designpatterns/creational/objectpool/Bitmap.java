package com.anchtun.designpatterns.creational.objectpool;

import javafx.geometry.Point2D;
import lombok.AllArgsConstructor;
import lombok.Data;

// concrete reusable
@AllArgsConstructor
@Data
public class Bitmap implements Image {
	
    private Point2D location;
    
    // name on the disk
    private String name;
    
    public Bitmap(String name) {
        this.name = name;
    }

	@Override
	public void draw() {
		System.out.println("Drawing " + name + " At " + location);
	}

	@Override
	public void reset() {
		location = null;
		System.out.println("Bitmap is reset");
	}

}
