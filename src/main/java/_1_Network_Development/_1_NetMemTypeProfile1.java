package _1_Network_Development;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.Browser;

public class _1_NetMemTypeProfile1 extends Browser{
	
	@FindBy(xpath="//input[@title='Username']") private WebElement username;
	@FindBy(xpath="//input[@title='Password']") private WebElement pass;
	@FindBy(xpath="//button[text()='Login']") private WebElement logInBtn;
	
	@FindBy(xpath="//img[@id='imgJupLogo']")private WebElement JBMLogo;
	@FindBy(xpath="//a[@class='dropdown-toggle HLoggedCompany']")private WebElement finYearLebal;
	@FindBy(xpath="//a[text()='HEALTH INSURANCE MANAGEMENT']")private WebElement HIMSBtn;
	@FindBy(xpath="//a[text()='Network Development']")private WebElement netDevBtn;
	@FindBy(xpath="//a[text()='Network Member Type Profile']")private WebElement profile;
	
	
	public _1_NetMemTypeProfile1()
	{
		PageFactory.initElements(driver, this);
	}

	public void VerifyAppLogIn() throws Exception
	{
		logger=report.createTest("Test Case on JBM Login Application");
		
		username.sendKeys(readExcelFile(0, 1));
		Thread.sleep(2000);
		logger.log(Status.INFO, "Username is entered");
		
		pass.sendKeys(readExcelFile(0, 2));
		Thread.sleep(2000);
		logger.log(Status.INFO, "Password is entered");
		
		
		logInBtn.click();
		Thread.sleep(2000);
		logger.log(Status.INFO, "Login button is clicked");
		logger.log(Status.PASS, "Login successful done");
		
	}
	
	public boolean verifyJBMLogo()
	{
		logger=report.createTest("Test case of JBM Logo verification");
		logger.log(Status.INFO, "JBM logo is Displayed");
		logger.log(Status.PASS, "JBM logo verification successful done");
		return JBMLogo.isDisplayed();	
		
	}
	
	public String verifyfinYearLebal()
	{
		logger=report.createTest("Test case on Finencial Year Lebal verification");
		logger.log(Status.INFO, "Finential Year Lebal is Displayed");		
		logger.log(Status.PASS, "Finential Year Lebal verification successful done");
		return finYearLebal.getText();
	}
	
	public void verifyHIMSBtn() throws Exception
	{
		logger=report.createTest("Test case on HIMS Button");
		logger.log(Status.INFO, "HIMS Button is clicked");
		logger.log(Status.PASS, "HIMS Button is successful clicked");
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1500);
			HIMSBtn.sendKeys(Keys.DOWN);
		}
		HIMSBtn.sendKeys(Keys.ENTER);
	}
	
	public void verifynetDevBtn() throws Exception
	{
		logger=report.createTest("Test case on Network Development Button");
		logger.log(Status.INFO, "Network Development Button is clicked");
		logger.log(Status.PASS, "Network Development Button is successful clicked");
		Thread.sleep(2000);
		netDevBtn.click();
	}
	
	public void verifyprofile()
	{
		logger=report.createTest("Test case on Network Member Type Profile Button");
		logger.log(Status.INFO, "Network Member Type Profile Button is clicked");
		logger.log(Status.PASS, "Network Member Type Profile Button is successful clicked and the new window is opened.");
		profile.click();
	}

}
