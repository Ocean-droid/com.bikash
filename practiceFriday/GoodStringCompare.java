package practiceFriday;

import java.util.Scanner;

public class GoodStringCompare {
public static void main(String[] args) {
	
	String name1, name2, name3;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter name1:");
	name1= input.nextLine();
	System.out.println("Enter name2: ");
	name2= input.nextLine();
	System.out.println("Enter name3: ");
	name3= input.nextLine();
	
	//First compare name1 and name2
	if(name1.equals(name2)) {
		System.out.println(name1 + " and " +name2+ "are the same.");
	}
	else {
		System.out.println(name1 + " and " +name2+ "are NOT the same. ");
	}
	if(name1.equals(name3)) {
		System.out.println(name1 + " and " +name3+ "are the same. ");
	}
	else {
		System.out.println(name1 + " and " +name3+ "are NOT the same.");
	}
}
}
