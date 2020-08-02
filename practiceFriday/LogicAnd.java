package practiceFriday;

import java.util.Scanner;

public class LogicAnd {
public static void main(String[] args) {
	
	double salary, yearsOnJob;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Get the annaual salary: ");
	salary= input.nextDouble();
	System.out.println("Enter the number of years " + "at your current job: ");
	yearsOnJob= input.nextDouble();
	
	if(salary >= 50000 && yearsOnJob >=2) {
		System.out.println("You are qualify for the loan.");
	}
	else {
		System.out.println("You dont qualify for the loan.");
	}
}
}
