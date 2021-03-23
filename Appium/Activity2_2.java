package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2_2 {
	

	    AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	     
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "<device name>");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("noReset", true);
	        caps.setCapability("appPackage", "com.android.messaging");
	        caps.setCapability("appActivity", ".ui.conversationlist.ConversationListActivity");

	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);
	    }

	    @Test
	    public void smsTest() {
	        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Create New Message\")")).click();
	        String contactBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/auto_complete_contact\")";
	        driver.findElement(MobileBy.AndroidUIAutomator(contactBoxLocator)).sendKeys("1234567890");
            String messageBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/hint_message\")";
	        driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();
            messageBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/sms_edit_text\")";
	        MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
	        composeMessageInput.sendKeys("Hello from Appium");
	        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send SMS\")")).click();
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("message_text_view")));
	        String messageLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/message_text_view\")";
	        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
	        Assert.assertEquals(sentMessageText, "Hello from Appium");
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}