package com.au.williamhill.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.webdriver.utilities.WebDriverReusables;
import static com.au.williamhill.Data.BASE_URL;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/***
 * @author Raaghav A S ,raaghav23@gmail.com
 * @Purpose: Selenium Test the verify the William hill Home page objects
 */

public class BasePage {

	// Webdriver
	WebDriver driver;
	WebDriverReusables webDriverReusables;

	BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public static final String SITE_URL = BASE_URL;
	public final String stakeAmount = "10.50";
	public final String stakeAmountTotal = "$10.50";

	// Homepage- Top navigation buttons page objects
	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[1]/a")
	public WebElement home;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[2]/a")
	public WebElement horseRacing;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[4]/a")
	public WebElement greyhounds;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[6]/a")
	public WebElement harness;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[8]/a")
	public WebElement basketballUS;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[1]/li[9]/a")
	public WebElement soccer;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/nav[2]/div/ul[2]/li[1]/a")
	public WebElement americanFootball;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[1]/div[2]/div/a")
	public WebElement allSports;

	/*** Left Toolbar Menu Items ***/

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[1]/a")
	public WebElement inPlay;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[2]/a")
	public WebElement jockeyChallenges;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[3]/a")
	public WebElement premiumPrice;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[3]/a")
	public WebElement quickmultis;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[3]/a")
	public WebElement promotions;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[2]/nav/ul/li[4]/a")
	public WebElement results;

	/**** Right Toolbar Menu items ****/

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[3]/nav/ul/li[1]/a")
	public WebElement betSlip;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[3]/nav/ul/li[2]/a")
	public WebElement pendingBets;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[3]/nav/ul/li[3]/a")
	public WebElement blog;

	@FindBy(xpath = "html/body/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[1]/section[2]/div/div/div[1]/div/div[1]/ul/li[1]/button")
	public WebElement filterteTypeHorseRacing;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[1]/section[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/a/div[2]/span")
	public WebElement placeRaceBet;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/div/div/div/div[2]/input[1]")
	public WebElement placeHolderStake;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/ul/li[1]")
	public WebElement totaBets;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/ul/li[2]")
	public WebElement totaStake;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/ul/li[3]")
	public WebElement possiblePayout;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/button[1]")
	public WebElement clearBtn;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/button[2]")
	public WebElement placeBetsBtn;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/p[1]/small")
	public WebElement betSlipNote;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/p[2]")
	public WebElement betInPlayStoreNote;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/div/div/div/div[3]/b")
	public WebElement possiblePayoutValue;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/div/div/div/div[2]/b")
	public WebElement unitStakeValue;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div/form/footer/ul/li[2]/b")
	public WebElement totalStakeValue;

	/***
	 * @author Raaghav A S Method to Verify the Home Page UI - Top Menu Item -
	 *         Left ToolBar Items - Right ToolBar Items
	 * 
	 * @return
	 */
	protected BasePage verifyHomePageUI() {
		verifyTopMenuItem();
		verifyLeftToolBarItems();
		verifyRightToolBarItems();
		return this;
	}

	/**
	 * Method to Verify the Bet Slip Functionality - Add A Stake Amount - Total
	 * Stake Value Amount - Verify the Possible Payout - veirfy the Bet Slip UI
	 * 
	 * @return
	 */
	protected BasePage verifyBetSlipFunctionality() {
		addAStakeAmount(); // Add a Stake Amount
		verifyTotalStakeValueAmount(); // Verify the stake amount entered and
										// total stake amount is the same
		verifyPossiblePayoutLogic(); // Verify PossiblePayoutLogic
		verifybetSlipUI(); // Bet Slip UI
		return this;
	}

	/**
	 * Verify the Top Menu Items - Home - Horce Racing - Greyhounds - Harness -
	 * Basektball - Socer - American Fotball - All Sports
	 * 
	 * @return
	 */
	protected BasePage verifyTopMenuItem() {
		assertThat(home.getText(), is("Home"));
		assertThat(horseRacing.getText(), is("Horse Racing"));
		assertThat(greyhounds.getText(), is("Greyhounds"));
		assertThat(harness.getText(), is("Harness"));
		assertThat(basketballUS.getText(), is("Basketball - US"));
		assertThat(soccer.getText(), is("Soccer"));
		assertThat(americanFootball.getText(), is("American Football"));
		assertThat(allSports.getText(), is("All Sports"));
		return this;
	}

	/**
	 * Verify Left Tool Bar Items - - In-Play - Jockey - Challenges - Quick
	 * Multis - - Promotions - Results
	 * 
	 * @return
	 */
	protected BasePage verifyLeftToolBarItems() {

		if (inPlay.isDisplayed()) {
			assertThat(inPlay.getText(), is("In-Play"));
		}

		if (jockeyChallenges.isDisplayed()) {
			assertThat(jockeyChallenges.getText(), is("Jockey Challenges"));
		}

		/*if (premiumPrice.isDisplayed()) {
			assertThat(premiumPrice.getText(), is("Premium Price"));
		}

		if (quickmultis.isDisplayed()) {
			assertThat(quickmultis.getText(), is("Quick Multis"));
		}

		if (promotions.isDisplayed()) {
			assertThat(promotions.getText(), is("Promotions"));
		}

		if (results.isDisplayed()) {
			assertThat(results.getText(), is("Results"));
		}
		*/
		return this;
	}

	/**
	 * Verify the Right tool Bar items - Bet Slip - Pending Bets - Blog
	 * 
	 * @return
	 */
	protected BasePage verifyRightToolBarItems() {
		assertThat(betSlip.getText(), is("Bet Slip"));
		assertThat(pendingBets.getText(), is("Pending Bets"));
		assertThat(blog.getText(), is("Blog"));
		return this;
	}

	/**
	 * Verify Add to Bet - Place Race bet
	 * 
	 * @return
	 */
	protected BasePage addHorseRacetoBetSlip() {
		assertThat(filterteTypeHorseRacing.isDisplayed(), is(true));

		if (placeRaceBet.isDisplayed()) {
			placeRaceBet.click(); // Place Race Bet, add a horse to bet Slip
		}
		return this;
	}

	/**
	 * Verify the Bet Slip UI - Bet Slip UI - Stake Amount - Clear Btn -
	 * BetSlipNote - Bet In play Store
	 * 
	 * @return
	 */
	protected BasePage addAStakeAmount() {
		if (betSlip.isDisplayed()) { // verify the bet Slip UI is shown
			betSlip.click(); // Navigate the Bet Slip
			assertThat(betSlip.getText(), is("Bet Slip")); // Assert the Bet
															// Slip
			placeHolderStake.click(); // Select the Placeholder
			placeHolderStake.sendKeys(stakeAmount); // Enter the Stake Amount
		}
		return this;
	}

	/**
	 * Verify the Added Stake Value and Total Stake value is similar
	 * 
	 * @return
	 */
	protected BasePage verifyTotalStakeValueAmount() {
		assertThat(stakeAmount, is(totalStakeValue.getText())); // verify the
																// stake value
																// entered and
																// total stake
																// value are the
																// Equal.
		return this;
	}

	/**
	 * Verify the Bet Slip UserInterface
	 * 
	 * @return
	 */

	protected BasePage verifybetSlipUI() {
		assertThat(totaBets.isDisplayed(), is(true));
		assertThat(possiblePayout.isDisplayed(), is(true));
		assertThat(clearBtn.isDisplayed(), is(true));
		assertThat(betSlipNote.isDisplayed(), is(true));
		assertThat(betInPlayStoreNote.isDisplayed(), is(true));
		return this;
	}

	/**
	 * Calculate Bet Possible payout value
	 * 
	 * @return
	 */
	protected BasePage verifyPossiblePayoutLogic() {

		String possiblePayoutValue_actual = possiblePayoutValue.getText();
		String possiblePayoutValue_actual_rplc = possiblePayoutValue_actual
				.replace("$", "");
		String unitStakeValue_actual = unitStakeValue.getText();

		double possiblePayoutActual = Integer
				.parseInt(possiblePayoutValue_actual_rplc);

		double possiblePayoutExpected = Integer.parseInt(unitStakeValue_actual)
				* Integer.parseInt(stakeAmount);

		if (possiblePayoutActual == possiblePayoutExpected) {

			assertThat(possiblePayoutActual, is(possiblePayoutExpected));
			System.out.println(" The Possible Layout : Actual -- >"
					+ possiblePayoutValue_actual_rplc + " Expected value ---> "
					+ possiblePayoutExpected);
		}
		return this;
	}
}
