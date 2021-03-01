import java.util.Scanner;

public class Demoifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your battery percentage:");
		int bat = sc.nextInt();
		
		if (bat<50) {
			System.out.println("Your phone needs charging");
		}
		else {
			System.out.println("Your phone is good to go.");
		}	
	}
}
