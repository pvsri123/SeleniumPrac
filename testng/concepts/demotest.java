package testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demotest {
	
	@Test(priority=0)
	public void userReg(){
		System.out.println("This method is going to check user registration functionality ");
	}
	@Test(priority=1)
    public void userLogin(){
    	System.out.println("This is method is to check user login functionality");
    }
	@BeforeClass
	public void setUp(){
		
		System.out.println("This is browser initialization script");
	}
	@AfterClass
	public void tearDown(){
		System.out.println("To close the browser");
	}
	
	@BeforeMethod
	public void homePg(){
		System.out.println("To set home page in application");
	}
	
	@AfterMethod
	public void pgRefresh(){
		System.out.println("to refresh the page");
	}
}
