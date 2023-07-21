package servicenow.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateCaller extends CallerLoginPage{
  @Test
  public void update() throws InterruptedException {
	  
	  Shadow shadow = new Shadow(driver);
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//div[text()='All']").click();
	  shadow.setImplicitWait(20);
	  shadow.findElementByXPath("//input[@id='filter']").sendKeys("callers");
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//mark[text()='Callers']").click();
	  Thread.sleep(5000);
	  WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	  driver.switchTo().frame(frame);
	  driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  WebElement frame2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@aria-label='Business phone']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys("+91 9123450780");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
	  

	  
	  
  }
}
