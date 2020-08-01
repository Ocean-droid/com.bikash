package assignment6;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = in.nextLine();
		int count = 0;
		String s2= new String();
		
		s = s.toLowerCase();// change into lower case
		String w[] = s.split(" ");// split into words
		for (int i = 0; i <= w.length; i++) {
			
			for (int j = i + 1; j < w.length; j++) {
				if (w[i].equals(w[j])) {
					count= count+1;
				s2= w[i];
				}

			}
		
			

		}if  (count >= 1)  {
			System.out.println("The duplicate word is " +s2);
		}else {
			System.out.println("There are no duplicate words");
		}
		in.close();
	}
}
