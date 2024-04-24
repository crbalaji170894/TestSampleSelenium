package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Constants;

public class BaseClassSelenium {

	WebDriver driver;

	public WebDriver lauchChromeBrowser() {

		System.setProperty(Constants.chromeKey, Constants.projectPath + "\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver getWebPage(String url) {

		driver.get(url);

		return driver;
	}
}
