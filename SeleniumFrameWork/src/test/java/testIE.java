import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("https://google.com");
		
		WebElement nine=driver.findElement(By.className("gLFyf gsfi"));
		
nine.sendKeys("how to sleep quick");


	}

}
