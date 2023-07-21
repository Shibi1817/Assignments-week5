package servicenow.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateArticle extends ArticleLogin {
  @Test
  public void update() throws InterruptedException {
	  
	  Shadow shadow = new Shadow(driver);
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//div[text()='All']").click();
	  shadow.setImplicitWait(20);
	  shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//mark[text()='Knowledge']").click();
	  Thread.sleep(5000);
	  WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	  driver.switchTo().frame(frame);
	  driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  WebElement frame2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[contains(@id,'sys_display.kb_knowledge.kb_knowledge_base')]")).sendKeys("IT");
	  driver.findElement(By.xpath("//input[contains(@id,'sys_display.kb_knowledge.kb_category')]")).sendKeys("Java");
	  driver.findElement(By.xpath("//input[@aria-label='Short description']")).sendKeys("Java");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	  
	  
  }
}
