package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Adminpageobjects;
import pages.Loginpageobjects;

public class Admintestcases extends Testbase {
	
	
	
	
	
	
	@Test(groups={"Smoke"})
	public void toverifyusername() {

		Loginpageobjects loginpage = new Loginpageobjects(this.driver);

		System.out.println("Enter the username and password");
	loginpage.login("Admin", "admin123");
		System.out.println("click on login button");
		loginpage.clickloginbtn();

		Adminpageobjects ad = new Adminpageobjects(this.driver);

		System.out.println("click on Admin");
		ad.clickonAdmin();

		System.out.println("To verify the text on UI");
		ad.textuser();
		System.out.println(ad.textuser());

		System.out.println("Enter the username");
		ad.setusername("Admin");

		System.out.println("Search button");
		ad.clickonsearchbutton();

		System.out.println("verify the name");
		ad.recordsfound();
		System.out.println(ad.recordsfound());

		System.out.println("click on profile menu");

		ad.clickprofiledropdown();

		System.out.println("click on log out");

		ad.clicklogout();

	}

	
	
	
	
	
}
























