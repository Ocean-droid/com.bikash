package practiceFriday;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
double salary, yearsOnJob;

Scanner input= new Scanner(System.in);

System.out.println("Enter the annual salary: ");
salary= input.nextDouble();

System.out.println("Enter the numers of years" + "you worked at your current job.");
yearsOnJob= input.nextDouble();

if(salary >=50000 || yearsOnJob >=2) {
	System.out.println("You qualify for the loan. ");
	
}
else
{
	System.out.println("you do not qualify.");
}

	}

}
