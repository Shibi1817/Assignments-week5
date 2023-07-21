package servicenow.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class CallerLoginPage {
	public ChromeDriver driver;
	
  @BeforeMethod
  public void precondition() {
	  driver=new ChromeDriver();
	  driver.get("https://dev147938.service-now.com"); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("user_password")).sendKeys("5h+^Z8OKsutG");
	  driver.findElement(By.id("sysverb_login")).click();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
