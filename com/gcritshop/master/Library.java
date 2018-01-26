package com.gcritshop.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	public static WebDriver driver;
	public static Properties PR1;
	public static FileInputStream Fis1;
	
	public String OpenApplication(String Url) throws IOException{
		
		PR1 = new Properties();
		Fis1=new FileInputStream("C:\\Users\\Sreenivas\\workspace\\Day02\\src\\com\\gcritshop\\properties\\GcrProp.properities");
		PR1.load(Fis1);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();
		
		return ("Page opened");
			
		
	}
	public String AdminLogin(String UserName, String Password)
	{
		
		
		driver.findElement(By.xpath(PR1.getProperty("UserName"))).sendKeys(UserName);	
		driver.findElement(By.xpath(PR1.getProperty("Password"))).sendKeys(Password);
		driver.findElement(By.xpath(PR1.getProperty("Login"))).click();
	
		return ("AdminPage loggedin");
	}
}
