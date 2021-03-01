import java.util.Scanner;

public class DemoNestedIf {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your trip budget:");
		int budget = ip.nextInt();
		
		if (budget < 5000) {
			if (budget >1500) {
				System.out.println("You can visit a near by tourist place.");
			}
			else {
				System.out.println("Better you stay at home.");
			}
		}
		else {
			System.out.println("You can make a trip to Goa.");
		}
	}
}
