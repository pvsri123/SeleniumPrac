package javaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExcelFileEx02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String ExcelPath = "C:\\Users\\Sreenivas\\workspace\\Day02\\Data\\Employeedetails.csv";
		
		File file = new File(ExcelPath);
		
		Scanner inputStream = new Scanner(file);
		
		while(inputStream.hasNext())
		{

			String values = inputStream.next();  // gets whole line
			String [] data  = values.split(",");
			
			 System.out.println(values);
			
		}
			
		inputStream.close();
	}

}
