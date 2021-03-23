package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	public static void main(String[] args) {		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement inputText= driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Validate if the text field is enabled: " +inputText.isEnabled());
        
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        
        System.out.println("Validate if the text field is enabled: " +inputText.isEnabled());
        driver.close();        
	}
}