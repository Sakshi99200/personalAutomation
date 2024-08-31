package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage loginPage;
	public BankReconciliation bankReconciliation;
	

	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;	
	}

	public LoginPage getLoginpage()
	{
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public BankReconciliation getBankReconciliationpage()
	{
		bankReconciliation=new BankReconciliation(driver);
		return bankReconciliation;
		
	}
	
	

}
