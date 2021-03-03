package com.ltts;

import java.util.Scanner;

public class InningsMain {
	
	public static void main(String[] args) {
		
		String team, session;
		int runs;
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the teamname: ");
		team = ip.next();
		
		System.out.println("Enter the session: ");
		session = ip.next();
		
		System.out.println("Enter the runs: ");
		runs = ip.nextInt();
		
		Innings in = new Innings();
		in.setTeamname(team);
		in.setInningsname(session);
		in.setRuns(runs);
		
		in.displayInningsDetails();
	}
}
