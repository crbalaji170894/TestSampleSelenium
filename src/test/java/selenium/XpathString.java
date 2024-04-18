package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathString {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");
	
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		WebElement findAccount = driver.findElement(By.xpath("//input[@id='identify_email']"));
		
		findAccount.sendKeys("crbalaji17@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
	
	}

}
