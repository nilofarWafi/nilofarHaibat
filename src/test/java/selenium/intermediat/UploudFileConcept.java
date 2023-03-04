package selenium.intermediat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploudFileConcept {

	public static void main(String[] args) {
		String path="C:\\Users\\ersha\\OneDrive\\Desktop\\R.jpg";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/upload");
		WebElement uplowdImag=driver.findElement(By.cssSelector("#fileInput"));
		uplowdImag.sendKeys(path);

	}

}
