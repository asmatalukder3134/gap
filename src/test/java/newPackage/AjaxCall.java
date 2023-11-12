package newPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxCall {
	@Test
	public void openrowser(){
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jcpenney.com/m/jcpenney-coupons");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println("URL:"+" "+url);
	String title=driver.getTitle();
	System.out.println("Title:"+" " +title);
	WebElement inputBox=driver.findElement(By.xpath("//*[@id=\"searchInputId\"]"));
    inputBox.sendKeys("woman");
    //WebDriverWait wait=new WebDriverWait(8,timeUnit.SECONDS);
    //wait.until(ExpectedConditions.visibilityOf(inputBox)); 
    inputBox.click();
    List<WebElement>ele= driver.findElements(By.xpath(""));
   
}
}