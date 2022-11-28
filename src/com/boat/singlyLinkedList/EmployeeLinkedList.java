package com.boat.singlyLinkedList;

import com.boat.pojo.Employee;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size = 0;

	public void addToFront(Employee employee) {

		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;

	}

	public Employee removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedEmployee = head;
		head = head.getNext();
		size--;
		return removedEmployee.getEmployee();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		return "EmployeeLinkedList [head=" + head + "]";
	}

}
