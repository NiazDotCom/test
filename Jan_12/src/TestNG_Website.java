import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Website {

	WebDriver driver;//Global Object so each method can access driver
	
	// handling the login
	
	@BeforeTest
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("Browser OPpen");
	}
	
	// test annotations
	@Test(enabled = true, priority = 0, description = "This test is mandatory")
	public void SignUp(){
		
		System.out.println("User should first register an account");
	}
	
	@Test
	public void SignIn(){
		System.out.println("Login Success");
	}
	
	@Test
	public void ChangeDOB(){
		System.out.println("DOB Changed");
	}
	
	@Test
	public void ChangeSchool(){
		System.out.println("School Changed");
	}
	
	@Test
	public void SendEmail(){
		System.out.println("Create Mail");
	}
	
	@Test
	public void SignOut(){
		System.out.println("Logout from app");
	}

	// Post conditions Annotation
	@AfterTest
	public void CloseBrowser(){
		System.out.println("Browser Close");
	}
	
}
