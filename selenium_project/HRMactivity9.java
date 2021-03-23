package HRMProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMactivity9 {	
	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	
	@BeforeClass
		  public void beforeClass() {
		
			  driver= new FirefoxDriver();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  wait= new WebDriverWait(driver,10);
			  act = new Actions(driver);
			  driver.findElement(By.id("txtUsername")).sendKeys("orange");
			  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			  driver.findElement(By.id("btnLogin")).click();
			  
	}	
  @Test
  public void f() throws InterruptedException {
//Navigate to the “My Info” page.	  
	  WebElement element = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", element);
//Locate the left hand menu      
//Click on the “Emergency Contacts” menu item.
      //driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewEmergencyContacts/empNumber/1']")).click();
      //Thread.sleep(10000);
      //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Emergency Contacts"))));
      
      WebElement EmergencyCon=driver.findElement(By.partialLinkText("Emergency"));
  	  EmergencyCon.click();
 
  	//List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table')]/tbody/tr[1]/td"));
  	List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table')]/tbody/tr"));		
    	for(WebElement cellValue : rows) {
        System.out.println("Cell Value: " + cellValue.getText());
    }
  }
  @AfterClass
  public void afterClass() {	
	 driver.close();
  }   
}