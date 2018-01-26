package configurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniumChrome {
	
	ConfigReader config;
	
	
	@BeforeTest
	public void setup(){
		 
		config = new ConfigReader();
		 System.setProperty("Webdriver.Chorme.driver",config.getChromePath());
		 System.out.println("======Setup Ready======");
	}
		 
	
	@Test
	public void testChrome() throws Exception
	{
		
		 				
		/*File src =new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro= new Properties();
		pro.load(fis);
		String Chromepath = pro.getProperty("ChromeDriver");
		System.out.println("Hey Chrome path is ==="+Chromepath);*/
		
				
		 System.out.println("======Test Started======");	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	driver.get("http://learn-automation.com");
		
		driver.get(config.getApplicationUrl());
							
		driver.quit();
		System.out.println("======Test closed======");	
		
	}

}
