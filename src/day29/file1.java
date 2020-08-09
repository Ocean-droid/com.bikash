package day29;

import java.io.File;
import java.io.IOException;

public class file1 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/bikubro/bikubro.txt";
File file = new File(filePath);
try { 
	if(file.createNewFile()) {
		System.out.println("New file is created");
	}else
	{
		System.out.println("opps!sorry file already exist");
		
	}
	
} catch (IOException e) {
	e.printStackTrace();
}
	}

}
