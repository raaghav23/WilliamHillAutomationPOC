package com.au.williamhill.page;

import org.openqa.selenium.WebDriver;

/***
 * @author Raaghav A S, raaghav23@gmail.com
 * @Purpose: Home Page Objects
 */

public class HomePage extends BasePage {

	public static final String URL = SITE_URL + "/";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Verifies the Home Page User Interface and Bet Slip UI *
	 * 
	 * @return
	 */

	public HomePage verifyHomePage() {
		verifyHomePageUI(); // verify hoemepage elements
		verifyBetSlip(); // Verify Bet Slip
		return this;
	}

}
