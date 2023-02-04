package Cermati;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import GenericUtility.WebDriverUtility;
public class EBayAccessProductViaCategory {
	static WebDriver driver;
public static void main(String[] args) throws Throwable {
	//Launching Only in ChromeBrowser
	WebDriverUtility webUtil=new WebDriverUtility();
	webUtil.webDriverManager();
	driver=new ChromeDriver();
	url();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Direct Calling Methods
	searchProduct();
	Thread.sleep(2000);
	verifyTheValue();
	driver.quit();
}
public static void url() {
	driver.get("https://www.ebay.com/");
}
public static void searchProduct() {
	driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("Samsung");
	driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
	}
public static void verifyTheValue() {
	WebElement value = driver.findElement(By.xpath("(//div[@class=\"s-item__wrapper clearfix\"]//span[@role=\"heading\"])[2]"));
	String word = value.getText();
	if(word.contains("Samsung")) {
		System.out.println("The given word is present");
	}
	else {
		System.out.println("The given word is not present");
	}	
	}
}
