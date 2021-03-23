package HRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HRMActivity3 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  wait=new WebDriverWait(driver,20);
	}
	
  @Test
  public void f() {
//Find and select the username and password fields
	  WebElement username= driver.findElement(By.id("txtUsername"));
	  WebElement password= driver.findElement(By.id("txtPassword"));
	  
//Enter login credentials into the respective fields
      username.sendKeys("orange");
  	  password.sendKeys("orangepassword123");
	  //Click logine
  	driver.findElement(By.id("btnLogin")).click();
	  //Verify that the homepage has opened
  	
  	WebElement welcome= driver.findElement(By.id("welcome"));
  	wait.until(ExpectedConditions.visibilityOf(welcome));
  	Assert.assertTrue(welcome.isDisplayed());
  }
  
  @AfterClass
  public void afterClass() {
	 driver.close();
  }
}