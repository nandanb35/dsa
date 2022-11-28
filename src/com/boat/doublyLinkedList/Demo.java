package com.boat.doublyLinkedList;

import com.boat.pojo.Employee;

public class Demo {

	public static void main(String[] args) {
		Employee michale = new Employee(123, "Michael", "Scott");
		Employee dwight = new Employee(234, "Dwight", "Schrute");
		Employee jim = new Employee(345, "Jim", "Halpert");
		Employee pam = new Employee(456, "Pam", "Beasly");
		Employee anjela = new Employee(789, "Angela", "Martin");
		Employee kevin = new Employee(890, "Kevin", "Malone");

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		list.addToFront(kevin);
		list.addToFront(michale);
		list.addToFront(jim);
		list.addToBack(pam);
		list.addToBack(anjela);
		list.addToBack(dwight);

		list.print();
		System.out.println("---> size ---> " + list.size());
		System.out.println("**** removing from front ***");

		list.removeFromFront();

		list.print();
		System.out.println("---> size ---> " + list.size());

		list.removeFromBack();

		System.out.println("**** removing from back ***");

		list.print();
		System.out.println("---> size ---> " + list.size());
	}

}
