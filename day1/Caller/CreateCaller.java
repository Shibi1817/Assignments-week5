package servicenow.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateCaller extends CallerLoginPage {
  @Test
  public void caller() throws InterruptedException {
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
	  driver.findElement(By.xpath("//button[text()='New']")).click();
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  WebElement frame2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sibi");
	  driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Shrey");
	  driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys("Mr.");
	  driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("shibi@gmail.com");
	  driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys("+91 9123456780");
	  driver.findElement(By.xpath("//input[@aria-label='Mobile phone']")).sendKeys("+91 9012345678");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  driver.switchTo().frame(frame);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Sibi",Keys.ENTER);
	  
	  
	  
  }
}
