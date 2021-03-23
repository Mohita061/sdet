package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMActivity6 {
	WebDriver driver;
	
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			 
			 driver.findElement(By.id("txtUsername")).sendKeys("orange");
			 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			 driver.findElement(By.id("btnLogin")).click();			  
	}	
  @Test
  public void f() {	 
	  WebElement Directory= driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']/b"));
	  Assert.assertTrue(Directory.isDisplayed());
	  Assert.assertTrue(Directory.isEnabled());
	  Directory.click();
	  WebElement Heading= driver.findElement(By.xpath("//div[@class='head']/h1"));	 
	  Assert.assertEquals("Search Directory", Heading.getText());	  
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
   
}