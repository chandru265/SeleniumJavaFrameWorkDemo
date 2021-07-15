package SapphireTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScreenTestingMSP {
	static WebDriver driver=null;
	
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlrepter = new ExtentHtmlReporter("ExtentReport1.html");
		
		ExtentReports Extent = new ExtentReports();
		Extent.attachReporter(htmlrepter);
		
		ExtentTest test1=Extent.createTest("Test Sapphire login page", "testing login page");
		
	   //String ProjectPath=System.getProperty("user.dir");
	   //System.setProperty("WebDriver.chromedriver.driver",ProjectPath+"Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	   
	   test1.log(Status.INFO, "starting test case");
	   driver.get("https://google.com");
	   test1.pass("navigated to SapphireIMS page");
	   
	   
	   //driver.findElement(By.name("CustomerAliasName")).sendKeys("hcl");
	   //test1.pass("Entered Cutomer Alias name ");
	   
	   
	   //driver.findElement(By.name("continueId")).click();
	   //test1.pass("clicked on continue button");
	   
	   driver.close();
	   test1.pass("closing broweser");
	   
	   driver.quit();
	   test1.pass("test completed");
	   Extent.flush();
	}
	
}
