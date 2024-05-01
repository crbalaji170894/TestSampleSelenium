package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?%3CAuthentication");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		

	}

}
