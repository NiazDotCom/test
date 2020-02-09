import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG1 {

		// pre condition annotation
		@BeforeTest
		public void OpenBrowser(){
			System.out.println("Browser OPpen");
		}
		
		// test annotations
		@Test(enabled = false, priority = 0, description = "This test is mandatory")
		public void FirstRegistration(){
			System.out.println("User should first register an account");
		}
		
		@Test
		public void Login(){
			System.out.println("Login Success");
		}
		
		@Test
		public void PrepareEmail(){
			System.out.println("Create Mail");
		}
		
		@Test
		public void SignOff(){
			System.out.println("Logout from app");
		}

		// Post conditions Annotation
		@AfterTest
		public void CloseBrowser(){
			System.out.println("Browser Close");
		}
		
		
		
}
