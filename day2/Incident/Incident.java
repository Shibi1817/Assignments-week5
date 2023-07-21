package servicenow.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Incident extends IncidentLogin {
	
  @Test(dataProvider = "fetchdata")
  public void run(String software) throws InterruptedException {
	  
	  Shadow shadow = new Shadow(driver);
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//div[text()='All']").click();
	  shadow.setImplicitWait(20);
	  shadow.findElementByXPath("//input[@id='filter']").sendKeys("incidents");
	  shadow.setImplicitWait(30);
	  shadow.findElementByXPath("//mark[text()='Incidents']").click();
	  Thread.sleep(5000);
	  WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	  driver.switchTo().frame(frame);
	  driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  WebElement frame2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@aria-label='additional actions menu']")).click();
	  driver.findElement(By.xpath("//div[text()='View']")).click();
	  driver.findElement(By.xpath("//div[text()='Default view']")).click();
	  driver.findElement(By.xpath("//button[contains(@id,'lookup.incident.assignment_group')]")).click();
	  driver.switchTo().defaultContent();
	  Set<String> windowHandles = driver.getWindowHandles();
	  List<String> list1=new ArrayList<String>(windowHandles);
	  driver.switchTo().window(list1.get(1));
	  driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys(software,Keys.ENTER);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
	  driver.switchTo().window(list1.get(0));
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
	  driver.findElement(By.xpath("//button[@aria-label='additional actions menu']")).click();
	  driver.findElement(By.xpath("//div[text()='View']")).click();
	  driver.findElement(By.xpath("//div[text()='Default view']")).click();

	
  }
  
  @DataProvider(name="fetchdata")
  public String[][] getdata() {
	  
	  String[][] data=new String[1][1];

	  data[0][0]="Software";
	  
	  return data;
	  
	  
  }
  
  
  
}
