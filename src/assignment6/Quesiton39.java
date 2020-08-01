package assignment6;

import java.util.Scanner;

public class Quesiton39 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = input.nextLine();

		String[] arr = name.split("  ");
		int l = name.length();
		for (int i = 0; i < l - 1; i++) {
			System.out.println(arr[i].charAt(0) + " ");
		}
	
	input.close();
	}

}
