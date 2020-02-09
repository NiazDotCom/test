import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		
		// driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		// get input tag and store in List variable/obj number_of_hiddenelements
		List<WebElement>number_of_hiddenelements = driver.findElements(By.tagName("input"));
		
		System.out.println(number_of_hiddenelements.size());
		// print total numbers of input tag 
		for(int i = 0; i<number_of_hiddenelements.size();i++)
		// get all hidden element text
		{
			if (number_of_hiddenelements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden"))
			// check empty text
			{
				if(!(number_of_hiddenelements.get(i).getAttribute("value").trim().isEmpty()))
				// print all hidden element text
				{
					System.out.println("hidden elements text=" + i +" "+number_of_hiddenelements.get(i).getAttribute("value").trim());
				}
			}
		}
		
	}

}
