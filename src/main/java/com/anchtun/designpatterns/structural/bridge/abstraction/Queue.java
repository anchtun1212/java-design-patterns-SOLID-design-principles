package com.anchtun.designpatterns.structural.bridge.abstraction;

import com.anchtun.designpatterns.structural.bridge.implementor.LinkedList;

import lombok.AllArgsConstructor;

// A refined abstraction.
@AllArgsConstructor
public class Queue<T> implements FifoCollection<T> {

	private LinkedList<T> list;

	@Override
	public void offer(T element) {
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}

}