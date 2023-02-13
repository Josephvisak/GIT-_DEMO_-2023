package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Adminpageobjects {
	public WebDriver driver;

	 
 public Adminpageobjects(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
	WebElement clickonAdminmodule;

	@FindBy(xpath = "//h6[text()=\"User Management\"]")
	WebElement textusermanagement;

	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement username;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement clickonsearchbtn;

	@FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span\"]")
	WebElement RecordfoundTxt;

	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement  clickprofiledropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement clicklogout;

	public void clickonAdmin() {

		clickonAdminmodule.click();

	}

	public String textuser() {
		String text = textusermanagement.getText();
		return text;
	}

	public void setusername(String uname) {

		username.sendKeys(uname);

	}

	public void clickonsearchbutton() {

		clickonsearchbtn.click();
	}

	public String recordsfound() {

		String status = RecordfoundTxt.getText();
		return status;

	}

	public void clickprofiledropdown() {

		clickprofiledropdown.click();

	}

	public void clicklogout() {

		clicklogout.click();

	}

}
