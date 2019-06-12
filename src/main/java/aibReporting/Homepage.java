package aibReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
WebDriver ldriver;
	
	public Homepage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	
	@FindBy(id="twotabsearchtextbox")
	WebElement txtSearchField;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement btnSearch;
	
	
	public void searchfield(String searchitem) {
		txtSearchField.sendKeys("real me 3");
		}
	
	public void search() {
		btnSearch.click();
		System.out.println("You are in homepage");
	}



}
