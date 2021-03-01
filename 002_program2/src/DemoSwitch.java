import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your birth month is number:");
		int month = ip.nextInt();
		
		switch(month) {
		case 1: System.out.println("You were born in January");
				break;
		case 2: System.out.println("You were born in February");
				break;
		case 3: System.out.println("You were born in March");
				break;
		case 4: System.out.println("You were born in April");
				break;
		case 5: System.out.println("You were born in May");
				break;
		case 6: System.out.println("You were born in June");
				break;
		case 7: System.out.println("You were born in July");
				break;
		case 8: System.out.println("You were born in August");
				break;
		case 9: System.out.println("You were born in September");
				break;
		case 10: System.out.println("You were born in October");
				break;
		case 11: System.out.println("You were born in November");
				break;
		case 12: System.out.println("You were born in December");
				break;
		default: System.out.println("It was an invalid month");
		}
	}
}
