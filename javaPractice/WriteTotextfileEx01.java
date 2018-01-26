package javaPractice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTotextfileEx01 {

	public static void main(String[] args) {
		
		String textfile = "C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\pattern.txt";
		
		try 
		{
			PrintWriter outputStream = new PrintWriter(textfile);
			for(int row=0;row<64;row++)
			{
				for(int col=0;col<64;col++)
				{
					if((row*col)%(row+1)==0)
					{
						outputStream.print("*");
					}
					else
					{
						outputStream.print(" ");
					}
				
				}
				
			}
			
			outputStream.close();
			System.out.println("Done...");
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
