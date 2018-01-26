package testng.concepts;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
public class LoginPage {

	
WebDriver driver;

    

    @FindBy(name="userName")

    WebElement login_ID;

    

    @FindBy(name="password")

    WebElement password;

    

    @FindBy(name="login")

    WebElement Login_Button;

    

    public LoginPage(WebDriver driver) {

        this.driver = driver;        

        

        if (!driver.getTitle().equals("Sign-on: Mercury Tours")) {

            throw new NoSuchElementException("Login page is unreachable");

        }

    }

    public FindFlight login(String username, String pwd) {

                

        login_ID.sendKeys(username);

        password.sendKeys(pwd);

        Login_Button.click();

        

        FindFlight findflight=new FindFlight(driver);

        return findflight;

    }    
}
