package selenium.intermediat;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		/*
		 * Steps to handle window switching
		 * first find the current or original window handle 
		 * second we click on link that opens new tab or window
		 * third we can iterate through the set of windowHandles 
		 * and compare the window handle value and if the value of 
		 * original window is not equal to new window handle 
		 * then we use .switch() method to move WebDriver from original 
		 * window to new opened window
		 */
		String originalWindow=driver.getWindowHandle();
		System.out.println(originalWindow);
		WebElement testSeleniumLink=driver.findElement(By.linkText("Test Selenium"));
		testSeleniumLink.click();
//		// for each loop to iterate through windowHandles
		Set<String> windowH=driver.getWindowHandles();
		for(String window:windowH) {
			if(!originalWindow.contentEquals(window)) {
				driver.switchTo().window(window);
				break;
			}
		}
  		
		WebElement test = driver.findElement(By.xpath("//button[text()='Add New Element']"));
		test.click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(originalWindow);
		Thread.sleep(5000);
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://tekschool.us/");
//		Thread.sleep(5000);
//		driver.switchTo().window(originalWindow);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.navigate().to("https://tekschool.us/");
//		driver.switchTo().window(originalWindow);
//	
		driver.quit();
		//driver.quit();
	}
	}