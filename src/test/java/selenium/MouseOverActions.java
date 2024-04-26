package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

//		driver1.get("https://www.facebook.com/login.php");
//
//		WebElement messengerWebElement = driver1.findElement(By.xpath("//a[text()='Messenger']"));
//
//		Actions acc = new Actions(driver1);
//
//		acc.moveToElement(messengerWebElement).contextClick().perform();
		
		
//		driver1.get("https://demo.guru99.com/test/simple_context_menu.html");
//		
//		WebElement doubleclickButton = driver1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//
//		Actions acc = new Actions(driver1);
//		
//		acc.doubleClick(doubleclickButton).perform();
		
		driver1.get("https://demoqa.com/droppable/");
		
		WebElement sourceWebElement = driver1.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement destinationWebElement = driver1.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions acc = new Actions(driver1);
		
		acc.dragAndDrop(sourceWebElement, destinationWebElement).perform();
	
	
	}

}
