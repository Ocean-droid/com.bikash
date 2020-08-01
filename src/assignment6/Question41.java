package assignment6;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter a word");
String n= input.next();
int l = n.length()-1;
char a= ' ';
for (int i = 0; i<l; i++) {
	for(int j=i+1; j<l;j++) {
		System.out.println(n.charAt(j));
		if (n.charAt(i)==n.charAt(j)) {
		a= n.charAt(j);
		
	
	}

	}



	
}
System.out.println("The repeated letter in the given word is: "+ a);input.close();
	}

}
