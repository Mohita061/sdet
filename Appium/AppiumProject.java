package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumProject {
	
	AppiumDriver<MobileElement>  driver=null;	
	WebDriverWait wait;
	
@BeforeTest
public void beforetest() throws MalformedURLException
{
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceName", "Piaxel4emulator");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.google.android.apps.tasks");
      caps.setCapability("appActivity", "ui.TaskListsActivity");
      caps.setCapability("noReset", true);

      driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
}

	
  @Test
  public void f() {
	 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  MobileElement Addbutton=driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]");
	  	  Addbutton.click();
	  	driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("add_task_done").click();
        String task =driver.findElementById("task_name").getText();
        System.out.println("task is "+task);
        Assert.assertEquals(task, "Complete Activity with Google Tasks");
        
       
       	Addbutton.click();
       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
       	driver.findElementById("add_task_done").click();
       	String task2 =driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Keep']").getText();
       	System.out.println("task is "+task2);
        Assert.assertEquals(task2, "Complete Activity with Google Keep");
        
       
       	Addbutton.click();
       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
       	driver.findElementById("add_task_done").click();
       	String task3 =driver.findElementByXPath("//android.widget.TextView[@text='Complete the second Activity Google Keep']").getText();
       	System.out.println("The Third task is "+task3);
        Assert.assertEquals(task3, "Complete the second Activity Google Keep");
	  
        
        @Test
        public void googlekeep() { 
      	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      	  driver.findElement(By.id("com.google.android.keep:id/new_note_button")).click();
      	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	  MobileElement title = driver.findElement(By.id("com.google.android.keep:id/editable_title"));
      	  title.sendKeys("This is Appium Testing");
      	  MobileElement note= driver.findElement(By.id("com.google.android.keep:id/edit_note_text"));
      	  note.sendKeys("Testing is going on. Everything is great");
      	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
      	  
      	  String titlePage= driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText();
      	  String notePage= driver.findElement(By.id("com.google.android.keep:id/index_note_text_description")).getText();
      	  Assert.assertEquals("This is Appium Testing", titlePage);
      	  Assert.assertEquals("Testing is going on. Everything is great", notePage);
      	  
      	  
      	@Test

      	public void CreateReminder() throws IOException {
      		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      		  driver.findElement(By.id("com.google.android.keep:id/new_note_button")).click();
      		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      		  MobileElement title = driver.findElement(By.id("com.google.android.keep:id/editable_title"));
      		  title.sendKeys("This is Appium Testing");
      		  MobileElement note= driver.findElement(By.id("com.google.android.keep:id/edit_note_text"));
      		  note.sendKeys("Testing is going on. Everything is great");
      		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      		  MobileElement reminder= driver.findElement(By.id("com.google.android.keep:id/menu_reminder"));
      		  reminder.click();
      		  
      		  driver.findElement(By.xpath("//android.widget.TextView[@text='Pick a date & time']")).click();
      		  driver.findElement(By.id("com.google.android.keep:id/save")).click();
      		  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
      		  
      		  String titlePage= driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText();
      		  String notePage= driver.findElement(By.id("com.google.android.keep:id/index_note_text_description")).getText();
      		  Assert.assertEquals("This is Appium Testing", titlePage);
      		  Assert.assertEquals("Testing is going on. Everything is great", notePage);
      		  
      		 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
      		 driver.findElement(By.id("com.google.android.keep:id/drawer_navigation_reminders")).click();
      		 String titlePageReminder= driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText();
      		 String notePageReminder= driver.findElement(By.id("com.google.android.keep:id/index_note_text_description")).getText();
      		 Assert.assertEquals("This is Appium Testing", titlePageReminder);
      		 Assert.assertEquals("Testing is going on. Everything is great", notePageReminder);
      		 
      		 
      		@Test
      		public void ToDOList() throws IOException, InterruptedException {
      	    
      	  	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(textContains(\"To-Do List\"))")).click();
      	   //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).getChild(textContains(\"To-Do List\"))")).click();
      	   Thread.sleep(5000);
      	   driver.findElement(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("Add tasks to list");
      	   driver.findElement(MobileBy.xpath("//android.widget.Button[@text='Add Task']")).click();
      	   Thread.sleep(5000);
      	   driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("Get number of tasks");
      	  	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button")).click();
      	  	  Thread.sleep(5000);
      	  	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("Clear the list");
      	    	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button")).click();
      	    	  Thread.sleep(5000);
      	    	  String TodoTask1= driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]")).getText();
      	    	  String TodoTask2= driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]")).getText();
      	    	  String TodoTask3= driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[4]")).getText();
      	    	  Assert.assertEquals(TodoTask1, "Add tasks to list");
      	    	  Assert.assertEquals(TodoTask2, "Get number of tasks");
      	    	  Assert.assertEquals(TodoTask3, "Clear the list");
      	    	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Add tasks to list\"))")).click();
      	    	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Get number of tasks\"))")).click();
      	    	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Clear the list\"))")).click();
      	    	    	  
      	    	  Thread.sleep(5000);
      	    	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]")).click();
  
      	    	@Test
      	      public void testSearchAppium() throws Throwable {
      	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	          driver.get("https://www.training-support.net/selenium");
      	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View")));
      	  		 
      	  		  //Scroll Login Form
      	  	      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(textContains(\"Login Form\"))")).click();
      	  		
      	            //add Username
      	  	     
      	  	      MobileElement userName = driver.findElement(By.xpath("//android.widget.EditText[1][@resource-id='username']"));
      	  	     
      	  	      userName.click();
      	  	      userName.sendKeys("admin");
      	  	    
      	  	      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Password\"))")).click();
      	  	     
      	           //add Password
      	  	     
      	  	      driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").click();
      	  		  driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
      	  	     
      	  		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
      	  			String loginSuccess = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();
      	  		  Assert.assertEquals(loginSuccess, "Welcome Back, admin");
      	  		  System.out.println("Login Success");
      	  		 
      	  			
      	  	     
      	  		  MobileElement userName1 =driver.findElement(By.xpath("//android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[1]"));
      	  		 
      	  		  userName1.click();
      	  		  userName1.clear();
      	  	
      	  		  userName1.sendKeys("Admin");
      	  		 
      	  		  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Password\"))")).click();
      	  		 
      	  		 
      	  		  MobileElement passWord1=driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[2]");
      	  		  //MobileElement passWord1=driver.findElementById("password");
      	  		  passWord1.click();
      	  		  passWord1.clear();
      	  		  passWord1.sendKeys("Password");
      	  		 
      	  		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
      	  		 
      	  		  String loginFailure = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();
      	  		  Assert.assertEquals(loginFailure, "Invalid Credentials");
      	  		  System.out.println("Login Failed");
      	  		@Test
      	  	public void ChromeOne() throws IOException {
      	    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	    	  driver.get("https://www.training-support.net/selenium");
      	    	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(textContains(\"Popups\"))")).click();
      	    	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(textContains(\"Sign In\"))")).click();
      	      }
      	      @Test
      	     public void testCaseOne() throws IOException {
      	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	    	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")).sendKeys("admin");
      	    	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")).sendKeys("password");
      	    	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
      	    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	    	String loginSuccess = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();
      	  	  Assert.assertEquals(loginSuccess, "Welcome Back, admin");
      	  	  System.out.println("Login Success");
      	      }
      	      
      	      @Test
      	      public void testCaseTwo() throws IOException {
      	      	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.Button")).click();
      	      	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Popups\"))")).click();
      	      	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Sign In\"))")).click();
      	      	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	        	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")).sendKeys("admin1");
      	        	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")).sendKeys("password");
      	        	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
      	        	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	        	  String loginFailure = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();
      	  		  Assert.assertEquals(loginFailure, "Invalid Credentials");
      	  		  System.out.println("Login Failed");  
      	    }    
      	      @AfterClass
      	      public void afterclass() {
      	    	  driver.quit();
      	      }
      		
      		
      		}
}