package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		// webDriver is an Interface
		// Each browser drivers are class files

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		System.setProperty("webdriver.geko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.google.com/");

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");

		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("https://www.youtube.com/?gl=IN");

	}

}
