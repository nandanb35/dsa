package com.boat.singlyLinkedList;

import com.boat.pojo.Employee;

public class Demo {

	public static void main(String[] args) {

		Employee michale = new Employee(123, "Michael", "Scott");
		Employee dwight = new Employee(234, "Dwight", "Schrute");
		Employee jim = new Employee(345, "Jim", "Halpert");
		Employee pam = new Employee(456, "Pam", "Beasly");

		EmployeeLinkedList list = new EmployeeLinkedList();

		System.out.println(list.isEmpty());

		list.addToFront(michale);
		list.addToFront(dwight);
		list.addToFront(pam);
		list.addToFront(jim);

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		System.out.println(list.removeFromFront());
		System.out.println(list);
		System.out.println(list.size());
	}

}
