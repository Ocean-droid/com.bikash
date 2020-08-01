package assignmentnew;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Test ob = new Test();
		Scanner in = new Scanner(System.in);
			String decision= "";
		
		do {
			System.out.println("Here are  your choices");
			System.out.println(" 1.factorial \n2.highestScore \n3.everseNum \n4.sumandProduct \n5.isPrimenumber\n6.firstNthPrime\n7.allPrimebetween\n8.fibonacci\n9.pattern ");

 			System.out.println("Enter your choice");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number to get factorail");
				int n = in.nextInt();
				ob.factorial(n);
				break;

			case 2:
				System.out.println("enter the number of students");
				int numbb = in.nextInt();
				ob.highestScore(numbb);
				break;

			case 3:
				System.out.println("enter the number to be reversed");
				int nums = in.nextInt();
				ob.reverseNum(nums);
				break;
			case 4:
				System.out.println("enter the number");
				int num = in.nextInt();
				ob.sumandProduct(num);
				break;
			case 5:
				System.out.println("enter the number");
				int numb = in.nextInt();
				Test.isPrimenumber(numb);
				break;
			case 6:
				System.out.println("enter the number");
				int a= in.nextInt();
				Test.firstNthPrime(a);
				break;
				 
			case 7:
				System.out.println("entert the starting number");
				int s= in.nextInt();
				System.out.println("enter the ending number");
				int e = in.nextInt();
				Test.allPrimebetween(s,e);
				break;
			case 8:
				System.out.println("enter the count limit");
				int count = in.nextInt();
				Test.fibonacci(count);
				break;
				
			case 9:
				int p= 5;
				Test.pattern(p);
				
				
				
				default:
					System.out.println("Wrong Choice");
			}
			
System.out.println("do you want to continue? press y/Y to continue");
		decision= in.next();
		
		

			
		}while(decision.equalsIgnoreCase("y"));
		System.out.println("see you next time thank you");
	
			
		in.close();	
			
			
			
			}

}

