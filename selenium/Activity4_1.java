package SeleniumProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of the page is : " +driver.getTitle());
		driver.findElement(By.xpath("//html/body/div/div/div/a")).click();		
		System.out.println("Title of the new page is : " +driver.getTitle());
		driver.close();
	}
}