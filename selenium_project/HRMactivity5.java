package HRMProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMactivity5 {
	WebDriver driver;
	WebDriverWait wait;
	Actions act;

	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  wait=new WebDriverWait(driver,20);
			  act = new Actions(driver);

			 driver.findElement(By.id("txtUsername")).sendKeys("orange");
			 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			 driver.findElement(By.id("btnLogin")).click();			  
	}
  @Test
  public void f() {
      WebElement element = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", element);
      element.click();
	  
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnSave"))));
      WebElement Edit=driver.findElement(By.id("btnSave"));
	 
	Edit.click();
	WebElement FName=driver.findElement(By.id("personal_txtEmpFirstName"));
	FName.clear();
	FName.sendKeys("Dheeraj");
	 
    WebElement LName=driver.findElement(By.id("personal_txtEmpLastName"));
    LName.clear();
    LName.sendKeys("Wagdre");
     Select dropdown = new Select(driver.findElement(By.id("personal_cmbNation")));
 	 dropdown.selectByVisibleText("Indian");
	 WebElement DOB=driver.findElement(By.id("personal_DOB"));
	 DOB.clear();
	 DOB.sendKeys("1992-05-20");	 
	 driver.findElement(By.id("btnSave")).click();	  
  }
  @AfterClass
  public void afterClass() {
	driver.close();
  }  
}