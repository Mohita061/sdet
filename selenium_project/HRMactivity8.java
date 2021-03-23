package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMactivity8 {
	WebDriver driver;
	Actions act;
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  
			  act = new Actions(driver);
			  driver.findElement(By.id("txtUsername")).sendKeys("orange");
			  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			  driver.findElement(By.id("btnLogin")).click();			  
	}
  @Test
  public void f() {
//Navigate to the Dashboard page and click on the Apply Leave option.
	  WebElement ApplyLeave= driver.findElement(By.xpath("//td[4]/div/a/span"));
	  ApplyLeave.click();
	  ApplyLeave.click();
//Select leave type and duration of the leave
	  //WebElement type= driver.findElement(By.id("applyleave_txtLeaveType"));
	  
      Select dropdown = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
  	  dropdown.selectByVisibleText("Paid Leave");
  	  
  	 WebElement FromDate= driver.findElement(By.id("applyleave_txtFromDate"));
	 FromDate.clear();
	 FromDate.sendKeys("2021-03-01");
	 WebElement ToDate= driver.findElement(By.id("applyleave_txtToDate"));
	 ToDate.clear();
	 ToDate.sendKeys("2021-03-05");
	 driver.findElement(By.id("applyleave_txtComment")).sendKeys("Leave plan selenium exercise");
	 driver.findElement(By.id("applyBtn")).click();

//Navigate to the My Leave page to check the status of the leave application.	 
	 driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	 WebElement FromDt= driver.findElement(By.id("calFromDate"));
	 FromDt.clear();
	 FromDt.sendKeys("2021-05-02");
	 WebElement ToDt= driver.findElement(By.id("calToDate"));
	 ToDt.clear();
	 ToDt.sendKeys("2021-05-03");
	 driver.findElement(By.id("btnSearch")).click();
	 WebElement Status= driver.findElement(By.xpath("//td[6]/a[@href='/orangehrm/symfony/web/index.php/leave/viewLeaveRequest/id/179']"));
//Status of leave
	 System.out.println("Status of the leave is : "+Status.getText());
	 
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
   
}