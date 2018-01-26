package javaPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTotextfileEx02 {

	public static void main(String[] args) throws IOException {
		
		File textfile = new File("out1.txt"); // created a file object called textfile
	//	File textfile =  new File("C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\out1.txt");
		
		FileWriter fw = new FileWriter(textfile,true); //created FileWriter object called fw
		PrintWriter pw = new PrintWriter(fw); //created PrintWriter object called pw
		
		pw.println("Line1");
		pw.println("Line2");
		pw.println("Line3");
		
		pw.close();
		
	}

}
