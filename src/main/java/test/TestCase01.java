package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.Property;

public class TestCase01 extends Base {
	@Test
	public void homeTest() {
		driver.get("https://www.zoopla.co.uk/");
		HomePage homepage= new HomePage(driver);
		homepage.search("London");
		Property prop= new Property(driver);
		prop.listOfProperty();
		prop.clickFifthProperty();
		
	
	}
 
}
