package HRMTestcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctionHRM.CommonFunctionExample;
import HRMPageObject.UserRolePageObject;

public class UserRole extends CommonFunctionExample {
	
	
	
	public void CheckUsersaction() {
	
		
		Actions action = new Actions(driver);
	  	action.moveToElement(UserRolePageObject.adminaction);
	  	action.moveToElement(UserRolePageObject.usermanagementaction);
	  	action.moveToElement(UserRolePageObject.usersaction);
	  	action.click().build().perform();
			
	}
	
	public void dropdown() {
		
		Select adminselect= new Select(UserRolePageObject.userrole);
		adminselect.selectByIndex(1);
		Select enabledselect= new Select(UserRolePageObject.Status);
		enabledselect.selectByIndex(1);
	}
	
	
	@Test
	public void checkuserrole() {
		PageFactory.initElements(driver, UserRolePageObject.class);
		CheckUsersaction();
		dropdown();
	
		UserRolePageObject.searchbutton.click();

        String admindisplay = UserRolePageObject.admintext.getText();
        String enableddisplay = UserRolePageObject.enabledtext.getText(); 
        
        Assert.assertEquals(admindisplay, "Admin");
        Assert.assertEquals(enableddisplay, "Enabled");
	
	    
		
	}

}
