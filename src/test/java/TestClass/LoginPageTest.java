package TestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.LoginPagePom;

public class LoginPageTest extends BaseClass{
		
		@BeforeClass
		public void setup() {
			launchWeb();
		}
		

		@AfterClass
		public void teardown() {
			//driver.close();
		}
		
		@Test
		public void checkPageTitle() {
			String pageTitle =  driver.getTitle();
			if(pageTitle.equalsIgnoreCase("OrangeHRM")) {
				System.out.println("we are on correct page");
			}
		}
		
		@Test
		public void loginWithCorrectCredentials() {
			LoginPagePom loginPagePom = new LoginPagePom();
			
			String username = loginPagePom.getUsername();
			String password = loginPagePom.getPassword();
			
			loginPagePom.setUsername(username);
			loginPagePom.setPassword(password);
			
			loginPagePom.loginClick();
		}

	}


