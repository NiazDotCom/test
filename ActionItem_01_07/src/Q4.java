import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait is always applied globally -- for all webelement
		// present in the script
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		clickOn(driver, close, 1);

		WebElement Find = driver.findElement(By.name("q"));
		SendKeys(driver, Find, 1, "mobile");
		
		WebElement Search = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		clickOn(driver, Search, 1);
		
		WebElement sliders = driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(1) > div > div:nth-child(1) > div > section._1MCcAi.D_NGuZ > div._1A0dov > div.gl5Kwg"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(sliders, 116, 385).release().build().perform();
		sliders.click();
		
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
