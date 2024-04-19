package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextAndPArtialLinkedText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//		WebElement linkedText = driver.findElement(By.linkText("Gmail"));
//		linkedText.click();
		
		driver.findElement(By.partialLinkText("Gm")).click();

	
	}

}
