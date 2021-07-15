package SapphireTestElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreenTestingMSP {

	
	WebDriver driver=null;
	
	By CustomerName_textbox = By.id("CustomerAliasName");
	
	By ContinueButton_Enter =By.id("continueId");
	
	public LoginScreenTestingMSP (WebDriver driver) {
		this.driver =driver;
	}
	
	public void logintoMSP(String text) {
		
		driver.findElement(CustomerName_textbox).sendKeys(text);
	}
	
	public void clickOnContinue() {
		
		driver.findElement(ContinueButton_Enter).click();
		
	}
	
}
