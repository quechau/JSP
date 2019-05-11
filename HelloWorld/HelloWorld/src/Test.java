import java.util.Scanner;

class MyClass {
	public static void main(String[] args) {
		int n = 0;
		int number = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Let's enter a integer number");
			System.out.print("Enter a number\t :\t");
			number = input.nextInt();
			System.out.println("You entered\t :\t" + number);
		} while (number >= 1000 || number <= 0);
	
//		do {
//			//System.out.println("Your even numbers: \t" + 2 * n);
//			count++;
//			n++ ;
//		} while (2 * n < number);
//		System.out.println("Count is\t :\t" + count);

		for (n = 0; 2 * n < number; count++, n++) {
			System.out.println("Counting");
		}
		System.out.println("Count is\t :\t" + count);
		System.out.print("Enter a number\t :\t");
		number = input.nextInt();
		System.out.println("You entered\t :\t" + number);
		input.close();
		
		

	}
}
