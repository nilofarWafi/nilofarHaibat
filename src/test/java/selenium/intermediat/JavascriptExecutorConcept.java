package selenium.intermediat;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('rangeInput').value=45");
		
		// How we can automate calendar with JS Executor
		Thread.sleep(5000);
		js.executeScript("document.getElementById('dateInput').value='2023-02-10'");
	}

}
