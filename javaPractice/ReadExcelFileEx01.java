package javaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExcelFileEx01 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		String ExcelPath ="C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\Marks.csv";
		
		File file = new File(ExcelPath); // read the excel file into "file" object
		
		Scanner inputStream = new Scanner(file);
		inputStream.next();  // ignores the first line that is titles line in this case
		double sum=0;
		double numberOfSubjects=0;
		double totalmarks=500;
		
		while(inputStream.hasNext())
		{
			
			String values = inputStream.next();  // gets whole line
			String [] data  = values.split(",");
																					
			double marks = Double.parseDouble(data[1]);
			sum += marks;
			numberOfSubjects++;
			 
		  System.out.println(values);
		  // System.out.println(marks);
		//	System.out.println(data[1]);
							
		}
		 
		inputStream.close();
					
		 System.out.println("Average of marks="+sum/numberOfSubjects);
		 System.out.println("Percentage of marks="+((sum/totalmarks)*100));

	}

}
