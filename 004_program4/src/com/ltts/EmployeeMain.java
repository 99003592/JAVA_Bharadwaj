package com.ltts;

import java.util.Scanner;



public class EmployeeMain {
	
	public static void OutputDisplay(String name, String address, String mobile) {
		System.out.println("Employee Details:");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
	}
	
	
	public static void main(String[] args) {
		String n;
		String a;
		String m;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the name: ");
		n = ip.next();
		
		System.out.println("Enter the address: ");
		a = ip.next();
		
		System.out.println("Enter Mobile: ");
		m = ip.next();
		
		Employee em = new Employee();
		em.setName(n);
		em.setAddress(a);
		em.setMobile(m);
		
		String name = em.getName();
		String address = em.getAddress();
		String mobile = em.getMobile();
		
		OutputDisplay(name, address, mobile);
		
	}
}
