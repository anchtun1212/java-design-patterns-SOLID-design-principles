package com.anchtun.designpatterns.behavioral.iterator.client;

import com.anchtun.designpatterns.behavioral.iterator.Iterator;
import com.anchtun.designpatterns.behavioral.iterator.ThemeColor;

public class Client {

	public static void main(String[] args) {
		Iterator<ThemeColor> iter = ThemeColor.getIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}