package practiceFriday;

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {
		double salary, yearsOnJob;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Annual salary is: ");
		salary= input.nextDouble();
		
		System.out.println("Enter the no. of years" + "in your current job");
		yearsOnJob= input.nextDouble();
		
		if(salary>=50000) {
			if(yearsOnJob >=2) {
			System.out.println("You qualify for the loan: ");	
			
			}
			else 
			{
			System.out.println("You must have been your " + "current job for at least " + "two years to qualify.");
			
			} 
		} else {
				System.out.println("You must earn at least " +"$50,000 per year to qualify.");
		}
		
	}
}


