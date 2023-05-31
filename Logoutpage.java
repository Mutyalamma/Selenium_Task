package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helpers.helpers;

public class Logoutpage extends helpers {
	
	WebDriver driver;
	
	public Logoutpage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//PageFactory 
	
	 By Logout = By.xpath("//*[contains(text(),'Log Out')]");
	
	public static void logoutApplication() 
	{
		
	waitForElementToAppearAndClick(Logout);
   }
		
}


