package lab.sesion.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn=driver.findElement(By.id("signinLink"));
	    signIn.click();

	WebElement wantToSell=driver.findElement(By.xpath("//a[@id='newCompanyAccount']"));
	wantToSell.click(); 
	WebElement emailfild=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement passwordf=driver.findElement(By.id("password"));
	WebElement loginBtn=driver.findElement(By.id("loginBtn"));
	emailfild.sendKeys("n190@gmail.com");
	passwordf.sendKeys("123@Nilo");
	loginBtn.click();
	WebElement accountBtn=driver.findElement(By.id("accountLink"));
	accountBtn.click();
	WebElement cardNumber=driver.findElement(By.id("cardNumberInput"));
	WebElement nameOfTheCard=driver.findElement(By.id("nameOnCardInput"));
	WebElement expMonth=driver.findElement(By.id("expirationMonthInput"));
	WebElement expYear=driver.findElement(By.id("expirationYearInput"));
	WebElement securityCod=driver.findElement(By.id("securityCodeInput"));
	WebElement addToYourCardBtn=driver.findElement(By.id("paymentSubmitBtn"));
	cardNumber.sendKeys("1236786433234567");
	nameOfTheCard.sendKeys("welsFargo");
	Select selectMonth=new Select(expMonth);
	selectMonth.selectByVisibleText("4");
	Select selectYear=new Select(expYear);
	selectYear.selectByVisibleText("2024");
	securityCod.sendKeys("123");
	addToYourCardBtn.click();
	}

}
