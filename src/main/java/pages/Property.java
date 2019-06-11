package pages;

import java.sql.Driver;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Property {
	public WebDriver ldriver;
	public Property(WebDriver rdriver) {
		ldriver=rdriver; // 
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name="//img[@class='js-lazy-loaded']")
	WebElement imgbroker;
	@Test
	public void listOfProperty() {

		List<WebElement> allLinks = ldriver.findElements(By.xpath("//a[@class=\"listing-results-price text-price\"]"));

		Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext()) {
			Collections.reverseOrder();
			Collections.sort(allLinks,Collections.reverseOrder());
			System.out.println(itr.next().getText());
		}}

	
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void clickFifthProperty() 
	{
		WebDriverWait wait = new WebDriverWait(ldriver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"listing-results-price text-price\"]")));
		WebElement Fifth=ldriver.findElement(By.xpath("(//a[contains(@class,'listing-results-price text-price')])[5]"));
		System.out.println(Fifth.getSize());
		Fifth.click();
		imgbroker.click();
		String expbrokertitle=ldriver.findElement(By.xpath("(//h1[@class=\"bottom-half\"])")).getText();
		Assert.assertTrue(equals(expbrokertitle));
	}
}
