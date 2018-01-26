package datadrivenframewrk;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReaddataEx01 {

	public static void main(String[] args) throws BiffException, IOException {
		
		File InputFile1 = new File("C:\\Users\\Sreenivas\\Desktop\\SeleniumJavaPractice\\Emp.xls");
		
		Workbook wb1 = Workbook.getWorkbook(InputFile1);
		
		System.out.println("Number of sheets present in the work book:"+wb1.getNumberOfSheets());
		
		for(int s =0;s<=wb1.getNumberOfSheets()-1;s++){
			
			System.out.println(wb1.getSheet(s).getName());

			System.out.println("Number of rows data available is:"+wb1.getSheet(s).getRows());
			System.out.println("Number of columns data available is:"+wb1.getSheet(s).getColumns());
			
			for (int i=0; i < wb1.getSheet(s).getRows();i++)
			{
				for (int j=0; j< wb1.getSheet(s).getColumns(); j++)
				{
					System.out.print(wb1.getSheet(s).getCell(j,i).getContents()+"<=========>");
				}
				System.out.println();
			}
		}
				
		wb1.close();
	}
}


