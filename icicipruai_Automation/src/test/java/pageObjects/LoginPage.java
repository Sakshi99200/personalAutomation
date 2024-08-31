package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	By employee=By.xpath("//p[contains(text(),'Employee')]");
	By id=By.xpath("//input[@name='username']");
	By Password=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@type='submit']");
	By profile=By.xpath("//div[text()='IPAMC7003']");
	public void selectEmployeeportal()
	{
		driver.findElement(employee).click();
	}
	public void entercredentials(String userid, String password)
	{
		driver.findElement(id).sendKeys(userid);
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickonloginbutton()
	{
		driver.findElement(login).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void oprncsrfapiurl()
	{
		String parentwindow = driver.getWindowHandle();
		
		((JavascriptExecutor)driver).executeScript("window.open('https://api.uat.icicipruai.com/userapi/investor/getCsrf', '_blank');");
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(login).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	public void verifyDashboard()
	{
		
		WebElement profile = driver.findElement(By.xpath("//div[text()='IPAMC7003']"));
		if(profile.isDisplayed())
		{
			System.out.println("User logs in successfully");
		}
		else
		{
			System.out.println("Login Failed");
		}		
	
	}
}
