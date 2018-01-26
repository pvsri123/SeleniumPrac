package javaPractice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTotextfile {

	public static void main(String[] args) {
		
		String textfile = "C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\out.txt";
		
		try 
		{
			PrintWriter outputStream = new PrintWriter(textfile);
			outputStream.println("Hi there, how are you!!!!");  // stores in RAM file
			outputStream.close(); // Flushes all the data to the file
			System.out.println("Done");
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}

}
