package JiraJenkins;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EclipseToJiraToJenkins {
public static void main(String[] args) throws Throwable {
	System.setProperty("Webdriver.driver.chrome", "C:\\Users\\Sowmiya\\Application\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("Sowmiya");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	System.out.println("Logged in Succesfully");
	driver.quit();
}
}
