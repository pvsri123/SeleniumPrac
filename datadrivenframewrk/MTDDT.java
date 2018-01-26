package datadrivenframewrk;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MTDDT {

	// import org.openqa.selenium.WebDriver;
	
	WebDriver driver;
	
	public  void setUp(){
		
		// to initiate the browser
		
		// import org.openqa.selenium.firefox.FirefoxDriver;
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
	}
	public void userReg() throws BiffException, IOException, InterruptedException{
		// to register in the browser
		// to get the file 
		// import java.io.File;
		
		File fi = new File("C:\\Users\\Sreenivas\\Desktop\\SeleniumJavaPractice\\MTReg.xls");
	
		//import jxl.Workbook;
		//import jxl.read.biff.BiffException;
				
		Workbook wb = Workbook.getWorkbook(fi);
		
		// import jxl.Sheet;
		Sheet ws= wb.getSheet("TESTDATA");
		
		// to get the  rows and  columns
		
		for(int i=1;i<ws.getRows();i++){
			
				
				driver.findElement(By.linkText("REGISTER")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.name("firstName")).sendKeys(ws.getCell(0, i).getContents());
				driver.findElement(By.name("lastName")).sendKeys(ws.getCell(1, i).getContents());
				driver.findElement(By.name("phone")).sendKeys(ws.getCell(2, i).getContents());
				driver.findElement(By.name("userName")).sendKeys(ws.getCell(3, i).getContents());
				driver.findElement(By.name("address1")).sendKeys(ws.getCell(4, i).getContents());
				driver.findElement(By.name("city")).sendKeys(ws.getCell(5, i).getContents());
				driver.findElement(By.name("state")).sendKeys(ws.getCell(6, i).getContents());
				driver.findElement(By.name("postalCode")).sendKeys(ws.getCell(7, i).getContents());
				
				new Select(driver.findElement(By.name("country"))).selectByVisibleText(ws.getCell(8,i).getContents());
				
				driver.findElement(By.name("email")).sendKeys(ws.getCell(9, i).getContents());
				driver.findElement(By.name("password")).sendKeys(ws.getCell(10, i).getContents());
				driver.findElement(By.name("confirmPassword")).sendKeys(ws.getCell(11, i).getContents());
						
				driver.findElement(By.name("register")).click();
				Thread.sleep(3000);
				
				
				driver.findElement(By.linkText("Home")).click();
		}
			
	}
	
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		
	}
	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
		MTDDT ddt = new MTDDT();
		ddt.setUp();
		ddt.userReg();
		ddt.tearDown();

	}

}
