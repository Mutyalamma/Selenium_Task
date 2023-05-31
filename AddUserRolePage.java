package OrangeHRMPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.helpers;

public class AddUserRolePage extends helpers {
	WebDriver driver;
	WebDriverWait wait;
	
	public AddUserRolePage(WebDriver wd) 
	{
		super(wd);
		this.driver = wd;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='name']")
	WebElement name;
	
	@FindBy(xpath="//*[@id='selectedEmployee_value]'")
	WebElement EmployeeName;
	
	@FindBy(xpath="//*[@id='user_name']")
	WebElement userName;
	
	@FindBy(xpath="//*[@@placeholder='Enter Password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@placeholder='Confirm Password']")
	String confirmpassword;
	
	
	By HRAdministration = By.xpath("//li[@class='menu-level-2']");
	By Usernameforwait=By.xpath("(//*[contains(text(),'Username')])[1]");
	By Adduser = By.xpath("//a[@ng-click='UserRolesCtrl.addUserRole()']");
	By Employeename = By.xpath("//input[@id='selectedEmployee_value']");
	By Selectename= By.xpath("(//*[@class='angucomplete-title'])[1]");
	By username = By.xpath("//input[@id='user_name']");
	By SelectRole = By.xpath("(//i[@class='material-icons' and text()='arrow_drop_down'])[4]");
	By Selectrolename = By.xpath("//*[text()='Asset Manager']");
	By Enabled = By.xpath("//div[@class='custom-control custom-radio  radio-display-horizontal-margin selected-option']");
	By Enterpassword = By.xpath("//input[@placeholder='Enter Password']");
	By Confirmpassword = By.xpath("//input[@placeholder='Confirm Password']");
	By Savebutton = By.xpath("//button[@id='modal-save-button']");
	By Dropdown = By.xpath("(//*[contains(text(),'more_horiz')])");
	By SelectAll = By.xpath("//*[@id='systemUserDiv']//tr[2]//td[1]");
	By Logout = By.xpath("//span[text()='Log Out']");
	By Saveuser = By.xpath("(//*[@class='btn btn-secondary'])");
	By DeleteSelected = By.xpath("//*[contains(text(),'Delete Selected')]");
	By Yes = By.xpath("//*[contains(text(),'Yes, Delete')]");
	
	By Name = By.xpath("//*[@class='name']");
	
	
	public void HRadminstration() throws InterruptedException 
	{
		waitForElementToAppearAndClick(HRAdministration);
		waitForElementToAppear(Usernameforwait);
		waitForElementToAppearAndClick(Adduser);
		
	}
   public void Adduserdetails(String Empname,String uname,String password,String confirmPassword) throws InterruptedException
   {
	   waitForElementToAppearAndsendkeys(Employeename,Empname);
	   waitForElementToAppearAndClick(Selectename);
	   waitForElementToAppearAndsendkeys(username,uname);
	   waitForElementToAppearAndClick(SelectRole);
	   waitForElementToAppearAndClick(Selectrolename);
	   
	   waitForElementToAppearAndsendkeys(Enterpassword,password);
	   waitForElementToAppearAndsendkeys(Enterpassword,confirmpassword);
	   waitForElementToAppearAndClick(Savebutton);
	      
   }
   
   public void Verifying() {
		waitForElementToAppear(Name);
		String text = name.getText();
		System.out.print(text);
	    String name = "Aaliyah Haq";
	    if(text.equals(name)) 
	    {
	    	System.out.print(true);
	    }
	    else 
	    {
	    	System.out.print(false);
	    }    
	}
	
	public void DeleteUser() {
		waitForElementToAppearAndClick(HRAdministration);
		
		waitForElementToAppear(Usernameforwait);
		
		waitForElementToAppearAndClick(SelectAll);
		
		waitForElementToAppearAndClick(Dropdown);
		
		waitForElementToAppearAndClick(DeleteSelected);
		
		waitForElementToAppearAndClick(Yes);
		
	}
   }
