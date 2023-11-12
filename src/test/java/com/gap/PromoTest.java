package com.gap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromoTest {
	@Test
	public void openrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jcpenney.com/m/jcpenney-coupons");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println("URL:"+" "+url);
	String title=driver.getTitle();
	System.out.println("Title:"+" " +title);
	WebElement inputBox=driver.findElement(By.xpath("//*[@id=\"searchInputId\"]"));
	inputBox.sendKeys("women dress");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	inputBox.sendKeys(Keys.ENTER);
	WebElement ele=driver.findElement(By.xpath("//*[@alt=\"Perceptions Short Lace Sleeve Fit & Flare Dresses\"]"));
ele.click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
List<WebElement>ell=driver.findElements(By.xpath("//*[contains(text(),\"large\")]"));
ell.get(2).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement addToCart=driver.findElement(By.xpath("//*[@data-automation-id=\"addToCart\"]"))
;
addToCart.click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement viewCartAndCheckOut=driver.findElement(By.xpath("//*[contains(text(),\"View Cart & Checkout\")]"));
viewCartAndCheckOut.click();
List<WebElement>coupon=driver.findElements(By.xpath("//*[@id=\"manual-apply-coupon-input\"]"));
coupon.get(0).sendKeys("BEAUTY25");


try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
List<WebElement> apply=driver.findElements(By.xpath("//*[contains(text(),\"Apply\")]"));
apply.get(3).click();
//Actions ac=new Actions(driver);
//ac.moveToElement(apply).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String text=driver.findElements(By.xpath("//*[contains(text(),\"Oops. We couldn't proces\")]")).get(1).getText();
//String text=errorText.get(1).getText();
System.out.println("text:"+" "+text);
//if(text.contains("Oops. We couldn't process this request. Please try again")) {
//	System.out.println("your element is present");
//}else {
//	System.out.println(" element not present");
//}

//Assert.assertTrue(errorText.get(0).getText().contains("Oops. We couldn't process this request. Please try again."));
 Assert.assertEquals(text,"Oops. We couldn't process this request. Please try again.");
}}
