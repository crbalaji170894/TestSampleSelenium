package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("test@gmail.com");
		
		Thread.sleep(10000);

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123");
		
		Thread.sleep(10000);

		WebElement loginButton = driver.findElement(By.name("login"));

		loginButton.click();

		System.out.println(driver.getCurrentUrl());

	}

}
