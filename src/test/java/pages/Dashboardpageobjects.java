package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpageobjects {

	public WebDriver driver;

	@FindBy(xpath = "//h6[text()=\"Dashboard\"]")
	WebElement DashboardText;

	@FindBy(xpath = "//span[text()='Leave']")
	WebElement clickonleavelink;

	@FindBy(xpath = "//a[text()='Apply']")
	WebElement linkapply;

	@FindBy(xpath = "//a[text()=\"Apply\"]")
	WebElement TextApplyleave;

	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p oxd-text--subtitle-2\"]")
	WebElement Textnoleavetypes;

	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement fromedate;

	@FindBy(xpath = "(//input[@placeholder=\"yyyy-mm-dd\"])[2]")
	WebElement todate;

	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]")
	WebElement showleavewithstatus;

	@FindBy(xpath = "(//div[@class=\"oxd-select-text oxd-select-text--active\"])[2]")
	WebElement leavetype;

	@FindBy(xpath = "//input [@placeholder=\"Type for hints...\"]")
	WebElement Employeename;

	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[3]")
	WebElement subunit;

	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement clicksearchbtn;
	
	
	
	@FindBy(xpath = "//span[text()=\"No Records Found\"]")
	WebElement textrecords;
	
	
	
	

	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement profiledropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement clicklogout;

	public Dashboardpageobjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean dashboardtextisdisplayed() {

		boolean status = DashboardText.isDisplayed();
		return status;
	}

	public String dashboardtext() {
		String text = DashboardText.getText();
		return text;
	}

	public void leavelink() {

		clickonleavelink.click();
	}

	public void applyleave() {

		TextApplyleave.click();

	}

	public void fromdate(String date) {

		fromedate.sendKeys(date);

	}

	public void todate(String date) {
		todate.sendKeys(date);
	}

	public void showleavestatus(String status) {
     showleavewithstatus.sendKeys(status);

	}

	public void leavetype(String value) {

		leavetype.sendKeys(value);

	}

	public void employeename(String ename) {
		Employeename.sendKeys(ename);

	}

	public void subunit(String unit) {

		subunit.sendKeys(unit);

	}

	public void clicksearchbtn() {

		clicksearchbtn.click();

	}

	
	public String norecords() {
	String status= textrecords.getText();
	return status;
	}
	
	public void profiedropdown() {

		profiledropdown.click();

	}

	public void clicklogout() {

		clicklogout.click();

	}

}
