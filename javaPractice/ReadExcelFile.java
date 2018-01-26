package javaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExcelFile {

	public static void main(String[] args) {
		
		String ExcelPath ="C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\Marks.csv";
		
		File file = new File(ExcelPath); // read the excel file into file object
		
		double sum=0;
		double numberOfSubjects=0;
		
		try 
		{
			Scanner inputStream = new Scanner(file);
			inputStream.next(); // ignore the first line that is tiles line in this case
			 
			while(inputStream.hasNext())
			{
				
				String values = inputStream.next();
				String [] data  = values.split(",");
																									
				double marks = Double.parseDouble(data[1]);
				sum += marks;
				numberOfSubjects++;
				
			  System.out.println(values);
			
			  //  System.out.println(marks);
			  
			 //	System.out.println(data[1]);
				
						
			}
			
			inputStream.close();
			
			 System.out.println("Average of marks="+sum/numberOfSubjects);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
