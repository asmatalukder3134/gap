package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asma {
	@Test
	public void openBrowsers() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(driver.getTitle().contains("Shop Now & Save"));
		WebElement menu=driver.findElement(By.xpath("//*[@aria-label=\"Menu\"]"));
        menu.click();
       //js.executeScript("window.ScrollBy(0,250)");
        
       WebElement cellPhone=driver.findElement(By.xpath("//*[@data-id=\"node-480\"]"));
       cellPhone.click();
       WebElement iphone=driver.findElement(By.xpath("//*[@data-id=\"node-429\"]"));
//       JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window[0]","scrollIntoView(google)");
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

       //WebElement atnt=driver.findElement(By.xpath("//*[contains(text(),\"AT&T\")]"));
	iphone.click();
	WebElement iphone14=driver.findElement(By.xpath("//*[@data-lid=\"ubr_mob_ip_iphone_14\"]"));
	iphone14.click();
	}

	}
