package HRMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRolePageObject {
	
	
	@FindBy(xpath="//*[@id=\'menu_admin_viewAdminModule\']/b")
	public static WebElement adminaction;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement usermanagementaction;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement usersaction;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userrole;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement Status;
	
	@FindBy(id="searchBtn")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\'resultTable\']/tbody/tr/td[3]")
	public static WebElement admintext;
	
	@FindBy(xpath="//*[@id=\'resultTable\']/tbody/tr/td[5]")
	public static WebElement enabledtext;

}
