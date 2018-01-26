package testng.concepts;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
public class Register {
WebDriver driver;

    

    @FindBy(linkText="REGISTER")

    WebElement REGISTER_Link;

    

    @FindBy(name="firstName")

    WebElement firstName_text;

    

    @FindBy(name="lastName")

    WebElement lastName_text;

    

    @FindBy(name="phone")

    WebElement phone_text;

    

    @FindBy(id="userName")

    WebElement email_text;

    

    @FindBy(name="address1")

    WebElement address1_text;

    

    @FindBy(name="address2")

    WebElement address2_text;

    

    @FindBy(name="city")

    WebElement city_text;

    

    @FindBy(name="state")

    WebElement state_text;

    

    @FindBy(name="postalCode")

    WebElement postalCode_text;

    

    @FindBy(name="country")

    WebElement country_select;

    

    @FindBy(id="email")

    WebElement username_text;

    

    @FindBy(name="password")

    WebElement password_text;

    

    @FindBy(name="confirmPassword")

    WebElement confirmPassword_text;

    

    @FindBy(name="register")

    WebElement register_button;

    

    @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")

    WebElement verifytext1;

    

    @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")

    WebElement verifytext2;

    

    @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")

    WebElement verifytext3;

    
  

    @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")

    WebElement sign_in_link;

    

    public Register(WebDriver driver) {

        this.driver = driver;

    }
   

    public String[] signUp()

    {

        String dateStr =(new SimpleDateFormat("MMddHHmmss")).format(new Date());

        
        REGISTER_Link.click();

        
        if (!driver.getTitle().equals("Register: Mercury Tours")) {

            throw new NoSuchElementException("Not on Register page");

        }

        
        String f_name="Sreenivas";

        String l_name="Venkata";

        

        firstName_text.sendKeys(f_name);

        lastName_text.sendKeys(l_name);

        phone_text.sendKeys(dateStr);

        email_text.sendKeys(dateStr+"@gmail.com");

        address1_text.sendKeys("Address 1"+dateStr);

        address2_text.sendKeys("Kushaiguda");

        city_text.sendKeys("Hyderabad");

        state_text.sendKeys("Telangana");

        postalCode_text.sendKeys("500060");

        

        Select select=new Select(country_select);

        select.selectByVisibleText("INDIA");

        

        String username="UserName"+dateStr;

        String Password="@Password#123";

        

        username_text.sendKeys(username);

        password_text.sendKeys(Password);

        confirmPassword_text.sendKeys(Password);

        register_button.click();

        

        try

        {

          String expected1="Dear "+f_name+ " "+ l_name +",";

          String actual1=verifytext1.getText();               

          Assert.assertEquals(actual1, expected1);

          

          String expected2="Thank you for registering. You may now sign-in using the user name and password you've just entered.";

          String actual2=verifytext2.getText();               

          Assert.assertEquals(actual2, expected2);

          

  String expected3="Note: Your user name is " + username +".";

          String actual3=verifytext3.getText();               

          Assert.assertEquals(actual3, expected3);

        }

        

        catch(Exception e)

        {

            System.out.println(e.getMessage());

        }        

        sign_in_link.click();
        
        return new String[] {username,Password};

    }

}
