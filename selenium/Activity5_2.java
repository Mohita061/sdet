package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement checkBox= driver.findElement(By.xpath("//input[contains(@type,\"checkbox\")]"));
        System.out.println(" Validate if check box is selected on the page: " +checkBox.isSelected());
        checkBox.click();
        System.out.println(" Validate if check box is selected after clicking on it: " +checkBox.isSelected());
        
        driver.close();
	}
}