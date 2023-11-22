package gaps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gap.Generic;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bases {
	Generic generic;
	WebDriver driver;
	WebElement ele=driver.findElement(By.xpath(""));
	WebElement scteleElement=driver.findElement(By.xpath(""));
	WebElement text=driver.findElement(By.xpath(""));
	WebElement actualText=driver.findElement(By.xpath(""));
	WebElement expectedText=driver.findElement(By.xpath(""));
	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(driver.getTitle().contains("Shop Now & Save"));
		WebElement inputBox=driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]"));
		inputBox.sendKeys("iphone 14");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputBox.click();
	

//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window[0]","scrollIntoView(mario)");
//		WebElement mario=driver.findElement(By.xpath("//*[@alt=\"Funko - POP! Movies: Raiders of the Lost Ark - Marion Ravenwood\"]"));
//		String text=mario.getAttribute("alt");
//		if(text.contains("Funko")) {
//			System.out.println("youe element is present");
//			
//		}else{
//		System.out.println("element not present");
//			
//		}
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)");
	}
	public void takeClass() {
		 generic=new Generic();
		generic.clickMethod(driver, ele);
		generic.hoverOver(driver, ele);
		generic.selectElementFromDropDown(driver, ele, null);
		generic.verifyTextWithAssert(driver, scteleElement, null, null);
	}
public void login() {
	generic.verifyTextWithAssert(driver, scteleElement, null, null);
}
}
