package datadrivenframewrk;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataEx {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		// Write data to Excel sheet at the time of execution and it is called parameterization
		// To specify file path
		
		File OutputFile = new File("C:\\Users\\Sreenivas\\Desktop\\SeleniumJavaPractice\\TestFile.xls");
		
		// to create workbook
		
		WritableWorkbook wb = Workbook.createWorkbook(OutputFile);
		
		//to specify worksheet
		
		//Worksheet number starts with the Index Zero
		
		WritableSheet ws = wb.createSheet("User Name", 0);
		
		// to specify the data to enter
		
		 // (Column,row):(0,0)
		
		Label cell1 = new Label(0,0,"Name");
		ws.addCell(cell1);
		
		 // (Column,row):(1,0)
		
		Label cell2 = new Label(1,0,"Course");
		ws.addCell(cell2);
		
		Label cell3 = new Label(0,1,"Sreenivas");
		ws.addCell(cell3);
		Label cell4 = new Label(1,1,"Selenium");
		ws.addCell(cell4);
		
		Label cell5 = new Label(0,2,"Shraddha");
		ws.addCell(cell5);
		Label cell6 = new Label(1,2,"QTP");
		ws.addCell(cell6);
		Label cell7= new Label(0,3,"Pavani");
		ws.addCell(cell7);
		
		Label cell8= new Label(1,3,"Soapui Testing");
		ws.addCell(cell8);
		
		
		Label cell9= new Label(0,4,"Sharma");
		ws.addCell(cell9);
		Label cell10= new Label(1,4,"Java");
		ws.addCell(cell10);
		wb.write();
		wb.close();
		
	}

}
