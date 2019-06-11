package extentReportingDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class nopCommerceTest {
	// Important Class for extent Reporting ExtentHtmlReporter, ExtentReport, ExtentTest
	// ExtentHtmlReporter:- It is used for look and feel of report like Report-name, Document-type,Tile, Theme-of-report
	// ExtentReport:- It is used to create entry in report and to create test-cases inside the report
	// ExtentTest:- Used to update the status in your report like pass, fail, skip 
	// We have to create object of these classes to excess the method
 public WebDriver driver;
 
 ExtentHtmlReporter extenthtmlreporter;
 ExtentReports extentreport;
 ExtentTest extenttest;
 
 @BeforeTest
 public void setExtent() {
 extenthtmlreporter= new ExtentHtmlReporter(System.getProperty("D:\\Sankalp\\Workspace\\AIB\\test-output\\MyReport.html"));
 extenthtmlreporter.config().setDocumentTitle("Automation Report");
 extenthtmlreporter.config().setReportName("nopCOmmerce");
 extenthtmlreporter.config().setTheme(Theme.DARK);
 
 
 extentreport = new ExtentReports();
 //extentreport.attachReporter(extenthtmlreporter);
 extentreport.setSystemInfo("Browser", "Chrome");
 extentreport.setSystemInfo("O.S", "Windows-8");
 extentreport.setSystemInfo("Tester Name", "Sankalp");
 
 
}
 @AfterTest
 public void endReport() {
	 extentreport.flush();
 }
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\artemis v2.4.5\\Artemis_Test\\Web Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
  }
  @Test
	public void nopCommerceTitle() {
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store", "Titles are not matched");
		extenttest= extentreport.createTest("nopCommerceTitle"); // This will create the new entry of Test in Extent Report
	}	
		
  @Test
 	public void nopCommerceLogo() {
 		//Assert.assertEquals(driver.getTitle(), "nopCommerce demo store", "Titles are not matched");
 		extenttest= extentreport.createTest("nopCommerceLogo"); // This will create the new entry of Test in Extent Report
 		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 		Assert.assertTrue(logo.isDisplayed());
 	}	
  
  @Test
	public void nopCommerceLoginTest() {
	  extenttest= extentreport.createTest("nopCommerceLoginTest");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod // This method will execute after completion of ever test method
  public void tearDown(ITestResult result) throws IOException // result variable have the status of our test method & ITestResult is interface of testNG.
  {
	   if (result.getStatus()==ITestResult.FAILURE) {
		   extenttest.log(Status.FAIL, " Test case falied "+ result.getName()); //To add name in report
		   
		  String screenshotpath= nopCommerceTest.setScreenShot(driver, result.getName());
		   extenttest.addScreenCaptureFromPath(screenshotpath); // adding screenshot to extent report
	}
	   else if (result.getStatus()==ITestResult.SKIP) {
		   extenttest.log(Status.SKIP, "Test case skiped"+ result.getName());
		   
	}
	   else if (result.getStatus()==ITestResult.SUCCESS) {
		   extenttest.log(Status.PASS, "Test case success"+result.getName());
		   String screenshotpath= nopCommerceTest.setScreenShot(driver, result.getName());
		   extenttest.addScreenCaptureFromPath(screenshotpath); 
	}
  }
  public static  String setScreenShot(WebDriver driver, String ScreenShotname) throws IOException {
	  String datename= new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	  TakesScreenshot ts= (TakesScreenshot) driver;
	  File source= ts.getScreenshotAs(OutputType.FILE);
	  // After execution you will see "Failed Test-case Screenshot" under src folder
	  String Destination= System.getProperty("user.dir")+ "/AIBScreenShotname/"+ScreenShotname+ datename+".png";
	  File finaldesti =new File(Destination);
	  FileUtils.copyFile(source, finaldesti);
	  return ScreenShotname;
	
	  
  }
  }
