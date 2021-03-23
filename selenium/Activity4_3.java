package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is : " +driver.getTitle());

        String thirdHeader= driver.findElement(By.xpath("//h3[@id=\"third-header\"]")).getText();
        System.out.println("Title of the Thrid Header is : " +thirdHeader);
        
        WebElement fifthHeader= driver.findElement(By.xpath("//h5[contains(@class,\"green\")]"));
        System.out.println("Colour of the " +fifthHeader.getText() +" is "+fifthHeader.getCssValue("Color"));
        		
        WebElement violetButton= driver.findElement(By.xpath("//button[contains(@class,\"violet\")]"));
        System.out.println("Attribute of the Violet button is : " +violetButton.getAttribute("Class"));
        
        WebElement greyButton= driver.findElement(By.xpath("//html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println("Title of the grey button is: " +greyButton.getText());
	
        driver.close();
	}

}