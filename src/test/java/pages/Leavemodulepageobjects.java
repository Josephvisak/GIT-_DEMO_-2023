package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leavemodulepageobjects {

	public WebDriver driver;

	public Leavemodulepageobjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//h6[text()=\"Dashboard\"]")
	WebElement DashboardText;

	@FindBy(xpath = "//span[text()='Leave']")
	WebElement clickonleavelink;

	@FindBy(xpath = "//a[text()=\"Assign Leave\"]")
	WebElement clickonAssignleave;
	
	
	
	
	
	
	
	@FindBy(xpath = "//div[@class=\"oxd-select-text-input\"]")
	WebElement leavetype;

	@FindBy(xpath = "//input[@placeholder=\"yyyy-mm-dd\"]")
	WebElement FromDate;

	@FindBy(xpath = "(//input[@placeholder=\"yyyy-mm-dd\"])[2]")
	WebElement ToDate;

	@FindBy(xpath = "//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
	WebElement Textarea;

	@FindBy(xpath = "//button[text()=\" Assign \"]")
	WebElement AssignButton;

	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement profiledropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement clicklogout;
	
	
	
	
	
	
	
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

	public void assignleave() {

		clickonAssignleave.click();

	}
	
	
	
	
	
	
	
	
	
	public void leavetype(String type) {

		leavetype.sendKeys(type);

	}

	public void Fromdate(String date) {
		FromDate.sendKeys(date);
	}

	public void Todate(String date) {

		ToDate.sendKeys(date);

	}

	public void Textarea(String entertext) {

		Textarea.sendKeys(entertext);

	}

	public void Assignbtn() {

		AssignButton.click();

	}

	
	
	public void profiledropdown() {

		profiledropdown.click();

	}

	public void clicklogout() {

		clicklogout.click();

	}

	
	
	
	
	
	
	
	
}
