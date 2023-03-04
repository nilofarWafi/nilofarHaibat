package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFirFoxB {
	public static void main(String []args) throws InterruptedException {
		String url="https://tek-retail-ui.azurewebsites.net/";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.close();
	}

}
