package com.ltts;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		
		String details;
		
		Scanner ip = new Scanner(System.in);
		
		Customer cus = new Customer();
	
		
		System.out.println("Enter the details: ");
		details = ip.next(); 
		String arr[] = details.split(",");
		
		cus.setName(arr[0]);
		cus.setAddress(arr[1]);
		cus.setMobile(arr[2]);
		
		String name= cus.getName();
		String address= cus.getAddress();
		String mobile= cus.getMobile();
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
	}
}
