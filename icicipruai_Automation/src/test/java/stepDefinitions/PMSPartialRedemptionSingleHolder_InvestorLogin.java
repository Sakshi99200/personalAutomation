package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContexSetup;

public class PMSPartialRedemptionSingleHolder_InvestorLogin {
	public WebDriver driver;
	public static ChromeOptions option;
	TestContexSetup testContexSetup;
	LoginPage loginPage;

	public PMSPartialRedemptionSingleHolder_InvestorLogin(TestContexSetup testContexSetup) {
		this.testContexSetup = testContexSetup;
		this.loginPage = testContexSetup.pageObjectManager.getLoginpage();
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		// Code to navigate to the login page
	}

	@When("User logs into the application with {string} and password {string}")
	public void user_logs_into_the_application_with_and_password(String panNumber, String password) {
		// Code to enter PAN number and password
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		// Code to click the login button
	}

	@Then("the dashboard page should be displayed")
	public void the_dashboard_page_should_be_displayed() {
		// Code to verify the dashboard page is displayed
	}

	@Given("the investor is logged in")
	public void the_investor_is_logged_in() {
		// Code to ensure investor is logged in
	}

	@Given("the dashboard page is displayed")
	public void the_dashboard_page_is_displayed() {
		// Code to verify the dashboard page is displayed
	}

	@When("the investor clicks on the Redemption Module from the side menu")
	public void the_investor_clicks_on_the_redemption_module_from_the_side_menu() {
		// Code to click on the Redemption Module
	}

	@Then("the PMS Redemption page should be displayed on the screen")
	public void the_pms_redemption_page_should_be_displayed_on_the_screen() {
		// Code to verify the PMS Redemption page is displayed
	}

	@Given("the investor is on the redemption page")
	public void the_investor_is_on_the_redemption_page() {
		// Code to navigate to the redemption page
	}

	@When("the investor selects {string} from the dropdown")
	public void the_investor_selects_from_the_dropdown(String option) {
		// Code to select an option from the dropdown
	}

	@When("the investor selects the Strategy checkbox")
	public void the_investor_selects_the_strategy_checkbox() {
		// Code to select the Strategy checkbox
	}

	@When("the investor clicks on the Partial radio button")
	public void the_investor_clicks_on_the_partial_radio_button() {
		// Code to click on the Partial radio button
	}

	@When("the investor enters an amount less than {int} Lakhs in the amount field")
	public void the_investor_enters_an_amount_less_than_lakhs_in_the_amount_field(Integer amount) {
		// Code to enter an amount in the field
	}

	@Then("the investor should see a validation message for the minimum amount requirement")
	public void the_investor_should_see_a_validation_message_for_the_minimum_amount_requirement() {
		// Code to verify the validation message
	}

	@When("the investor enters an amount equal to the AUM amount")
	public void the_investor_enters_an_amount_equal_to_the_aum_amount() {
		// Code to enter the AUM amount
	}

	@Then("the investor should see a validation message for the maximum amount")
	public void the_investor_should_see_a_validation_message_for_the_maximum_amount() {
		// Code to verify the validation message for maximum amount
	}

	@When("the investor does not enter an amount and clicks on the redeem button")
	public void the_investor_does_not_enter_an_amount_and_clicks_on_the_redeem_button() {
		// Code to try clicking the redeem button without entering an amount
	}

	@Then("the redeem button should be disabled")
	public void the_redeem_button_should_be_disabled() {
		// Code to verify the redeem button is disabled
	}

	@When("the L2 screen is displayed")
	public void the_l2_screen_is_displayed() {
		// Code to verify the L2 screen is displayed
	}

	@When("the entered amount is displayed on the L2 screen")
	public void the_entered_amount_is_displayed_on_the_l2_screen() {
		// Code to verify the entered amount is displayed
	}

	@When("the investor clicks on the T&C checkbox and clicks on the redeem amount button")
	public void the_investor_clicks_on_the_t_c_checkbox_and_clicks_on_the_redeem_amount_button() {
		// Code to click on T&C checkbox and then redeem button
	}

	@When("the investor enters the OTP")
	public void the_investor_enters_the_otp() {
		// Code to enter the OTP
	}

	@Then("the investor should see a success validation message")
	public void the_investor_should_see_a_success_validation_message() {
		// Code to verify success validation message
	}

	@When("the investor clicks on the recent transaction option from the side menu")
	public void the_investor_clicks_on_the_recent_transaction_option_from_the_side_menu() {
		// Code to click on the recent transaction option
	}

	@Then("the investor should see the entry in the transaction list")
	public void the_investor_should_see_the_entry_in_the_transaction_list() {
		// Code to verify the entry in the transaction list
	}

	@Then("the status of the transaction should be displayed correctly")
	public void the_status_of_the_transaction_should_be_displayed_correctly() {
		// Code to verify the status of the transaction
	}

}
