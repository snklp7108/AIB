package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base {
	public static  WebDriver driver;
	
	@BeforeClass
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Sankalp\\Workspace\\AIB\\src\\main\\java\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	/*@Parameters("browser")
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Sankalp\\Workspace\\AIB\\src\\main\\java\\BrowserDrivers\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Sankalp\\Workspace\\AIB\\src\\main\\java\\BrowserDrivers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		//driver.get("https://www.zoopla.co.uk/");
	}
	*/
	@AfterClass
	public void tearDown() {
		//driver.close();
	}


}
