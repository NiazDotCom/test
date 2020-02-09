import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");
		
		WebElement tables = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
		//get the rows tagname
		List<WebElement> rows = tables.findElements(By.tagName("tr"));
		//increment rows
		for (int i = 0; i<rows.size(); i++)
		{
			//finding column tagname
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			//will go through every single row and column garb their value
			for (int j = 0; j<columns.size(); j++)
			{
				System.out.println(columns.get(j).getText());
			}
		}
		
		
	}

}
