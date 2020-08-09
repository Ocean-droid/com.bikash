package day29;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file5 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/biku/bi.txt";
try (FileReader fr= new FileReader(filePath);
		FileWriter fw= new FileWriter("/Users/bikashadhikari/Desktop/biku/bik1.txt");
		
		){
	int len;
	while((len=fr.read())!=-1) {
		System.out.println(len);
		fw.write(len);
		
		
	}
	
} catch (IOException e) {
	e.printStackTrace();
}

	}

}
