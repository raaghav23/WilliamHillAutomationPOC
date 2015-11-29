package com.au.williamhill;

import com.au.williamhill.page.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.au.williamhill.Data.*;

public class BaseTest {

	private WebDriver driver;

	@BeforeMethod
	public void before() {
		String browser = BROWSER_MOZILLA;

		if (BROWSER_MOZILLA.equals(browser)) {
			driver = new FirefoxDriver();
		} else if (BROWSER_IE.equals(browser)) {
			driver = new InternetExplorerDriver();
		} else if (BROWSER_CHROME.equals(browser)) {
			driver = new ChromeDriver();
		} else {
			driver = new HtmlUnitDriver();
		}
		// Dimension windowSize = driver.manage().window().getSize();
		// driver.manage().window().setPosition(new Point(windowSize.getWidth(),
		// 0));
		// driver.manage().window().setSize(new Dimension(100,100));
	}

	@AfterMethod
	public void after() {
		// driver.close();
	}

	protected HomePage gotoHomePage() {
		driver.get(HomePage.URL);
		  // Maximize browser window
		 driver.manage().window().maximize();
		return PageFactory.initElements(driver, HomePage.class);
	}

}
