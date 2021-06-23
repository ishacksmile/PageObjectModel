package HRMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObject {
	
		
	@FindBy(xpath="//*[@id=\'task-list-group-panel-menu_holder\']/table/tbody/tr/td")
	public static WebElement dashboardText;

}
