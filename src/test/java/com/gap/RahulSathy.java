package com.gap;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RahulSathy {
	WebDriver driver;

	@Test
	public void openBrow() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("current url is :" + " " + url);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement dropButton = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
//Actions ac=new Actions(driver);
		dropButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement option = driver.findElement(By.xpath("//*[contains(text(),\"Option1\")]"));

		option.click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[@name=\"radioButton\"]"));
		for (int i = 0; i < ele.size(); i++) {
			ele.get(1).click();
			// System.out.println("Text:"+" "+text);
		}
		WebElement inputBox = driver.findElement(By.xpath("//*[@placeholder=\"Type to Select Countries\"]"));
		inputBox.click();
		inputBox.sendKeys("India");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));

		checkBox.click();

		WebElement alartsendKeys = driver.findElement(By.xpath("//*[@placeholder=\"Enter Your Name\"]"));
		alartsendKeys.click();
		alartsendKeys.sendKeys("asma");
		WebElement alart = driver.findElement(By.xpath("//*[@value=\"Alert\"]"));
		alart.click();
		driver.switchTo().alert().accept();
		WebElement openWindow = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
		openWindow.click();
		String child = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		for (String s : win) {
			if (s == child) {
				driver.switchTo().window(s);
				driver.switchTo().defaultContent().getWindowHandles();
			}
		}
//Select s=new Select(option);
//s.selectByValue("option1");
		// s.selectByVisibleText("Option1");
	}

	public void verifySignInButtonIsDisplayed() {
		try {
			WebElement name = driver.findElement(By.xpath("//*[@value=\"Alert\"]"));
			WebElement pw = driver.findElement(By.xpath("//*[@value=\"Alert\"]"));
			WebElement signInButton = driver.findElement(By.xpath("//*[@value=\"Alert\"]"));
			name.sendKeys("");
			pw.sendKeys("");
			Assert.assertTrue(signInButton.isEnabled());

			if (signInButton.isEnabled()) {
				signInButton.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("sign In button is not enabled");
		}

	}

}
