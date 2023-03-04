package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingInTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
        WebElement signIn=driver.findElement(By.id("signinLink"));
        signIn.click();
        WebElement emailField=driver.findElement(By.id("email"));
        WebElement passwordField=driver.findElement(By.id("password"));
        WebElement loginField=driver.findElement(By.id("loginBtn"));
        emailField.clear();
        emailField.sendKeys("hai123@gmail.com");
        passwordField.sendKeys("123@hfjA");
        loginField.click();
 
	}

}
