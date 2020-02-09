import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// handling the login
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String PMS = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		System.out.println(PMS);
		
		
		
		
	}

}
