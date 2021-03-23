package HRMProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMActivity2 {
	
	WebDriver driver;
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
	}
	
  @Test
  public void f() {
	  //Get the url of the header image.
	  WebElement header=driver.findElement(By.xpath("//div[@id='divLogo']/img[1]"));
      //Print the url to the console
	  System.out.println("Header image URL of the Page is: "+header.getAttribute("src"));
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }  
}