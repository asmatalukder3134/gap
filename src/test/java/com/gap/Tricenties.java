package com.gap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricenties {
	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tricentis.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.equals("https://www.tricentis.com/"));
		String title=driver.getTitle();
		System.out.println(title);
		List<WebElement>ele=driver.findElements(By.xpath("//*[contains(text(),\"Contact\")]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{ele.get(2).click();}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		WebElement reason=driver.findElement(By.xpath("//*[@id=\"Reason_for_contacting__c\"]"));
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		WebElement country=driver.findElement(By.xpath("//*[@id=\"Country\"]"));
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"Phone\"]"));
		WebElement company=driver.findElement(By.xpath("//*[@id=\"Company\"]"));
		WebElement role=driver.findElement(By.xpath("//*[@id=\"Role__c\"]"));
		WebElement message=driver.findElement(By.xpath("//*[@id=\"Contact_Me_Details__c\"]"));
		
		
		WebElement checkbox=driver.findElement(By.id("emailOptin"));
		WebElement submit=driver.findElement(By.xpath("//*[@class=\"mktoButton\"]"));
		reason.click();
		Select s=new Select(reason);
		s.selectByVisibleText("General Inquiry");
		email.sendKeys("at123@gmail.com");
		fname.sendKeys("suha");
		lname.sendKeys("sham");
		country.sendKeys("USA");
		phone.sendKeys("347656");
		company.sendKeys("GAP");
		//role.sendKeys("QA Automation Engineer");
		Select ss=new Select(role);
		ss.selectByVisibleText("QA / Product (VP, director, manager)");
		message.sendKeys("asma");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)", "");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkbox.click();
		submit.click();
		List<WebElement> eles=driver.findElements(By.xpath("//*[contains(text(),\"Thank you for your submission.\")]"));
		String text=eles.get(0).getText();
		System.out.println("text:"+" "+text);     
		Assert.assertTrue(text.contains("Thank you for your submission"));
}
}