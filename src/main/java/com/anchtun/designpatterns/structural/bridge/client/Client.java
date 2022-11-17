package com.anchtun.designpatterns.structural.bridge.client;

import com.anchtun.designpatterns.structural.bridge.abstraction.FifoCollection;
import com.anchtun.designpatterns.structural.bridge.abstraction.Queue;
import com.anchtun.designpatterns.structural.bridge.implementor.SinglyLinkedList;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(5);
		collection.offer(12);
		collection.offer(22);
		collection.offer(13);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		
		System.out.println(collection.poll());
	}
}
