package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);

		File desFile = new File("C:\\Users\\HP\\eclipse-workspace\\TestSampleSelenium\\screenshot\\testscreenshot1.png");

		FileUtils.copyFile(srcFile, desFile);

	}
}
