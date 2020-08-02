package practiceFriday;

import java.util.Scanner;

public class traingleSize {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the side of the traingle: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c= input.nextInt();
		
		if(a==b && b==c) {
			System.out.println("This is the equilateral traingle: ");
		}
		else if(a==b || b==c) {
			System.out.println("This is Isocles traingle: ");
		}
		else {
			System.out.println("This is scalene trainagle: ");
		}
	}

}
