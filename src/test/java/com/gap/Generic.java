package com.gap;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Generic {
	WebDriver driver;
	List<WebElement> element;
	public void Generic() {
		Macys macys=new Macys(driver);
			
		
	}
	public void clickMethod(WebDriver driver,WebElement element) {
		element.click();
		
	}
	public void hoverOver(WebDriver driver,WebElement element) {
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
		
	}
	public void selectElementFromDropDown(WebDriver driver,WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
		
	}
	public static void verifyTextWithAssert(WebDriver driver,WebElement element,String actualText,String expectedtext) {
	actualText=element.getText();
	boolean bool=actualText.equals(expectedtext);
	Assert.assertTrue(bool);
		
	
	}
public void verifyToolTrip(WebDriver driver,WebElement element,String attributeName, String veriftText) {
	String text=element.getAttribute(attributeName);
	boolean b=text.contains(veriftText);
	Assert.assertTrue(b);
}
public void getCssValue(WebDriver driver,WebElement element,String value,String actualcolor) {
	String color=element.getCssValue(value);
	System.out.println("color is:"+" "+color);
	boolean b=color.equals(actualcolor);
	Assert.assertTrue(b);
     
}
public void verifyElementIsDisplayed(WebDriver driver,List<WebElement> element) {
	int size=element.size();
	if(size>0) {
		
	}
}
}
