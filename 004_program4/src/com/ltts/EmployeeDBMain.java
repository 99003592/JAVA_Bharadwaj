package com.ltts;

import java.util.*;

public class EmployeeDBMain {
	
	public static void main(String[] args) {
		EmployeeDB em = new EmployeeDB();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		em.setName(ip.next());
		System.out.println("Enter Address: ");
		em.setAddress(ip.next());
		System.out.println("Enter mobile: ");
		em.setMobile(ip.next());
			
		System.out.println("Employee Details");
		System.out.println("Name: "+em.getName());
		System.out.println("Address: "+em.getAddress());
		System.out.println("Mobile: "+em.getMobile());
		
		System.out.println("Verify and Update the details:\nMenu");
		System.out.println(
				"1. Update Employee name"+"\n"+
				"2. Update Employee Address"+"\n"+
				"3. Update Employee mobile"+"\n"+
				"4. All information correct/Exit"
				);
		String resp = ip.next();
		
		switch(resp){
			case "1":
				System.out.println("Current name is: "+em.getName());
				System.out.println("Enter the name: ");
				em.setName(ip.next());
				System.out.println("Employee Details");
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Mobile: "+em.getMobile());
				break;
			case "2":
				System.out.println("Current address is: "+em.getAddress());
				System.out.println("Enter the address: ");
				em.setAddress(ip.next());
				System.out.println("Employee Details");
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Mobile: "+em.getMobile());
				break;
			case "3":
				System.out.println("Current mobile is: "+em.getMobile());
				System.out.println("Enter the mobile: ");
				em.setMobile(ip.next());
				System.out.println("Employee Details");
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Mobile: "+em.getMobile());
				break;
			case "4":
				System.out.println("Employee Details");
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Mobile: "+em.getMobile());
				break;
			default:
				System.out.println("Employee Details");
				System.out.println("Name: "+em.getName());
				System.out.println("Address: "+em.getAddress());
				System.out.println("Mobile: "+em.getMobile());				
		}
	}
}
