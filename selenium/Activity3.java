package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		//Get the title of the page 
		String title = driver.getTitle();
		System.out.println("Title of the webpage is : " +title);
		
		WebElement fName= driver.findElement(By.id("firstName")); 
		fName.sendKeys("Durga");
	    	WebElement lName = driver.findElement(By.id("lastName"));
		lName.sendKeys("Kundu");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("durgakundu2009@gmail.com");
	    	WebElement pNumber = driver.findElement(By.id("number"));
		pNumber.sendKeys("9062892415");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		driver.close();
	}
}