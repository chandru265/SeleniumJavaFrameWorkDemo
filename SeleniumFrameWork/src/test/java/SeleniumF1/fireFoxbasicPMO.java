package SeleniumF1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GoogleSearchPage.firefoxPMObasic;
import io.github.bonigarcia.wdm.WebDriverManager;
public class fireFoxbasicPMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		//goto URL 
		
		driver.get("https://google.com");
		
		//calling search bar 
		
		firefoxPMObasic.Searchbar(driver).sendKeys("moviesrulz");
		
		//calling click click button
		
		firefoxPMObasic.SearchButton(driver).click();
		
		//closing browser
		
		driver.close();
	}

}
