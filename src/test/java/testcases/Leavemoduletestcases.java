package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Dashboardpageobjects;
import pages.Leavemodulepageobjects;
import pages.Loginpageobjects;

public class Leavemoduletestcases extends Testbase {

	
	
	
	
	
	
	@Test(groups={"Smoke"})
	public void login() {

		Loginpageobjects loginpage = new Loginpageobjects(this.driver);

		loginpage.login("Admin", "admin123");
		loginpage.clickloginbtn();

	}

	@Test(priority = 2,groups= {"Smoke"})
	public void leavemodule() throws InterruptedException {
		Loginpageobjects loginpage = new Loginpageobjects(this.driver);

		loginpage.login("Admin", "admin123");
		loginpage.clickloginbtn();

		Dashboardpageobjects dashboardpage = new Dashboardpageobjects(this.driver);

		System.out.println("dashboard text verification on UI");

		Assert.assertTrue(dashboardpage.dashboardtextisdisplayed());
		System.out.println(dashboardpage.dashboardtext());

		System.out.println("click on leave");

		dashboardpage.leavelink();

		Leavemodulepageobjects lm = new Leavemodulepageobjects(driver);
		lm.assignleave();

		System.out.println("leavetype");

		lm.leavetype("CAN - Bereavement");

		lm.Fromdate("2023-02-15");

		lm.Todate("2023-02-17");

		Thread.sleep(5000);
		lm.Textarea("i am suffering with fever and body pains kindly grant 3 days leave permission");

		lm.Assignbtn();

		lm.profiledropdown();
         lm.clicklogout();
}

}