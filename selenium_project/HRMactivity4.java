package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMactivity4 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  wait=new WebDriverWait(driver,20);
 
			 driver.findElement(By.id("txtUsername")).sendKeys("orange");
			 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			 driver.findElement(By.id("btnLogin")).click();
			  
	}
  @Test
  public void f() throws InterruptedException {
	 WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
	 // WebElement PIM=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
		 
	  wait.until(ExpectedConditions.visibilityOf(PIM));
	  PIM.click();
	 WebElement Add=driver.findElement(By.id("btnAdd"));
	 Add.click();
	 driver.findElement(By.id("firstName")).sendKeys("Dheeraj");
	 driver.findElement(By.id("lastName")).sendKeys("Wagdre");
	 driver.findElement(By.id("btnSave")).click();
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();
	 Thread.sleep(100);
	 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Dheeraj Wagdre");
	 driver.findElement(By.id("searchBtn")).click();
	 WebElement Name=driver.findElement(By.cssSelector(".odd > td:nth-child(1) > a")); 
	 Assert.assertTrue(Name.isDisplayed());
  }
  @AfterClass
  public void afterClass() {
	driver.close();
  }   
}