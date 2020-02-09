import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verifyasserturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl.contains("facebook"));
		
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle.contains("Facebook"));
		
		if (currentTitle.contains("Facebook"))
		{
			System.out.println("Validation 1: Passed - Title is working");
		}
		else
		{
			System.out.println("Validation 1: Failed - Title is not working");
		}
	}

}
