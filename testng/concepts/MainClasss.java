package testng.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class MainClasss {
	 WebDriver driver;

	    
	    @BeforeClass

	    public void setUP() 
	    {

	        driver = new FirefoxDriver();

	        driver.get("http://newtours.demoaut.com/");

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    }

	    
	    @Test(priority=1)

	    public void findFlight() 
	    {

	    FindFlight findFlight =new FindFlight(driver);

	    PageFactory.initElements(driver, findFlight);

	    findFlight.Logout();

	    }

	    

	    @Test(priority=0)

	    public void register() 
	    {

	        Register register = new Register(driver);

	        PageFactory.initElements(driver, register);

	        String[] loginCredential = register.signUp();

	        

	        LoginPage loginPage = new LoginPage(driver);

	        PageFactory.initElements(driver, loginPage);

	        loginPage.login(loginCredential[0],loginCredential[1]);

	    }

	    @AfterClass

	    public void tearDown() {

	        driver.close();

	    }

}

