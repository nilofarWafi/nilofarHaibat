package selenium.intermediat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassConcepts {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");
	WebElement source=driver.findElement(By.xpath("//*[contains(text(),'Payment should not accept')]"));
	WebElement target=driver.findElement(By.xpath("(//div[contains(@class,'w-60')])[2]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(source, target).perform();

	}

}
