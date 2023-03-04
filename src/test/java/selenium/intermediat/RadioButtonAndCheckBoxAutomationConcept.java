package selenium.intermediat;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckBoxAutomationConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		Thread.sleep(5000);
		WebElement musicCheckBox=driver.findElement(By.xpath("//label[text()='Music']"));
		System.out.println(musicCheckBox.isSelected());
		if(!musicCheckBox.isSelected()) {
		musicCheckBox.click();
		}
		System.out.println(musicCheckBox.isSelected());
		WebElement radioButten=driver.findElement(By.linkText("Radio Button"));
		radioButten.click();
		Thread.sleep(2000);
		List<WebElement> radioButtenC=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioButtenC.size());
		for(WebElement button:radioButtenC) {
			if(button.getAttribute("value").equals("email")) {
				if(!button.isSelected()) {
					button.click();
				}
				
			}
		}
	}


	}