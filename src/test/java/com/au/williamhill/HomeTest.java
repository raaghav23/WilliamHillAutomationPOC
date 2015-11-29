package com.au.williamhill;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

	/**
	 * Verify the Home Page UI
	 * 1) Left Menu Items
	 * 2) Top Menu Items
	 * 3) Bet Slip UI
	 * 
	 */
	
    @Test
    public void williamhill_homepage_ui_validate(){
        gotoHomePage()
        .verifyHomePage();
    }

}
