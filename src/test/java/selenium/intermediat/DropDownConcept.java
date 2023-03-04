package selenium.intermediat;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownConcept {
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement allDepartmentDro0pdown=driver.findElement(By.id("search"));
		Select select=new Select(allDepartmentDro0pdown);
		select.selectByVisibleText("Computers");
		WebElement searchBar=driver.findElement(By.id("searchInput"));
		searchBar.sendKeys("Amazon eero mesh Wifi router");
		WebElement searchBtn=driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		WebElement productWifiRouter=driver.findElement(By.className("products__name"));
		productWifiRouter.click();
		WebElement quantity=driver.findElement(By.className("product__select"));
		Select select1=new Select(quantity);
		select1.selectByVisibleText("4");
	}
}