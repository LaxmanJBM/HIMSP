package _1_Network_Development;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.Browser;

public class _1_NetMemTypeProfile2 extends Browser{
	

	//This is for New option	
		@FindBy(xpath="//i[@class='fa fa-file']")private WebElement newBtn;
		@FindBy(xpath="//h3[text()='Network Member Type Profile']")private WebElement ele;
		@FindBy(xpath="//input[@placeholder='Name']")private  WebElement name;     
		@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName;
		@FindBy(xpath="//select[@name='type']")private WebElement netType;
		@FindBy(xpath="//textarea[@placeholder='Remarks']")private WebElement remark;
		@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn;
		
	//This is for edit option	
		@FindBy(xpath="//span[text()='Search']")private WebElement searchBtn1;
		@FindBy(xpath="//button[text()='Search']")private WebElement searchBtn2;
		@FindBy(xpath="//input[@name='JBMToolSearchFilter0']")private WebElement name2;
		@FindBy(xpath="//a//span[text()='Edit']")private WebElement editBtn;
		@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName2;
		@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn2;
		
		public _1_NetMemTypeProfile2()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void verifyNewBtn() throws Exception
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
		    
			newBtn.click();
			//searchBtn1.click();     //This is for Edit option 
			Thread.sleep(2000);
		}
		
		public void verifyName() throws Exception             
		{
			
		     name.sendKeys(readExcelFile(0, 3));
		     logger=report.createTest("Test case on Name verifcation");
			 logger.log(Status.INFO, "Entered the Name ");
			 logger.log(Status.PASS, "Name verification successful done");
		
		}
		
		public String verifyEle()
		{
			logger=report.createTest("Test case of Network Member Type Profile title verifcation");
			logger.log(Status.INFO, "The Network Member Type Profile is Displayed");
			logger.log(Status.PASS, "Network Member Type Profile title verification successful done");
			return ele.getText();
		}
		
		public void verifyShortName() throws Exception
		{
			
			shortName.sendKeys(readExcelFile(0, 4));
			logger=report.createTest("Test case of Short Name verifcation");
			logger.log(Status.INFO, "Entered the short Name");
			logger.log(Status.PASS, "The Short Name verification successful done");
			
		}
		
		public void verifyNetType() throws Exception
		{
			for(int i=0;i<=2;i++)
			{
			      Thread.sleep(2000);	
			      netType.sendKeys(Keys.DOWN);
			}
			netType.sendKeys(Keys.ENTER);
			logger=report.createTest("Test case of Network Type Dropdown button verifcation");
			logger.log(Status.INFO, "Selected one option from Dropdown");
			logger.log(Status.PASS, "Network Type dropdown verification successful done");
		}
		
		public void verifyRemark() throws Exception
		{
			logger=report.createTest("Test case on remark text verifcation");
			logger.log(Status.INFO, "Entered the remark in text box");
			logger.log(Status.PASS, "The remark verification successful done");
			remark.sendKeys(readExcelFile(0, 5));
		}
		
		public void verifySaveBtn() throws Exception
		{
			logger=report.createTest("Test case on save button verifcation");
			logger.log(Status.INFO, "Save button is clicked");
			logger.log(Status.PASS, "Save button verification successful done");
			saveBtn.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			 driver.switchTo().alert().accept();
			

		}
		
		
		
		
		/*
		
	//This all methods for Search and Edit option 	
		public void verifySearchBtn1() throws Exception
		{
	        Set<String> window1 = driver.getWindowHandles();
		    
		    
		    Iterator<String> el = window1.iterator();
		    
		    
		    String mainpage=driver.getWindowHandle();
		    while(el.hasNext())
		    {
		    	String str=el.next();	
		    	if(!mainpage.equals(str))
		    	{
		    		
		    		driver.switchTo().window(str);  		
		    	}   	
		    }
		   
		    searchBtn1.click();
			Thread.sleep(2000);
			
		}
		public void verifySearchBtn2() throws Exception
		{
			searchBtn2.click();
			Thread.sleep(1000);
			name2.sendKeys("A");
			
			for(int i=0;i<=5;i++)
			{
				Thread.sleep(1500);
				searchBtn2.sendKeys(Keys.DOWN);
			}
			searchBtn2.sendKeys(Keys.ENTER);
		}
		
		public void verifyEdit() throws Exception
		{
			Thread.sleep(2000);
			editBtn.click();
		}
		
		public void verifyShortName2() throws Exception
		{
		
			shortName2.sendKeys(readExcelFile(4, 0));
		}
		public void verifySaveBtn2() throws Exception
		{
			Thread.sleep(2000);
			saveBtn2.click();
		}
	*/

}
