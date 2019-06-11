package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage  {
	
	public WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver; // 
		PageFactory.initElements(ldriver, this);
	}


	@FindBy(name="q")
	 WebElement txtSearch;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement btnSearch;
	
	
	 
	 @Test
	 public void search(String city) {
		 txtSearch.sendKeys(city);
		 btnSearch.click();
		
	/*String expbrokertitle=ldriver.findElement(By.xpath("(//h1[@class=\"bottom-half\"])")).getText();
	Assert.assertTrue(equals(expbrokertitle));*/
		
		
	 }

}
