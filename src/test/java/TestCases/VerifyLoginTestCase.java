package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifyLoginTestCase extends BaseClass {
	//We ahve acheived inheritance here
	
	@Test
	public void login() throws IOException {
		
		 LogInPageObjects lpo=new  LogInPageObjects(driver);
		 lpo.EnterUsername().sendKeys(TestCaseData.username)	;
		 lpo.EnterPassword().sendKeys(TestCaseData.password);
		 lpo.ClickLogin().click();
		 
		 String  expectedString="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 
		 String  actualString=driver.findElement(By.xpath("//div[@id='error']")).getText();
		 
		 commonUtilities.handleAssertions(actualString,expectedString);
		 
		
		
	}

}
