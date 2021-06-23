package CommonFunctionHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctionExample {
	
	  public static WebDriver driver=null;
      public static Properties properties=null;
	
	public Properties Loadproperty() throws IOException {
		
		FileInputStream fileinputstream=new FileInputStream("Config.Properties");
	    properties=new Properties();
		properties.load(fileinputstream);
		
		return properties;
	}
	
		
	@BeforeSuite
	public void Launchbrowser() throws IOException {
		Loadproperty();
		
		
		String browser= properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@AfterSuite
	public void close() {
		
		driver.quit();
		
		
	}
	
	
}
