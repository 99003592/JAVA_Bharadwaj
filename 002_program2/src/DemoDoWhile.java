import java.util.Scanner;

public class DemoDoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10:");
		int num = ip.nextInt();
		do {
			System.out.println("learning java");
			num--;
		} while(num>0);
		
	}
}
