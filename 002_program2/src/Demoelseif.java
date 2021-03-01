import java.util.Scanner;

public class Demoelseif {
	public static void main(String[] args) {
		Scanner rp = new Scanner(System.in);
		System.out.println("Enter the purchased item price:");
		int price = rp.nextInt();
		
		if (price < 500) {
			System.out.println("It was good purchase.");
		}
		else if (price < 1000) {
			System.out.println("The purchase was a bit heavy on budget.");
		}
		else {
			System.out.println("The purchase was too much.");
		}
	}
}
