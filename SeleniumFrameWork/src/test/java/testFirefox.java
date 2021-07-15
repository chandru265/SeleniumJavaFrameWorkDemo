import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testFirefox {

	public static void main(String[] args)  {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://google.com");

		//WebElement elm=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		//elm.sendKeys("moviesrulz");

		List<WebElement> elem = driver.findElements(By.xpath("//input"));

		int countOfInputs=elem.size();
		System.out.println("no of input elements :"+countOfInputs);
		try {
			driver.wait(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}
