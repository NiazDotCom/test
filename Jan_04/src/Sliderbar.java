import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sliderbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com/index.php?id_category=5&controller=category");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement sliders = driver.findElement(By.xpath("//*[@id='layered_price_slider']/div"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(sliders, 145, 1144).release().build().perform();
		sliders.click();		
		
		
	}

}
