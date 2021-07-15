package SeleniumF1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import GoogleSearchPage.CreatePMOSearch;
import PropertiesFileDemo.PropertiesFile_demo;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleSearchPMO {

	private static WebDriver driver=null;
	public static String browserName =null;

	@BeforeTest

	public void SetupTest() {
        PropertiesFile_demo.testing(); 
		if (browserName.equalsIgnoreCase("chrome")) {
		

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
	}

	@Test
	public static void TestExecution() {

		//calling google page 
		driver.get("https://google.com");

		//calling search bar from CreatePMOSearch.java
		CreatePMOSearch.textbox_search(driver).sendKeys("moviesrulz");

		//calling search button from CreatePMOSearch.java
		CreatePMOSearch.button_search(driver).sendKeys(Keys.RETURN);


	}

	@AfterTest
	public void tearDown() {

		//closing browser 
		driver.close();
		//driver.quit();
		System.out.println("test case executed successfully");
	    PropertiesFile_demo.testing2();
	}

}
