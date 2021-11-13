package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;

public class myFirstTestNGClass 
{
	 WebDriver driver;	
	 
	 @BeforeSuite
	 public void beforesuiteMethod()
	 
	 {
		 
		System.out.println("inside before suite"); 
	 }
	 
	 @AfterSuite
	 public void voidaftersuiteMethod()
	 
	 {
		 
		System.out.println("inside after suite method"); 
	 }
	 
	 @BeforeTest
	 public void voidbeforeTest()
	 
	 {
		 
		System.out.println("inside before suite "); 
	 }
	 @AfterTest
	 public void voidafterTest()
	 
	 {
		 
		System.out.println("inside after after test"); 
	 }
	 
	 
	
	 @BeforeMethod
	  public void beforeMethod() 
	  {
		System.out.println("I am in Before Method");  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\webdrivertraining\\test\\resources\\chromedriver93.0.45.exe");	
			driver=new ChromeDriver(); 
	  }
	
	 
	  @Test
  public void testNich() 
  {
System.out.println("I am in TestMethod");  
driver.get(	"https://nichethyself.com/tourism/home.html");
WebElement user = driver.findElement(By.name("username"));
user.sendKeys("stc123");
driver.findElement(By.name("password")).sendKeys("12345"); //method chaining
driver.findElement(By.name("username")).submit();  
 
  String expectedTitle="My account";
  String actualTitle=driver.getTitle();

  
  System.out.println("This part will code not   ");
  
  /*if (expectedTitle.equals(actualTitle))
  	System.out.println("Test Case Passed");
  else
   System.out.println("Test Case Failed");*/
  
  assertEquals(actualTitle,expectedTitle);  //last stmt of the code
  
  }
    
	  
  @AfterMethod
  public void afterMethod() 
  {
		System.out.println("After Method");  
        driver.quit();
  }

}
