package practiceFriday;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		double score1,score2,score3,average;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("This program avergaes" + "3 test score: ");
		
		System.out.println("Enter the score1 #.");
		score1= input.nextDouble();
		
		System.out.println("Enter the score2 #. ");
		score2= input.nextDouble();
		
		System.out.println("Enter the score3 #.");
		score3= input.nextDouble();
		
		average=(score1 +score2 +score3 ) /3;
		
		System.out.println("The average is: " +average);
		
		if(average>95) {
			System.out.println("Thats the good score: ");
		}
		
	}	

	}


