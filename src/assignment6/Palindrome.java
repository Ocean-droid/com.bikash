package assignment6;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {

			System.out.println("Enter the word");
			String name = input.next();
			int s = 0;
			int e = name.length() - 1;
			boolean isPalindrome = true;
			while (s <e) {
				if (name.charAt(s) != name.charAt(e)) {
					isPalindrome = false;
					break;
				}
				s++;
				e--;
			}

			if (isPalindrome) {
				System.out.println("The given " + name + "is Palindrome");

			} else {
				System.out.println("The given " + name + " is not Palindrome");
			}
			System.out.println("press y/Y to continue");
			decision = input.next();
		} while (decision.equalsIgnoreCase("y"));
		System.out.println("Thank you bye bye");

		input.close();
	}
}
