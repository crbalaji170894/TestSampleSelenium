package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/webtable/");

		List<WebElement> tableElements = driver.findElements(By.xpath("//table[@id='table01']"));

		for (WebElement eachElement : tableElements) {

			List<WebElement> tablerowelements = eachElement.findElements(By.tagName("tr"));

			for (WebElement eachrow : tablerowelements) {

				List<WebElement> tableDataElements = eachrow.findElements(By.tagName("td"));

				for (WebElement eachDataelement : tableDataElements) {

					String text = eachDataelement.getText();

					if (text.equals("Selenium")) {
						eachDataelement.click();
						}

					}

				}
			}

		
	}
}
