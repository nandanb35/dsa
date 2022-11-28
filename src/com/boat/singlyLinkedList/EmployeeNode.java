package com.boat.singlyLinkedList;

import com.boat.pojo.Employee;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "==>EmployeeNode [employee=" + employee + ", next=" + next + "]";
	}

}
