package assignment6;

public class Question37 {
	

	

public static void Info() {
	int [][] arr= new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
	for (int i=0; i<arr.length; i++) {
		for(int j=0;j<arr.length; j++) {
		System.out.print(arr[i][j]+ " \t");
		
	}System.out.println("\t");
	}
	
	int [] [] ar= new int [][] {{4,5,6}, {2,7,8}, {3,1,9}};
	System.out.println();
	for (int i=0; i<ar.length; i++) {
	for(int j=0;j<ar.length; j++) {
		System.out.print(ar[i][j]+ "\t ");
		}
 
	System.out.println("\t");
	}
	System.out.println("\t");
	int [][] crr= new int [3][3];

	for (int i=0; i<crr.length; i++) {
		for(int j=0;j<crr.length; j++) {
			 crr[i][j]= arr[i][j] + ar[i][j];
		System.out.print(crr[i][j]+ "\t ");
}	
		System.out.println("\t");	}
	 }
	
	

	public static void main(String[] args) {

	 Info();

System.out.println();



}


}
