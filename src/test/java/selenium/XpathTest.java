package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		username.sendKeys("test@gamil.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		password.sendKeys("test@123A");

		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

		loginButton.click();

	}

}
