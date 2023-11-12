package com.gap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JCpenny {
 @Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement inputBox=driver.findElement(By.xpath("//*[@type=\"search\"]"));
		inputBox.sendKeys("dhaka");
//		List<WebElement> algolia=driver.findElements(By.xpath("//*[@class=\"algolia-docsearch-suggestion--title\"]"));
//	algolia.get(0).click();
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(inputBox, inputBox); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	List<WebElement>callback=driver.findElements(By.xpath("//*[contains(text(),\"dhaka\")]"));
	String text=callback.get(1).getText();
	Assert.assertTrue(text.contains("dhaka"));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	callback.get(1).click();
	}
public void selectElementFromDropDown(WebDriver driver,WebElement element,String text,int index) {
	//WebDriverWait wait=new WebDriverWait(driver, 8);
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	Select select=new Select(element);
	select.deselectByIndex(index);
	 
}
}
