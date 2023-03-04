package selenium.intermediat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/iframe");
		WebElement ifram=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(ifram);
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("title")).getText());
 
	}

}
