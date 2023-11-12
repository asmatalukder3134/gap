package com.gap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {
	WebDriver driver;
	@Test
	public void openBrowser() {
		//WebDriverManager.chromedriver().setup();
		 
		 driver=new ChromeDriver();
		driver.get("https://www.softwaretestingclass.com/");
		driver.manage().window().maximize();
		List<WebElement>ele=driver.findElements(By.xpath("//*[@class=\"sub-arrow\"]"));
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	Actions ac=new Actions(driver);
	ac.moveToElement(ele.get(0)).build().perform();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	List<WebElement>eles=driver.findElements(By.xpath("//*[contains(text(),\"Learn Database Testing\")]"));
    String text=eles.get(1).getText();
    System.out.println("text:"+""+text);
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	eles.get(1).click();
}

}