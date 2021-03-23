package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement checkBox= driver.findElement(By.xpath("//input[contains(@type,\"checkbox\")]"));
        System.out.println(" Validate If check box is visible on the page: " +checkBox.isDisplayed());
        
        driver.findElement(By.xpath("//button[@id=\"toggleCheckbox\"]")).click();
        System.out.println(" If check box is visible after toggle it: " +checkBox.isDisplayed());
        
        driver.close();
	}

}