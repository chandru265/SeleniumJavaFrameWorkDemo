package GoogleSearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxPMObasic {

	private static WebElement element =null;
	
	public static WebElement Searchbar(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		
		return element;
		
	}
	
	public static WebElement SearchButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		
		return element;
		
	
	}
}
