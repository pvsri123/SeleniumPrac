package datadrivenframewrk;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReaddataEx {
	
	public static void main(String[] args) throws BiffException, IOException {
		
		// To read values from Excel Sheet
		// To specify file path
		
		File InputFile = new File("C:\\Users\\Sreenivas\\Desktop\\SeleniumJavaPractice\\TestFile.xls");
				
		// to get workbook
				
		Workbook wb = Workbook.getWorkbook(InputFile);
		
		// to get worksheet from workbook
		
		Sheet ws = wb.getSheet("User Name");
		
		// to find number of rows and columns of data available
		System.out.println("Number of rows data available is:"+ws.getRows());
		System.out.println("Number of columns data available is:"+ws.getColumns());
				
		for (int i=0; i < ws.getRows();i++){
			for (int j=0; j< ws.getColumns(); j++){
				System.out.print(ws.getCell(j,i).getContents()+"<=========>");
			}
			System.out.println();
		}
		wb.close();
	}

}
