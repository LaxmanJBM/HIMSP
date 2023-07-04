package _1_Network_Development;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.NMContractScreen;

public class _3_NMContract2 extends NMContractScreen{
	
	_1_NetMemTypeProfile2 nmtp2;
	@FindBy(xpath="//span[text()='New']")private WebElement newBtn;
	@FindBy(xpath="//a[text()='Network Member Contract']")private WebElement hedLine;
	@FindBy(xpath="//input[@placeholder='Company']")private WebElement companyText;
	
	@FindBy(xpath="//input[@placeholder='Date of Contract']")private WebElement contractDate;
	@FindBy(xpath="(//button[@class='mat-icon-button'])[1]")private WebElement calenderBtn;
	@FindBy(xpath="//button[@aria-label='Choose month and year']")private WebElement monthYear;
	@FindBy(xpath="//td[@aria-label='2021']")private WebElement year;
	@FindBy(xpath="//td[@aria-label='Wed Feb 01 2017']")private WebElement month;
	@FindBy(xpath="//td[@aria-label='Thu Feb 09 2017']")private WebElement date;
	@FindBy(xpath="//button[@aria-label='Next month']")private WebElement next;
	@FindBy(xpath="//button[@aria-label='Previous month']")private WebElement previous;
	
	
	@FindBy(xpath="//input[@placeholder='Contract Ref']")private WebElement contractRef;
	@FindBy(xpath="//input[@placeholder='Contract Valid Date']")private WebElement contractValidDate;
	@FindBy(xpath="//input[@placeholder='NM Representative Name']")private WebElement NMReptNameText;
	@FindBy(xpath="//input[@placeholder='Designation']")private WebElement designationText;
	@FindBy(xpath="//input[@placeholder='Contact No']")private WebElement contactNoText;
	@FindBy(xpath="//input[@placeholder='Signature Name']")private WebElement signNameText;
	@FindBy(xpath="//input[@placeholder='Signature Designation']")private WebElement sigDedignText;
	@FindBy(xpath="//textarea[@placeholder='Aggrement']")private WebElement aggrementText;
	@FindBy(xpath="//select[@name='gender']")private WebElement currency;
	@FindBy(xpath="//input[@placeholder='Pre Approved Limit']")private WebElement preAprrLimitText;
	@FindBy(xpath="//textarea[@placeholder='Remarks']")private WebElement remarksText;
	@FindBy(xpath="//input[@placeholder='Request Buffer Period']")private WebElement reqBuffPeriodText;
	@FindBy(xpath="//input[@placeholder='Processing Period']")private WebElement processPeriodText;
	@FindBy(xpath="//input[@placeholder='Credit Period']")private WebElement creditPeriodText;
	@FindBy(xpath="//input[@value='D']")private WebElement draftBtn;
	@FindBy(xpath="//input[@value='F']")private WebElement finalBtn;
	@FindBy(xpath="//label[text()='select file']")private WebElement selectFile;
	@FindBy(xpath="//button[text()='Upload']")private WebElement uploadBtn;
	
	@FindBy(xpath="//label[text()='Aggrement']")private WebElement Aggre;
	
	
	public _3_NMContract2()
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
		Thread.sleep(2000);
	}
	
	public String verifyHedLine()
	{
		return hedLine.getText();
	}
	                                                                         
	public void verifyCompanyText() throws Exception
	{
		companyText.sendKeys("%");
		Thread.sleep(1000);
		for(int i=0;i<=22;i++)
		{
			Thread.sleep(1000);
			companyText.sendKeys(Keys.DOWN);
		}
		companyText.sendKeys(Keys.ENTER);
	}
	
	public void verifyContractDate() throws Exception
	{
		
		calenderBtn.click();    //To Click Calendar
		
		WebElement dayMonthYear = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']"));
	  //System.out.println(monthYear.getText());
		
		String m="NOV.",y="2024",d="9";
		
		String actMonthYear = dayMonthYear.getText();
		String month = actMonthYear.split(" ")[0];                                        //Pending for new technique
		String year = actMonthYear.split(" ")[1];
		
		
		while(!(month.equals(m) && year.equals(y)))
		{
			Thread.sleep(1000);
			next.click();
			//previous.click();
		//	driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
			WebElement monthYear1 = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']"));
			actMonthYear=monthYear1.getText();
			month=actMonthYear.split(" ")[0];
			year=actMonthYear.split(" ")[1];
			
			System.out.println(month+"      "+year);
			
			
		}
		driver.findElement(By.xpath("//div[text()='"+ d +"']")).click();
		
	//	contractDate.sendKeys("");                                
	}
	
	public void verifyContractRef() throws Exception
	{
		 contractRef.sendKeys(readExcelFile(5, 2));
	}
	
	public void verifyContractValidDate()
	{
		contractValidDate.sendKeys("");                       //Pending for std coding
	}
	
	public void verifyNMReptNameText() throws Exception
	{
		NMReptNameText.sendKeys(readExcelFile(5, 3));
		
	}
	
	public void verifyDesignationText() throws Exception
	{
		designationText.sendKeys(readExcelFile(5, 4));
		
		
	}
	
	public void verifyContactNoText() throws Exception
	{
		contactNoText.sendKeys(readExcelFile(5, 5));
		Thread.sleep(2000);
	}
	
	public void verifysignNameText() throws Exception
	{
		signNameText.sendKeys(readExcelFile(5, 6));
	}
	
	public void verifySigDedignText() throws Exception
	{
		sigDedignText.sendKeys(readExcelFile(5, 7));
	}
	
	public void verifyAggrementText() throws Exception
	{
		aggrementText.sendKeys(readExcelFile(5, 8));
	}
	
	public void verifyCurrency() throws Exception
	{
		currency.click();
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			currency.sendKeys(Keys.DOWN);
		}
		currency.sendKeys(Keys.ENTER);
	}
	
	public void verifyPreAprrLimitText() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Aggre);
		
		preAprrLimitText.sendKeys(readExcelFile(5, 9));
	}
	
	public void verofyRemarksText() throws Exception
	{
		remarksText.sendKeys(readExcelFile(5, 10));
	}
	
	public void verifyProcessPeriod() throws Exception
	{
		reqBuffPeriodText.sendKeys(readExcelFile(5, 11));
		Thread.sleep(2000);
		processPeriodText.sendKeys(readExcelFile(5, 12));
		Thread.sleep(2000);
		creditPeriodText.sendKeys(readExcelFile(5, 13));	
	}
	public void verifyContactStatusText()
	{
		finalBtn.click();
		if (finalBtn.isSelected()) 
		{					
            System.out.println("The redio button On");					
        }
		else 
		{			
            System.out.println("The redio buttonOff");					
        }			
	}
	
	public void verifySelectFile() throws Exception
	{
		Thread.sleep(2000);;
		selectFile.sendKeys("C:\\Users\\Admin\\Desktop");
		Thread.sleep(1500);
		uploadBtn.click();
	}

}
