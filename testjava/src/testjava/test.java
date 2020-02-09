package testjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// handling the login
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.findElement(By.xpath("//div[@class='header_user_info']")).click();
		//driver.findElement(By.xpath("//div[@id='contact-link']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("human@human.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("human@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("dress");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	}

}
