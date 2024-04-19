package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FBLoginPageClass;

public class LoginFbTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		FBLoginPageClass object = new FBLoginPageClass(driver);

		object.getUsername().sendKeys("test@gmail.com");
		object.getPassword().sendKeys("test@123");
		object.getLoginButton().click();
	}
}
