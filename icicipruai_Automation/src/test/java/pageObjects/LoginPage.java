package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By employee = By.xpath("//p[contains(text(),'Employee')]");
	By id = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@type='submit']");
	By profile = By.xpath("//div[text()='IPAMC7003']");
	// investor login
	By enterPanNumber = By.xpath("//input[@placeholder=\"Enter your PAN number\"]");
	By clickOnNextButton = By.xpath("//input[@value=\"Next\"]");
	By clickOnGenerateOTP = By.xpath("//input[@value=\"Generate OTP\"]");
	By enterOTP = By.xpath("//input[@class=\"OTP_inputOtp__6GZQN\"][1]");
	By verifyOTP = By.xpath("value=\"Verify OTP\"");
	By enterPassword = By.xpath("//input[@type=\"password\"]");
	By clickOnSubmitButton = By.xpath("//input[@type=\"submit\"]");

	// verify user is on login page

	public void verifyLoginPage() throws InterruptedException {

		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://apps.uat.icicipruai.com/portal/";
		Assert.assertEquals(currentUrl, expectedUrl,
				"Didn't navigate to the correct page , login page is not displayed on the screen");

	}

	// Investor login

	public void userLogin(String panNumber, String password) throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(enterPanNumber).sendKeys(panNumber);

		Thread.sleep(1000);

		driver.findElement(clickOnNextButton).click();
		// click on generate OTP
		List<WebElement> generateOTP = driver.findElements(By.xpath("//input[@value=\"Generate OTP\"]"));

		if (!generateOTP.isEmpty() && generateOTP.get(0).isDisplayed()) {
			Thread.sleep(3000);

			driver.findElement(clickOnGenerateOTP).click();
			Thread.sleep(4000);

		} else {

			// driver.get("https://api.uat.icicipruai.com/userapi/investor/getCsrf");

		}

		// enter OTP
		driver.findElement(enterOTP).sendKeys("756750");

		// click on verify otp button

		driver.findElement(verifyOTP).click();

		// enter Password

		Thread.sleep(2000);

		driver.findElement(enterPassword).sendKeys(password);

		// click on submit button

		driver.findElement(clickOnSubmitButton).click();

		Thread.sleep(2000);

		System.out.println("user Login SUccessfully..");
	}

	public void verifyDashboard() throws InterruptedException {

		// verify after login dash board page is displaying or not
		Thread.sleep(2000);

		String expectedPage = "https://apps.uat.icicipruai.com/portal/home";

		String actualPage = driver.getCurrentUrl();

		Assert.assertEquals(expectedPage, actualPage,
				"Didn't navigate to the correct page , dashboard page is not displayed on the screen");

	}

}
