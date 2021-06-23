package HRMTestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctionHRM.CommonFunctionExample;
import HRMPageObject.DashboardPageObject;
import HRMPageObject.LoginPageObject;


public class Dashboard extends CommonFunctionExample {
	
	
    @Test
	public void DashboardText() {
    	
    	PageFactory.initElements(driver,LoginPageObject.class);
    	LoginPageObject.username.sendKeys(properties.getProperty("username"));
    	LoginPageObject.password.sendKeys(properties.getProperty("password"));
    	LoginPageObject.login.click();
	
    	
    	PageFactory.initElements(driver, DashboardPageObject.class);
    	
    	String actualmessage= DashboardPageObject.dashboardText.getText();
		
    	Assert.assertEquals(actualmessage, "No Records are Available");
    	
    	
    	
    	//Assert.assertEquals(actualtext,  "No Records are Available");
    	
    	
         //Assert.assertEquals(actualtext, "No Records are Available");
    	
	}

	
	
	
	
}
