package com.ltts;

public class Company {
	private String name;
	private String employees;
	private String teamlead;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	private void teamLeadCheck(String[] arr, String teamLead) {
		boolean found = false;
		
		for(String x : arr) {
			if(x.equals(teamLead)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Name: "+(this.name));
			System.out.println("Employees: "+(this.employees));
			System.out.println("Lead: "+teamLead);
		} else {
			System.out.println("Invalid input");
		}
	}
	
	public void displayOutput() {
		String teamLead, team;
				
		team = this.getEmployees();
		String teamarr[] = team.split(",");
		teamLead = this.getTeamlead();	
		
		teamLeadCheck(teamarr, teamLead);
	}
}
