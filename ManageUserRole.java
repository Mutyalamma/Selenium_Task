package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.helpers;

public class ManageUserRole extends helpers {
       
       WebDriverWait wait;
       WebDriver driver;
   	
   	public ManageUserRole (WebDriver wd) 
   	{
   		super(wd);
   	
   		this.driver=wd;	
   		PageFactory.initElements(driver, this);
   	}
   	   By HRAdministration = By.xpath("//li[@class='menu-level-2']");
   	   By Waitforload = By.xpath("//thead/tr[1]/th[2]");
       By Manageuser = By.xpath("//a[@class='top-level-menu-item active']");
       By Adduser = By.xpath("//a[@ng-click='UserRolesCtrl.addUserRole()']");
       By RoleType = By.xpath("//*[@type='text'])[2]");
       By ESS = By.xpath("//span[text()='ESS']");
       By UserRoleName = By.xpath("//input[@id='user_role_name']");
       By Employeeaction = By.xpath("//*[@for='checkbox_employee_add']");
       By Workflowmanagement = By.xpath("//*[@for='checkbox_attendance']");
       By Datagrouppermissions = By.xpath("//*[@for='HR Administration']");
       By Savebutton = By.xpath("//*[@form-name='userRoleForm']");
       By Successmsg = By.xpath("//div[@class='toast-message']");
       
       @FindBy(xpath="(//*[@id='toast-container'])")
   	   WebElement toastmessage;
       
       public void ManagingUserRole(String mutyalamma) throws InterruptedException {
    		
    		waitForElementToAppearAndClick(HRAdministration);
    		waitForElementToAppear(Waitforload);

    		waitForElementToAppearAndClick(Manageuser);
    		waitForElementToAppearAndClick(Adduser);
    		waitForElementToAppearAndsendkeys(UserRoleName, mutyalamma);
    		waitForElementToAppearAndClick(Employeeaction);
    		waitForElementToAppearAndClick(Workflowmanagement);
    		waitForElementToAppearAndClick(Datagrouppermissions);
    		waitForElementToAppearAndClick(Savebutton);
    		waitForElementToAppear(Successmsg);
    		String Msg=toastmessage.getText();
    		
    		if (Msg.equals("Successfully Saved")) {
    			
    			System.out.print("Condition passed\t"+Msg);
    		}else {
    			System.out.print("Conditon Not Passed"+Msg);
    		}
       
}
       }
