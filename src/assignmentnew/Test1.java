 package assignmentnew;

import java.util.Scanner;

public class Test1 {
	public void factorial(int n) {
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp = temp * i;
		}
		System.out.println("The factorial of the given number is " + temp);

	}

	public void highestScore(int num ) {
		String name1 = "";
		int score1 = 0;
		Scanner input = new Scanner(System.in);
        for (int i = 1; i <=num; i++) {
        
			System.out.println("enter your name");
			String name = input.nextLine();
			System.out.println("enter your score");
			int score = input.nextInt();
			input.nextLine();
			if (score >score1) {
				score1 = score;
				name1 = name;
			}
		}
		System.out.println("Student to get the highest score" + score1 + "is " + name1);
		input.close();
		
	}

	public void reverseNum(int nums) {
		int rev = 0;
		while (nums != 0) {
			rev = rev * 10 + nums % 10;
			nums = nums / 10;
		}
		System.out.println("the reverse num is " + rev);
	}

	public void sumandProduct(int num) {
		int rev = 0;
		int mul = 1;
		int sum = 0;
		while (num > 0) {
			rev = num % 10;
			mul = mul * rev;
			sum = sum + rev;
			num= num/10;
		}
		System.out.println("the sum of the each digit is" + sum);
		System.out.println("the multipication of each digit is " + mul);

	}

	public static  boolean isPrimenumber(int numb) {
		System.out.println("enter the number");
		
		boolean prime = true;
		if (numb==0 || numb== 1) {
			prime= false;
			return prime;
		}
		for (int i = 2; i <= numb/2; i++) {
			if (numb % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime ==true) {
			System.out.println("its a prime number");
		} else {
			System.out.println("its not a prime number");

		}
		return prime;
		

	}
	public static  void firstNthPrime(int a) {
		int num=1;
		int i, count;
		count = 0;
		while (count < a) {
			num = num+1;
			for ( i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count = count+1;
			}
		}
		System.out.println("the nth prime number is"+num);	

	}
	
	public static void allPrimebetween(int s, int e)	{
		int count = 0 ,i,j;
		for (i = s; i < e; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 0;
					break;
				} else {
					count = 1;
					

				}

			}
			if ( count == 1) {
				System.out.println(i);
			}
		}
	
		
	}
		
	public static void fibonacci(int c) {
		int n1=1, n2=1, n3 = 0;
		System.out.print(n1+ " " +n2);
		for (int i=2;i<c;i++) {
		n3= n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3; 
		}
	}
		
		public static void pattern(int p) {
			int i,j;
			for(i=1;i<=p; i++) {
				for (j=1; j<=i; j++) {
					System.out.print(j + " ");
					
				}
				System.out.println();
			}
			
		}
	
	public static void main(String[] args) {
		Test1 ob = new Test1();
		Scanner in = new Scanner(System.in);
			String decision= "";
		
		do {
			System.out.println("Here are  your choices");
			System.out.println(" factorial \nhighestScore \nreverseNum \nsumandProduct \nisPrimenumber\nfirstNthPrime\nallPrimebetween\nfibonacci\npattern ");

			System.out.println("Enter your choice");
			String choice = in.next();
			switch (choice) {
			case "factorial":
				System.out.println("Enter the number to get factorail");
				int n = in.nextInt();
				ob.factorial(n);
				break;

			case "highestScore":
				System.out.println("enter the number of students");
				int numbb = in.nextInt();
				ob.highestScore(numbb);
				break;

			case "reverseNum":
				System.out.println("enter the number to be reversed");
				int nums = in.nextInt();
				ob.reverseNum(nums);
				break;
			case "sumandProduct":
				System.out.println("enter the number");
				int num = in.nextInt();
				ob.sumandProduct(num);
				break;
			case "isPrimenumber":
				System.out.println("enter the number");
				int numb = in.nextInt();
				isPrimenumber(numb);
				break;
			case "firstNthPrime":
				Scanner i = new Scanner(System.in);
				System.out.println("enter the number");
				int a= i.nextInt();
				firstNthPrime(a);
				break;
				
			case "allPrimebetween":
				System.out.println("entert the starting number");
				int s= in.nextInt();
				System.out.println("enter the ending number");
				int e = in.nextInt();
				allPrimebetween(s,e);
				break;
			case "fibonacci":
				System.out.println("enter the count limit");
				int count = in.nextInt();
				fibonacci(count);
				break;
				
			case"pattern":
				int p= 5;
				pattern(p);
				
				
				
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
