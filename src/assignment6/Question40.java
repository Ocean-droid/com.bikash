package assignment6;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the nume");
String n = input.next();

int l = n.length();

for (int j=l-1; j>=0;j--) {
	System.out.print(n.charAt(j));
}
	}

}
