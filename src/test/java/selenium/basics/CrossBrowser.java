package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		String browserType="chrome";
		String url="https://tek-retail-ui.azurewebsites.net/products";
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(url);
		
//		driver.findElement(By.id("signinLink")).click();
//		WebElement emailF=driver.findElement(By.id("email"));
//		WebElement passF=driver.findElement(By.id("password"));
//		WebElement loginF=driver.findElement(By.id("loginBtn"));
//		
//		emailF.sendKeys("n123@gamil.com");
//		passF.clear();
//		passF.sendKeys("123@uhg");
//		loginF.isDisplayed();
//		loginF.click();
//		
//		WebElement creatA=driver.findElement(By.id("newAccountBtn"));
//		creatA.click();
//		
//		WebElement nameF=driver.findElement(By.name("name"));
//		WebElement emailFf=driver.findElement(By.id("emailInput"));
//		WebElement passwordF=driver.findElement(By.id("passwordInput"));
//		WebElement confirmPas=driver.findElement(By.name("confirmPassword"));
//		WebElement loginBtn=driver.findElement(By.id("signupBtn"));
//		nameF.sendKeys("tahmina");
//		emailFf.sendKeys("2776t@gamil.com");
//		passwordF.sendKeys("1234Asg@");
//		confirmPas.sendKeys("1234Asg@");
//		loginBtn.click();
//		 
//		
//		List<WebElement> bb=driver.findElements(By.tagName("input"));
//		for(WebElement alldd:bb) {
//			System.out.println(alldd.getTagName());
//		}
		}
	}