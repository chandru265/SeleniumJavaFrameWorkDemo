package SeleniumF1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChromeBrowser {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGoogleSearch();
	}

	public static void TestGoogleSearch() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		//go to chrome.com

		driver.get("https://google.com");

		//find search bar

		driver.findElement(By.name("q")).sendKeys("sapphireims");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

		driver.close();

		System.out.println("test case executed successfully");






	}

}
