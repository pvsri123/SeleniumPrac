package testng.concepts;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
public class FindFlight {
	
	@FindBy(linkText="SIGN-OFF")

    WebElement Log_Out;
  

    @FindBy(linkText="Home")

    WebElement home;

        

    WebDriver driver;

        public FindFlight(WebDriver driver)

        {

            //System.out.println(driver.getTitle());

            this.driver = driver;

            if (!driver.getTitle().equals("Find a Flight: Mercury Tours:"))

            {

                throw new NoSuchElementException("Not on Find Flight page");

            }

        }


        public void Logout()

        {

            Log_Out.click();

            home.click();

           // return new LoginPage(driver);

        }        

}
