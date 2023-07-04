package _1_Network_Development;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.NMDirectoryScreen;

public class _4_NMDirectory2 extends NMDirectoryScreen{
	
  @FindBy(xpath="//h3[text()='Network Directory']")private WebElement nmText;
	
//Sub Network Wise
	@FindBy(xpath="//input[@class='ng-valid ng-dirty ng-touched']")private WebElement subNetWise;
	@FindBy(xpath="//select[@id='subdll']")private WebElement subNetworDrop;
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")private WebElement netTypeDrop;
	@FindBy(xpath="//button[text()=' Show Members']")private WebElement showMemBtn;
	
//Provider Wise
	@FindBy(xpath="//input[@class='ng-untouched ng-pristine ng-valid']")private WebElement providerWise;
	@FindBy(xpath="(//i[@class='fa fa-search'])[1]")private WebElement search1;     //This search button is for NM Group Entity
	@FindBy(xpath="//input[@name='JBMToolSearchFilter0']")private WebElement nameBtn1;
	@FindBy(xpath="//button[text()='Search']")private WebElement search2;
	@FindBy(xpath="//button[text()='Close']")private WebElement closeBtn;
	
	@FindBy(xpath="(//i[@class='fa fa-search'])[2]")private WebElement search3;     //This is search button is for Network Member
	@FindBy(xpath="//input[@id='JBMToolSearchFilter0']")private WebElement nameBtn2;
	@FindBy(xpath="//button[text()='Search']")private WebElement search4;
	@FindBy(xpath="//button[text()='×']")private WebElement close;
	@FindBy(xpath="//select[@id='countryddl']")private WebElement country;
	@FindBy(xpath="//select[@id='cityddl']")private WebElement city;
	
	
	@FindBy(xpath="(//select[@name='type'])[3]//option")private WebElement all;
	
	public _4_NMDirectory2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNavigate() throws Exception
	{
         Set<String> window = driver.getWindowHandles();
	
	    Iterator<String> it = window.iterator();
	   
	    String mainpage=driver.getWindowHandle();
	    while(it.hasNext())
	    {
	    	String str=it.next();	
	    	if(!mainpage.equals(str))
	    	{
	    		driver.switchTo().window(str);  		
	    	}
	    }
	
		Thread.sleep(2000);
		
	}
	
	public void verifysubNetworDrop() throws Exception
	{
		subNetWise.click();
		Thread.sleep(1500);
		
		subNetworDrop.click();
		Thread.sleep(1500);
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(1500);
			subNetworDrop.sendKeys(Keys.DOWN);
		}
		subNetworDrop.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		showMemBtn.click();
        driver.switchTo().alert().accept();
	}
	
	public void verifynetTypeDrop() throws Exception
	{
		subNetWise.click();
		Thread.sleep(1500);
		
		netTypeDrop.click();
		Thread.sleep(1500);
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(1500);
			netTypeDrop.sendKeys(Keys.DOWN);
		}
		netTypeDrop.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		showMemBtn.click();
        driver.switchTo().alert().accept();
	}
	
	public void verifyproviderWise() throws Exception      //NM Group Entity
	{
		providerWise.click();
		Thread.sleep(1500);
		search1.click();
		nameBtn1.sendKeys("%A");
		Thread.sleep(1500);
		search2.click();
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(1000);
			search2.sendKeys(Keys.DOWN);
		}
		search2.sendKeys(Keys.ENTER);
		closeBtn.click();
		Thread.sleep(3000);
		showMemBtn.click();
		
	}
	
	public void verifyNetMember() throws Exception
	{
		providerWise.click();
		Thread.sleep(1500);
		search3.click();
		nameBtn2.sendKeys("%S");
		Thread.sleep(1500);
		search4.click();
		for(int i=0;i<=6;i++)
		{
			Thread.sleep(2000);
			search4.sendKeys(Keys.DOWN);
		}
		search4.sendKeys(Keys.ENTER);
		close.click();
		Thread.sleep(2000);
		showMemBtn.click();
		
		
	}
	
	public void verifyCountry() throws Exception                  
	{
		providerWise.click();
		Thread.sleep(1500);
		country.click();
		for(int i=0;i<=6;i++)
		{
			Thread.sleep(1000);
			country.sendKeys(Keys.DOWN);
		}
		country.sendKeys(Keys.ENTER);
		showMemBtn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public void verifyCity() throws Exception
	{
		verifyCountry();
		Thread.sleep(2000);
		city.click();
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(500);
			city.sendKeys(Keys.DOWN);	
		}
		city.sendKeys(Keys.ENTER);
	}


}
