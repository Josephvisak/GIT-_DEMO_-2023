package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Dashboardpageobjects;
import pages.Loginpageobjects;

public class Dashboardlogintestcase extends Testbase {

	
	
	
	
	
	
	
	
	public Loginpageobjects loginpage;
	public Dashboardpageobjects dashboardpage;

	@Test()
	public void dashboardpage() throws InterruptedException {
		Loginpageobjects loginpage = new Loginpageobjects(driver);

		loginpage.login("Admin", "admin123");

		loginpage.clickloginbtn();

		Dashboardpageobjects dashboardpage = new Dashboardpageobjects(driver);

		System.out.println("dashboard text verification on UI");

		Assert.assertTrue(dashboardpage.dashboardtextisdisplayed());
		System.out.println(dashboardpage.dashboardtext());

		System.out.println("click on leave");

		dashboardpage.leavelink();

		System.out.println("Apply on leave");

		dashboardpage.applyleave();
		System.out.println("from date");

		dashboardpage.fromdate("10-02-2023");

		System.out.println("Apply on todate");

		dashboardpage.todate("15-02-2023");
		System.out.println(" leavestatus");

		//dashboardpage.showleavestatus("scheduled");

//		System.out.println(" leavetype");
//
//		Thread.sleep(5000);
//	dashboardpage.leavetype("CAN-personal");
//
//	System.out.println("Enter employeename");
//
//		dashboardpage.employeename("Admin");
//
//	System.out.println("Apply on subunit");
//
//		dashboardpage.subunit("Engineering");
//
//	System.out.println("records text");
//
//		dashboardpage.norecords();
//
//	dashboardpage.clicksearchbtn();

		System.out.println("click on profile dropdown");

		dashboardpage.profiedropdown();

		System.out.println("click on log out");

		dashboardpage.clicklogout();

	}

}












