package testng.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HighLightMe {

	WebDriver driver;

	 @BeforeClass
	 public void main() {
	  driver = new FirefoxDriver();
	  // Open Application
	  driver.navigate().to("http://newtours.demoaut.com/");
	  // Maximize the browser
	  driver.manage().window().maximize();
	 }

	 @Test
	 public void callHighLightMeMethod() throws InterruptedException {
	  // Find the element to highlight
	  WebElement element = driver.findElement(By.xpath("//form[@name='home']/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font"));
	  // Function call to Highlight the element
	  fnHighlightMe(driver, element);
	 }

	 public static void fnHighlightMe(WebDriver driver, WebElement element)
	   throws InterruptedException {
	  // Creating JavaScriptExecuter Interface
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  for (int iCnt = 0; iCnt < 3; iCnt++) {
	   // Execute javascript
	   js.executeScript("arguments[0].style.border='4px groove yellow'", element);
	   Thread.sleep(1000);
	   js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');",element);
	  }
	 }
}
