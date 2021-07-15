package GoogleSearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_demo {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		WebDriver driver= new InternetExplorerDriver();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		driver.get("https://google.com");
		
		caps.setCapability("ignoreProtectedModeSettings", true);
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		driver.quit();
	}

}
