package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPageClass {

	WebDriver driver;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginButton;

	// constructor

	public FBLoginPageClass(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
