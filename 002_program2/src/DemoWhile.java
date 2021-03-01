import java.util.Scanner;

public class DemoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Give any number from 1 to 10:");
		int guess = ip.nextInt();
		while(guess <= 10) {
			System.out.println("Hello!");
			guess++;
		}
	}
}
