package GenericUtility;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverUtility {
static WebDriver driver;
public void webDriverManager() {
	WebDriverManager.chromedriver().setup();
}
}
