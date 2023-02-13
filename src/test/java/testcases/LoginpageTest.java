package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Dashboardpageobjects;
import pages.Loginpageobjects;

public class LoginpageTest extends Testbase {




	@Test(groups= {"Smoke"})
	public void validlogincredentials() {

		Loginpageobjects loginpage= new Loginpageobjects(driver);

		System.out.println("Enter the username");
		Assert.assertTrue(loginpage.usernameinputboxispresent(),"usernameinputbo wasnot present on the UI");
		

		loginpage.setusername("Admin");
		
		
		System.out.println("Enter the password");
		Assert.assertTrue(loginpage.ispasswordinputboxispresent(), "password input box was not present on the UI");
		loginpage.setpassword("admin123");

		System.out.println("click on the loginbtn");
		Assert.assertTrue(loginpage.loginbtnenabled());
		loginpage.clickloginbtn();
	
	}
	}	
	

























