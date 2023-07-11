package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.helpers;


public class Loginpage extends helpers
{	
	WebDriver driver;
	
	public Loginpage(WebDriver wd)
	{
	super(wd);
	this.driver = wd;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@name='txtUsername']" )
	WebElement username;
	
	@FindBy(xpath = "//*[@id='txtPassword']")
	WebElement password;

	By Login = By.xpath("//*[@type='submit']");
	
	public void login(String name, String pwd)
	{
	username.sendKeys(name);
	password.sendKeys(pwd);
	waitForElementToAppearAndClick(Login);
	}
	
}
