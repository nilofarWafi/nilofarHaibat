package selenium.intermediat;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDownPractice {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.aa.com/");
	
	driver.findElement(By.xpath("//button[@id='cookieBannerClose']")).click();
	
	WebElement oneWayRadioButton = driver.findElement
			(By.xpath("(//span[@class='control'])[3]"));
	if(!oneWayRadioButton.isSelected()) {
		oneWayRadioButton.click();
	}
	WebElement departure = driver.findElement
			(By.xpath("(//input[contains(@name,'origin')])[1]"));
	
	departure.clear();
	departure.sendKeys("New");
	List<WebElement> deptCity = driver.findElements(By.xpath("//a[starts-with(@id,'ui-id')]"));
	
	for(WebElement city:deptCity) {
		if(city.getText().contentEquals("JFK - New York John F Kennedy Intl, NY")) {
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].click();", city);
			
		}
	}
	
	WebElement arrivalCity = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	arrivalCity.clear();
	arrivalCity.sendKeys("Wash");
	List<WebElement> arrCity = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
	
	for(WebElement city:arrCity) {
		if(city.getText().contentEquals("IAD - Washington Dulles Intl, DC")) {
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].click();", city);
			
		}
	}
	
	WebElement selectPass = driver.findElement(By.xpath("//select[starts-with(@id,'flightSearch')]"));
	Select select = new Select(selectPass);
	select.selectByVisibleText("5");
	
	 JavascriptExecutor js = ((JavascriptExecutor) driver);
	 js.executeScript("document.getElementById('aa-leavingOn').value='02/19/2023'");
	 
	 driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();
	
	 boolean isFlightPresent = new WebDriverWait(driver, Duration.ofSeconds(40))
			 .until(ExpectedConditions.presenceOfElementLocated(
					 By.xpath("//h1[contains(text(),'Choose flights')]")))
			 .isDisplayed();
	 
	 // exactly like below
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Choose flights')]")));
//	 WebElement flight = driver.findElement(By.xpath("//h1[contains(text(),'Choose flights')]"));
//	 flight.isDisplayed();
	 
	 System.out.println(isFlightPresent);
	 
     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}