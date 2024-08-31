package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContexSetup;

public class LoginPageStepDefinition {

	public WebDriver driver;
	public static ChromeOptions option;
	TestContexSetup testContexSetup;
	LoginPage loginPage;

	public LoginPageStepDefinition(TestContexSetup testContexSetup) {
		this.testContexSetup = testContexSetup;
		this.loginPage = testContexSetup.pageObjectManager.getLoginpage();
	}

}
