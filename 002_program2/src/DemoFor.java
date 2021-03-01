import java.util.Scanner;

public class DemoFor {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter any number:");
		int len = ip.nextInt();
		
		for (int i = 0; i<=len; i++) {
			System.out.println("Hello");
		}		
	}
}
