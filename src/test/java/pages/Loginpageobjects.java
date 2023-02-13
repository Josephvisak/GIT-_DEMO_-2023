package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {

	public WebDriver driver;
	
	public Loginpageobjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(name = "username")
	WebElement usernameinputbox;

	@FindBy(name = "password")
	WebElement passwordinputbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickloginbutton;

	

	public boolean usernameinputboxispresent() {
		boolean status = usernameinputbox.isDisplayed();
		return status;
	}

	public String usernametext() {
		String text = usernameinputbox.getText();
		return text;
	}

	public void setusername(String uname) {

	
		usernameinputbox.sendKeys(uname);

	}

	public void setpassword(String pword) {

		passwordinputbox.sendKeys(pword);

	}

	public boolean ispasswordinputboxispresent() {

		boolean status = passwordinputbox.isDisplayed();
		return status;
	}

	public boolean loginbtnenabled() {
		boolean status = clickloginbutton.isEnabled();

		return status;
	}

	public void clickloginbtn() {

		clickloginbutton.click();
	}

	public void login(String uname, String pword) {

		this.setusername(uname);
		this.setpassword(pword);
	}
	
	}

