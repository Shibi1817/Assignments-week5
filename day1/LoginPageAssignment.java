package week5.day1;


import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageAssignment {
	
	public ChromeDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
	  driver.findElement(By.linkText("CRM/SFA")).click();
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
