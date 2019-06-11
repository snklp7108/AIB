package aibReporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class App  {
	// Allure Reporting 
	// for allure reporting need to perform following steps
	// 1. Download the Allure file and setup its path in environment variable then add Maven dependency in project pom.xml file
	// 2. Execute your test case after execution refresh the project you will get a allure-results folder which contain file in json formate
	// 3. Open the cmd and type the command allure serve + paste allure-results location and press enter it will generate report.
	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	@Test(priority=1)
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\artemis v2.4.5\\Artemis_Test\\Web Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=2)
	public void testCase01() {
		Homepage homepage= new PageFactory().initElements(driver, Homepage.class);
		homepage.searchfield("real me 3");
		homepage.search();
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
