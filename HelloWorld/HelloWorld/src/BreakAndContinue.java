import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String[] args) {
		int n = 0;
		int number = 0;
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Let enter a integer number");
			System.out.print("Enter a number\t :\t");
			number = input.nextInt();
			System.out.println("You entered\t :\t" + number);
		} while (number >= 1000 || number <= 0);

		for (n = 0; 2 * n <= number; count++, n++) {
//			System.out.println("CurrentCount is: "+ count);
//			System.out.println("CurrentValue is: " + 2 * n);
			if (count == 2) {
				System.out.println("2nd even number is:\t" + 2 * n);
				break;
			}
		}
		System.out.println("Count is\t :\t" + count);
		System.out.println("############################");

		do {
			System.out.println("Let enter a integer number");
			System.out.print("Enter a number\t :\t");
			number = input.nextInt();
			System.out.println("You entered\t :\t" + number);
		} while (number >= 1000 || number <= 0);
		for (n = 0; n <= number; n++) {
			if (n == 2) {
				// System.out.println("2nd even number is:\t" + 2 * n);
				continue;
			}
			System.out.println("CurrentValue is: " + n);
		}
		input.close();
	}
	

}
