package com.gap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Macys {
	WebDriver driver;
	Macys(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="")
	WebElement element;
	@FindBy(xpath="")
	WebElement color;
	@FindBy(xpath="")
	WebElement text;
	@FindBy(xpath="")
	WebElement verifyText;
	
	//@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.macys.com/account/signin");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		 
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("asma@123");
		email.click();
	List<WebElement> pickUpMode=driver.findElements(By.xpath("//*[@id=\"pw-input\"]"));
	List<WebElement> deliveryMode=driver.findElements(By.xpath("//*[@id=\"pw-input\"]"));
	List<WebElement> instoreMode=driver.findElements(By.xpath("//*[@id=\"pw-input\"]"));
	int size= pickUpMode.size();
    if(size>0) {
    	pickUpMode.get(1).click();
    }else if(size>1) {
    	deliveryMode.get(2).click();
    }else if(size>2) {
    	instoreMode.get(0).click();
    }
WebElement pw=driver.findElement(By.xpath("//*[@id=\"pw-input\"]"));

pw.sendKeys("123");
String text=pw.getAttribute("type");
System.out.println("text:"+" "+text);
pw.click();

WebElement logIn=driver.findElement(By.xpath("//*[@id=\"pw-input\"]"));
logIn.click();

}
	public void exe() {
		Generic generic=new Generic();
		generic.getCssValue(driver, element, "", "");
		generic.clickMethod(driver, element);
		
	}
	public void waitForElement() {
		WebDriverWait wait=new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("")));
	}
	@Test
	public void openBrow() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("current url is :"+" "+url);
		WebElement dropButton=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
	Select s=new Select(dropButton);
	s.selectByVisibleText("Option1");
	
	
	
	
	
	
	
	
	
	
	
	
	}
}