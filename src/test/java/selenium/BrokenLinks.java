package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIkYrFiKTvhQMVPgqDAx3AAA0NEAAYASAAEgJjA_D_BwE_k_");

		List<WebElement> elements = driver.findElements(By.xpath("//a"));

		for (WebElement eachElement : elements) {

			String url = eachElement.getAttribute("href");

			// System.out.println(url);

			try {
				URL url1 = new URL(url);

				URLConnection openConnection = url1.openConnection();

				HttpURLConnection connection = (HttpURLConnection) openConnection;

				connection.setConnectTimeout(5000);

				connection.connect();

				if (connection.getResponseCode() >= 400) {
					System.out.println(connection.getResponseMessage());
					System.out.println(connection.getResponseCode());
					System.out.println("This is broken Link");
					System.out.println(url);

				}
				else
				{
					System.out.println("not an Broken link");
					System.out.println(connection.getResponseCode());
					System.out.println(connection.getResponseMessage());
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
