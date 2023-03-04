package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
  		Thread.sleep(5000);
  		driver.navigate().to("https://tekschool.us/");
  		System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.close();
	}
	
}
