package day29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file6 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/biku/bi.txt";

try(
		FileReader fr = new FileReader(filePath);
		BufferedReader br= new BufferedReader(fr);
		FileWriter fw = new FileWriter("/Users/bikashadhikari/Desktop/biku/biku.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
) {
	String len;
	while((len=br.readLine())!= null) {
		System.out.println(len);
		bw.write(len);
	}
	
	
	
} catch (IOException e) {
	e.printStackTrace();
}

	}

}
