package day29;

import java.io.File;

public class file4 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/biku/bi.txt";
	File file = new File(filePath);
	System.out.println(file.getAbsolutePath());
	System.out.println(file.getName());
	file.setWritable(true);
	
      
	}

}
