package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySignUpTestCase extends BaseClass{
	
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		 LogInPageObjects lpo=new  LogInPageObjects(driver);
		 lpo.ClickOnTryForFree().click();
		 
		   Thread.sleep(5000);
		   
		   String actualTital=driver.getTitle();
		   String expectedTitle=TestCaseData.expectedTitlle;
		 
		   commonUtilities.handleAssertions(actualTital, expectedTitle);
		   
		 SignUpPageObjects spo=new  SignUpPageObjects(driver);
		 spo.EnterFirstName().sendKeys(TestCaseData.firstName);
		 
		 commonUtilities.dropdwonHandle(spo.SelectJobTitle(),1);
		 commonUtilities.dropdwonHandle(spo.SelectCompanyEmployee(),2);
		 
		 
		 
		 

		 
		
		 
		 

	
		
		 
		
		 
		 
	
		 

		 
		 
	
		 
		 
		 
		 
		
		
		
	}

}
