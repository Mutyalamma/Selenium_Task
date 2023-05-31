package Helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helpers {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public helpers(WebDriver wd)
	{
		this.driver = wd;
	}
	public void waitForElementToAppear(By findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	public void waitForElementToAppearAndClick(By findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby)).click();
	}
	public void waitForElementToAppearAndsendkeys(By findBy, String muthyam) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy)).sendKeys(muthyam);
}
}