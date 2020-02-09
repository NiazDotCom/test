import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jet.com/");
		
		//get the rows tagname
		List<WebElement> img = driver.findElements(By.tagName("img"));
		
		for (int i = 0; i < img.size(); i++)
		{
			System.out.println(img.get(i).getAttribute("src"));
		}
		System.out.println(img.size()-1);
	}

}
