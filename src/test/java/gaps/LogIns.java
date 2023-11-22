package gaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIns {
	@Test
	public void openBrowser() {
		System.setProperty("WebDriver.gecko.driver","C:\\Users\\13475\\Downloads\\geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions c=new ChromeOptions();
		//c.setHeadless(true);
		// driver=new ChromeDriver(c);
		//WebDriverManager.firefoxdriver().driverVersion("4.14.1").setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://search.yahoo.com/");
		System.out.println("title"+""+driver.getTitle());
		System.out.println("me");
	}

}
