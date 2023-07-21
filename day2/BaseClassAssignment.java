package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassAssignment {
	
	 public ChromeDriver driver;
	   
	 @Parameters({"url","username","password"})
	    @BeforeMethod
	    public void preCondition(String url, String username, String password) {
	      driver=new ChromeDriver();
	   	  driver.get(url);
	   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	  driver.findElement(By.id("username")).sendKeys(username);
	   	  driver.findElement(By.id("password")).sendKeys(password);
	   	  driver.findElement(By.className("decorativeSubmit")).click();
	   	  driver.findElement(By.linkText("CRM/SFA")).click();
	    }
	    @AfterMethod
	    public void postCondition() {
	        driver.close();
	    }

}
