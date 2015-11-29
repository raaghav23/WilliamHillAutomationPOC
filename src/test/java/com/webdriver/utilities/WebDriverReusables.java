/**
 * 
 */
package com.webdriver.utilities;

import static com.au.williamhill.Data.DEFAULT_WAIT_SECONDS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Raaghav A S
 *
 */
public class WebDriverReusables {

	// Webdriver
	WebDriver driver;

	public void waitForElement(final By byType) {
		waitForElement(byType, DEFAULT_WAIT_SECONDS);
	}

	public void waitForElement(final By byType, int secondsToWait) {
		WebDriverWait wait = new WebDriverWait(driver, secondsToWait);
		wait.until(new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver webDriver) {
				try {
					return driver.findElement(byType);
				} catch (Exception e) {
					return null;
				}
			}
		});
	}

	/**
	 * @author Raaghav A S
	 * Screenshot utility
	 */

	public void takeScreenShot(String filename) {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")
					+ "\\screenshots" + filename + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
