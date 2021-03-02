package com.ltts;

import java.util.Scanner;

public class activity_01 {
	
	public static void findElementCount(int a[], int n, int x) {
		int count=0, i = 0;
		for(i=0; i<n; i++) {
            if(a[i] == x) {
                count++;
            }
		}		
		System.out.println("So the total count is: "+count);
	}
	
	void inputFunc() {
		int n, x, i = 0;
		try {
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter the length of array: ");
			n = ip.nextInt();
			
			int a[] = new int[n];
			System.out.println("Enter the elements of array: ");
			for(i = 0; i<n; i++) {
				a[i] = ip.nextInt();
			}
			
			System.out.println("Enter the element to count: ");
			x = ip.nextInt();
			
			findElementCount(a, n, x);
			
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		
	}
	
	public static void main(String[] args) {
		activity_01 a1 = new activity_01();
		a1.inputFunc();		
	}
}
