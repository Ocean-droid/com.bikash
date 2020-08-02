package practiceFriday;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		int number1, number2;
		double quotient;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		number1= input.nextInt();
		System.out.println("Enter number2: ");
		number2= input.nextInt();
		
		if (number2==0) {
			System.out.println("Divisible is not possible:");
			System.out.println("Please run the program again and ");
			System.out.println("Enter a number other than zero.");
			
		}
		else {
			quotient= (double) number1/ number2;
			System.out.println("The quotient of " +number1);
			System.out.println("divided by "+number2);
			System.out.println("is" +quotient);
		}
	}

}
