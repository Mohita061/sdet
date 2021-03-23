package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void test() {
	  System.out.println("Title of the page is : "+driver.getTitle());
	  assertEquals(driver.getTitle(), "Training Support");
	  
	  WebElement button = driver.findElement(By.cssSelector("a#about-link"));
	  button.click();
	  System.out.println("Button click!!");
	  
	  //wait.until(ExpectedConditions.titleIs("About Training Support"));
	  System.out.println("Title of the new page is : "+driver.getTitle());
	  
	  assertEquals(driver.getTitle(), "About Training Support");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}