package lab.sesion.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LABpractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn=driver.findElement(By.xpath("//a[@id='signinLink']"));
		signIn.click();
		Thread.sleep(2000);
		WebElement wantToBySomething=driver.findElement(By.xpath("//a[@id='newCompanyAccount']"));
		wantToBySomething.click();
		WebElement emailField=driver.findElement(By.id("email"));
		WebElement passwordFiled=driver.findElement(By.name("password"));
		WebElement companyNameField=driver.findElement(By.id("nameInput"));
		WebElement descriptionField=driver.findElement(By.id("descriptionInput"));
		WebElement creatAccountBtn=driver.findElement(By.id("signupAsSellerBtn"));
		emailField.sendKeys("nilo27834@gmail.com");
		passwordFiled.sendKeys("123@Ass");
		companyNameField.sendKeys("haibat");
		descriptionField.sendKeys("I will win the canser");
		creatAccountBtn.click();
	}
}