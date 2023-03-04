package selenium.intermediat;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExercise {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn =driver.findElement(By.xpath("//a[@id='signinLink']"));
		signIn.click();
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		emailField.sendKeys("nil810@gmail.com");// write your own username
		passField.sendKeys("123@Nilo"); // write your own pass
		loginButton.click();
		
		WebElement accountButton = driver.findElement(By.xpath("//a[@id='accountLink']"));
		accountButton.click();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.cssSelector("div[class='account__address-new-wrapper']")));
		WebElement addAddress = driver.findElement(By.cssSelector("div[class='account__address-new-wrapper']"));
		new Actions(driver).moveToElement(addAddress);
		addAddress.click();
//		takeScreenShot( "fillingBeforeAddress", driver);
//		WebElement countryDropdown= driver.findElement(By.id("countryDropdown"));
//		selectDropdown(countryDropdown, "United Kingdom");
//		WebElement fullName = driver.findElement(By.cssSelector("#fullNameInput"));
//		fullName.sendKeys("Transformers Test");
//		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber' and @id='phoneNumberInput']"));
//		
//		new Actions(driver).sendKeys(phoneNumber, "2025659901").perform();
//		
//		WebElement address = driver.findElement(By.id("streetInput"));
//		address.sendKeys("6201 Lessburg");
//		WebElement apt = driver.findElement(By.id("apartmentInput"));
//		apt.sendKeys("123");
//		WebElement city = driver.findElement(By.cssSelector("#cityInput"));
//		city.sendKeys("Falls Church");
//		WebElement stateDropdwon = driver.findElement(By.cssSelector("select[name='state']"));
//		selectDropdown(stateDropdwon, "Manchester");
//		WebElement zipcode = driver.findElement(By.id("zipCodeInput"));
//		zipcode.sendKeys("22044");
//		takeScreenShot("afterFillingtheForm", driver);
//		WebElement addYourAddressButton = driver.findElement(By.xpath("//button[starts-with(text(),'Add Your Add')]"));
//		addYourAddressButton.click();
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Address Added Successfully']")));
//		System.out.println(driver.findElement(By.xpath("//div[text()='Address Added Successfully']")).getText());	
//		driver.quit();
//	}
//	public static void takeScreenShot( String name, WebDriver driver) throws IOException {
//		
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("./output/"+name+".png"));	
//	}
//	public static void selectDropdown(WebElement element, String value) {
//		Select select = new Select(element);
//		select.selectByVisibleText(value);
	}
	}
