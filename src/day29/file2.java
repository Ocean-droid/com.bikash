package day29;

import java.io.File;

public class file2 {

	public static void main(String[] args) {
String filePath = "/Users/bikashadhikari/Desktop/bikubro";
File file= new File(filePath);
if(file.mkdir()) {
	System.out.println("Directory is created");

}
else
{
	System.out.println("Opps!! Directiory already exist");
}
	}

}
