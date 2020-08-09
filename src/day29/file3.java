package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file3 {

	public static void main(String[] args) {
		String filePath = "/Users/bikashadhikari/Desktop/bikubro/bikubro.txt";

try(FileInputStream fis= new FileInputStream(filePath);
		FileOutputStream fos= new FileOutputStream("/Users/bikashadhikari/Desktop/biku/bi.txt");
		) {
	int len;
	while((len=fis.read())!=-1){
		System.out.println(len);
		fos.write(len);
	}
	
} catch (IOException e1) {
	e1.printStackTrace();
}


				

	}

}
