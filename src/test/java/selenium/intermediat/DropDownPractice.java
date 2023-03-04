package selenium.intermediat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.get("https://tek-retail-ui.azurewebsites.net/");
	WebElement allDepartment=driver.findElement(By.id("search"));
	Select select=new Select(allDepartment);
	select.selectByVisibleText("Computers");
	WebElement router=driver.findElement(By.id("searchInput"));
	router.sendKeys("Amazon eero mesh Wifi router");
	WebElement search=driver.findElement(By.id("searchBtn"));
	search.click();
	WebElement routerWifi=driver.findElement(By.className("products__name"));
	routerWifi.click();
	WebElement quantity=driver.findElement(By.className("product__select"));
	Select select1=new Select(quantity);
	select1.selectByVisibleText("5");
	

	}

}
