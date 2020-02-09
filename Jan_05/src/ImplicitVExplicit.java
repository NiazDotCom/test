import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitVExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait is always applied globally -- for all webelement
		// present in the script
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		WebElement FN = driver.findElement(By.name("firstname"));
		WebElement LN = driver.findElement(By.name("lastname"));
		

		SendKeys(driver, FN, 10, "Ali");
		SendKeys(driver, LN, 10, "test");
		
		WebElement FLink = driver.findElement(By.linkText("Forgot account?"));
		clickOn(driver, FLink, 3);
	}
		
		public static void SendKeys (WebDriver driver, WebElement locators, int timeout, String value)
		// Explicit wait does not have any command like implicit wait
		// It's an explicit wait
		// (WebDriverWait) is used for particular element action to take place. It's condition based.
		// *** it must have a condition
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
			locators.sendKeys(value);
		}
		
		public static void clickOn(WebDriver driver, WebElement elements, int timeout)
		{
			new WebDriverWait (driver, timeout).until(ExpectedConditions.elementToBeClickable(elements));
			elements.click();
		}
		
	}
