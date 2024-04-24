package selenium;

import org.openqa.selenium.WebDriver;

import BasePackage.BaseClassSelenium;
import constants.URLS;
import pages.FBLoginPageClass;

public class BaseClassSampleTest {

	BaseClassSelenium baseclass = new BaseClassSelenium();

	public void sampleTestExecutionWithBaseClass() {

		baseclass.lauchChromeBrowser();

		WebDriver webPage = baseclass.getWebPage(URLS.fbPage);

		FBLoginPageClass fbPage = new FBLoginPageClass(webPage);

		fbPage.getUsername().sendKeys("test@gmail.com");

		fbPage.getPassword().sendKeys("test@123");

		fbPage.getLoginButton().click();
	}

	public static void main(String[] args) {

		BaseClassSampleTest obj = new BaseClassSampleTest();

		obj.sampleTestExecutionWithBaseClass();

	}

}
