package com.ltts;

public class Innings {
	
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void displayInningsDetails() {
		
		String opStatement;
		int runsToWin = (this.runs)+1;
			
		System.out.println("Name: "+(this.teamname));
		System.out.println("Scored: "+(this.runs));
		
		switch(this.inningsname) {
		case "first":
			opStatement = "Need "+runsToWin+" to win.";
			System.out.println(opStatement);
			break;
		case "second":
			System.out.println("Match ended.");
			break;
		default:
			System.out.println("Invalid inputs");
		}
	}
}
