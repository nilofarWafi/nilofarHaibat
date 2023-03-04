package selenium.intermediat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConcepts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
		WebElement alertBtn=driver.findElement(By.id("alertBtn"));
		alertBtn.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		WebElement confirmBtn=driver.findElement(By.id("confirmBtn"));
		confirmBtn.click();
		driver.switchTo().alert().dismiss();
		WebElement promptBtn=driver.findElement(By.id("promptBtn"));
		promptBtn.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("I like this kind of allert");
		alert.accept();
		WebElement showAlert=driver.findElement(By.xpath("//a[text()='Show Alert']"));
		showAlert.click();
		WebElement deletPhoto=driver.findElement(By.id("alertBtn"));
		deletPhoto.click();
		Thread.sleep(2000);
		WebElement cancel=driver.findElement(By.id("cancelBtn"));
		cancel.click();
		

	}

}
