import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		//String projectPath = System.getProperty("user.dir");

		//System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver_win32(1)\\chromedriver.exe");
		//System.out.println("path "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");

		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("https://selenium.dev/");

		//driver.findElement(By.id("gsc-i-id1")).sendKeys("maven");

		WebElement textBox = driver.findElement(By.id("gsc-i-id1"));

		// List<WebElement> ListOfElements=driver.findElements(By.xpath("//input"));

		java.util.List<WebElement> ListOfElements = driver.findElements(By.xpath("//input"));

		int num = ListOfElements.size();
		System.out.println("noumber of inputs :"+num);

		textBox.sendKeys("maven");
	}
}
