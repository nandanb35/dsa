package com.boat.doublyLinkedList;

import com.boat.pojo.Employee;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}

		head = node;

		size++;
	}

	public void addToBack(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setPrevious(tail);

		if (tail == null) {
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public void removeFromFront() {

	}

	public void removeFromEnd() {

	}

	public void remove() {

	}

	public void print() {

		System.out.println("head -> " + head);

		EmployeeNode node = head;

		while (node.getNext() != null) {
			System.out.println(node);
			node = node.getNext();
		}

		System.out.println("tail -> " + tail);

	}

}
