import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("JOHN123");
		driver.findElement(By.name("lastname")).sendKeys("Last456");
		Select dropdown = new Select (driver.findElement(By.id("month")));
		dropdown.selectByIndex(5);
		//dropdown.selectByVisibleText("Jul");
		Thread.sleep(1000);
		Select dropdown1 = new Select (driver.findElement(By.id("day")));
		dropdown1.selectByIndex(10);
		Select dropdown2 = new Select (driver.findElement(By.id("year")));
		//dropdown2.selectByIndex();
		//dropdown2.selectByValue("1996");
		dropdown2.selectByVisibleText("1996");
		
		driver.findElement(By.id("u_0_9")).click();
		//driver.findElement(By.cssSelector("#u_0_6")).click();
		
		driver.findElement(By.name("websubmit")).click();

		
		
	}
}
