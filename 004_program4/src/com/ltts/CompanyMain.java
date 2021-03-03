package com.ltts;

import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		
		String comName, teamLead, team;
		
		Company com = new Company();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the company name: "); 
		comName = ip.next();		
		System.out.println("Enter the employees: ");
		team = ip.next();		
		System.out.println("Enter teamLead: ");
		teamLead = ip.next();
		
		
		com.setName(comName);
		com.setEmployees(team);
		com.setTeamlead(teamLead);
		
		com.displayOutput();

	}
}
