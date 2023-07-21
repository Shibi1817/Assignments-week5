package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadAssignment extends BaseClassAssignment {
  @Test(dataProvider="data")
  public void CreateLead(String cname, String fname, String lname, String phone) {
	  
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
	  
  }
  
  @DataProvider (name="data")
  public String[][] getData() {
	  
	  String[][] data=new String[1][4];
	  data[0][0]="TestLeaf";
	  data[0][1]="Hari";
	  data[0][2]="R";
	  data[0][3]="99";
	  
	  return data;
	  
  }
}
