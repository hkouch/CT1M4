import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		double tot = 0, max = 0, min = 0;
		
		while (i < 5) {
			System.out.print("Enter your number: ");
			double x = scnr.nextDouble();
			tot += x;
			if (max <= x)
				max = x;
			if (min >= x || i == 0)
				min = x;
			i++;
		}
		
		System.out.println("\nYour total is " + tot);
		System.out.println("Your average is " + tot/5);
		System.out.println("Your maximum is " + max);
		System.out.println("Your minimum is " + min);
		System.out.println("Your interest is " + 0.2*tot);
		
		scnr.close();
	}
}
