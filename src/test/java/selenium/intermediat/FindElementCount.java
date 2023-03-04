package selenium.intermediat;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement allIcon=driver.findElement(By.xpath("//button[@id='hamburgerBtn']"));
		allIcon.click();
		WebElement electronic=driver.findElement(By.xpath("//span[text()='Electronics']"));
		electronic.click();
		WebElement vidioGame=driver.findElement(By.className("sidebar_content-item"));
		vidioGame.click();
		Thread.sleep(2000);
		List<WebElement> products=driver.findElements(By.tagName("img"));
		System.out.println(products.size());
		for(WebElement product:products) {

			 if(product.getAttribute("alt").equals("NPET K10 Gaming Keyboard")) {
				 product.click();
				
			}
			System.out.println(product.getAccessibleName());
	  
}
}
}