

package selenium.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingUpTest {

	public static void main(String[] args) {
		String browserType="chrome";
		String url="https://tek-retail-ui.azurewebsites.net/";
		WebDriver driver=null;
		String name="nilofar";
		String email="ni90801440@gmail.com";
		String password="123@Nilo";
		String conformPassword="123@Nilo";
		if(browserType.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);
		WebElement signIn=driver.findElement(By.id("signinLink"));
		signIn.click();
		WebElement creatNewAcount=driver.findElement(By.id("newAccountBtn"));
		creatNewAcount.click();
		WebElement nameField=driver.findElement(By.id("nameInput"));
		WebElement emailField=driver.findElement(By.id("emailInput"));
		WebElement passwordField=driver.findElement(By.id("passwordInput"));
		WebElement conFPassword=driver.findElement(By.id("confirmPasswordInput"));
		WebElement signupBtn=driver.findElement(By.id("signupBtn"));
		System.out.println(nameField.isDisplayed());
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		conFPassword.sendKeys(conformPassword);
		signupBtn.click();
		WebElement CardNumber=driver.findElement(By.id("cardNumberInput"));
		WebElement nameOfCard=driver.findElement(By.id("nameOnCardInput"));
		WebElement expirationDay=driver.findElement(By.id("expirationMonthInput"));
		WebElement expirationYear=driver.findElement(By.id("expirationYearInput"));
		WebElement securityCode=driver.findElement(By.id("securityCodeInput"));
		WebElement creatAcount=driver.findElement(By.id("paymentSubmitBtn"));
		CardNumber.sendKeys("1234556771234567");
		nameOfCard.sendKeys("nnnn");
		Select select=new Select(expirationDay);
		select.selectByVisibleText("5");
		Select select1=new Select(expirationYear);
		select1.selectByValue("2024");
		securityCode.sendKeys("123");
		creatAcount.click();
	}
	}