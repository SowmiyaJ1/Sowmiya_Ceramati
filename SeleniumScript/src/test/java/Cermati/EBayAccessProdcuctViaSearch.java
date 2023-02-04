package Cermati;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import GenericUtility.WebDriverUtility;
public class EBayAccessProdcuctViaSearch {
	static WebDriver driver;
public static void main(String[] args) throws Throwable {
	WebDriverUtility webUtil=new WebDriverUtility();
	webUtil.webDriverManager();
	driver=new ChromeDriver();
	url();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Direct calling Methods
	selectCategoryElectronics();
	selectCategoryCellPhonesAccessories();
	filterByScreenSize();
	filterByPrice();
	filterByItemLocation();
	applyOption();
	Thread.sleep(2000);
	verifyTheFilters();
	driver.quit();
}
public static void url() {
	driver.get("https://www.ebay.com/");
}
public static void selectCategoryElectronics() {
	driver.findElement(By.xpath("//li[@class=\"hl-cat-nav__js-tab\"]//a[text()=\"Electronics\"]")).click();
}
public static void selectCategoryCellPhonesAccessories(){
	driver.findElement(By.xpath("//span[contains(text(),\"Cell\")]")).click();
	driver.findElement(By.xpath("//a[contains(text(),\"Smartphones\")]")).click();
	driver.findElement(By.xpath("(//div[@class=\"b-carousel__header  sameline\"]//div[2])[1]")).click();	
}
public static void filterByScreenSize() {
	driver.findElement(By.xpath("//div[@id=\"c3-mainPanel-Screen%20Size\"]")).click();
	//Considered 2nd Option
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
}
public static void filterByPrice() {
	driver.findElement(By.xpath("//div[@id=\"c3-mainPanel-price\"]")).click();
	//Considered 1000 to 2000 Hard code
	driver.findElement(By.xpath("(//div[@class=\"x-textrange__block\"]//input[@type=\"text\"])[1]")).sendKeys("1000");
	driver.findElement(By.xpath("(//div[@class=\"x-textrange__block\"]//input[@type=\"text\"])[2]")).sendKeys("2000");
}
public static void filterByItemLocation() {
	driver.findElement(By.xpath("//div[@id=\"c3-mainPanel-location\"]")).click();
	//For Worldwide Location Hard Code
	driver.findElement(By.xpath("//input[@aria-label=\"Worldwide\"]")).click();
}
public static void applyOption() {
	driver.findElement(By.xpath("//button[@class=\"x-overlay-footer__apply-btn btn btn--primary\"]")).click();
}
public static void verifyTheFilters() {
	driver.findElement(By.xpath("(//span[@class=\"brm__flyout__btn-label\"])[1]")).click();
	List<WebElement> value = driver.findElements(By.xpath("//ul[@class=\"brm__aspect-list\"]/li[@class=\"brm__aspect-item brm__aspect-item--applied\"]"));
	for(WebElement e:value) {
		System.out.println(e.getText());
	}
}
}
