package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MergeLeadAssignment extends LoginPageAssignment {
  @Test
  public void MergeLead() throws InterruptedException {
	  
	  	driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();				
		driver.findElement(By.xpath("//div[@url='getAutoCompleteClientPartyIds']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(listWindow.get(0));
		driver.findElement(By.xpath("(//div[@url='getAutoCompleteClientPartyIds']/following-sibling::a)[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindow1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindow1.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		
		driver.switchTo().window(listWindow.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title2 = driver.getTitle();
		if(title2.equals("View Contact | opentaps CRM")) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Incorrect Title");
		}
  }
}
