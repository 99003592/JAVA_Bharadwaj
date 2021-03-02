package com.ltts;

import java.util.Scanner;

public class activity_02 {
	
	static int len, xscore, count=0, index = 0;
	static int[] cricketer = new int[10];
		
	void findCricketerId(int ckt[], int size, int score) {
		for(int i=1;i<size;i=i+2) {
			if(ckt[i]>score) {
				cricketer[index]=ckt[i-1];
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		int i,j;
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		len = ip.nextInt();
		
		int ckt[] = new int[len];
		System.out.println("Enter the cricketer id and score after that: ");
		for(i =0; i < len; i++) {
			ckt[i] = ip.nextInt();
		}
		
		System.out.println("Enter the threshold score: ");
		xscore = ip.nextInt();
		
		activity_02 obj1 = new activity_02();
		obj1.findCricketerId(ckt, len, xscore);
		
		for(j=0; j<index; j++) {
			System.out.println(cricketer[j]);
		}

		
	}
}
