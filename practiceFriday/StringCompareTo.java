package practiceFriday;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		
		String name1, name2;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the name1:");
		name1= input.nextLine();
		System.out.println("Enter the name2: ");
		name2= input.nextLine();
		
		
		if(name1.compareTo(name2) < 0) {
			System.out.println(name1+ "is less than" +name2);
			
			
		}
		else if(name1.compareTo(name2)==0) {
			System.out.println(name1+ " is equals to " +name2);
			
		}
		
		else if(name1.compareTo(name2) > 0) {
			System.out.println(name1+ "is greater than " +name2);
		}
		
	}

}
