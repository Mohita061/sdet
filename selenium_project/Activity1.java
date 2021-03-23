package HRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/orangehrm");
  }
	     
  @Test
  public void f() {
	  
	  //Get the title of the website.
	  String title= driver.getTitle();
	  System.out.println("Title of the Page is: "+title);
	   
	  //Make sure it matches “OrangeHRM” exactly.
	  Assert.assertEquals(title, "OrangeHRM");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}