package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAutomation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		WebElement dropDownWebElement = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select sel = new Select(dropDownWebElement);
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement eachOption:options)
		{
			System.out.println(eachOption.getText());
		}
	
	
	
	}

}
