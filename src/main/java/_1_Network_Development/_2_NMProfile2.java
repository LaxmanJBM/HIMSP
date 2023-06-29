package _1_Network_Development;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Browser;

public class _2_NMProfile2 extends Browser{
	
		
		//_1_NetMemTypeProfile2 ele;
		
		@FindBy (xpath="//li//span[text()='New']")private WebElement newBtn;
		@FindBy (xpath="(//select[@name='type'])[1]")private WebElement ProviderCon;
		@FindBy (xpath="(//select[@name='type'])[2]")private WebElement NMGroupTy;  //When user select NM Group Entity
		@FindBy (xpath="//input[@placeholder='Network Member']")private WebElement networkEnt;
		@FindBy (xpath="//select[@name='currency']")private WebElement currency;
		@FindBy (xpath="//input[@placeholder='Name']")private WebElement name;
		@FindBy (xpath="//input[@placeholder='Code']")private WebElement code;
		@FindBy (xpath="(//select[@name='type'])[3]")private WebElement memberGrp;
		@FindBy (xpath="//textarea[@placeholder='Address']")private WebElement address;
		@FindBy (xpath="//select[@name='country']")private WebElement NMCountry;
		@FindBy (xpath="//input[@placeholder='City']")private WebElement city;
		@FindBy (xpath="(//select[@name='type'])[4]")private WebElement citySubLoc;
		@FindBy (xpath="//input[@placeholder='Phone']")private WebElement phone;
		@FindBy (xpath="//input[@placeholder='Fax']")private WebElement fax;
		@FindBy (xpath="(//input[@placeholder='Email'])[1]")private WebElement Email1;
		@FindBy (xpath="//input[@placeholder='Key Person']")private WebElement Keyperson;
		@FindBy (xpath="//input[@placeholder='Designation']")private WebElement KPdesignation;
		@FindBy (xpath="//input[@placeholder='Mobile']")private WebElement KPmobile;
		@FindBy (xpath="(//input[@placeholder='Email'])[2]")private WebElement KPmail;
		@FindBy (xpath="//input[@placeholder='URL']")private WebElement url;
		@FindBy (xpath="(//select[@name='type'])[5]")private WebElement ownership;
		@FindBy (xpath="//input[@placeholder='GPS Location']")private WebElement gpsLocation;
		@FindBy (xpath="//textarea[@placeholder='Remarks']")private WebElement remarks;
		@FindBy (xpath="//input[@value='Active']")private WebElement activeSta;
		
		
		@FindBy (xpath="//th[text()='Price Table']")private WebElement ele1;
	    @FindBy (xpath="//input[@id='JBMToolSearchFilter0']")private WebElement priceTab;
		@FindBy (xpath="//td[text()='Test Price Table']")private WebElement nameText;
		@FindBy (xpath="(//button[@type='button'])[2]")private WebElement ServicePT;
		@FindBy (xpath="(//i[@class='fa fa-search'])[2]")private WebElement PTsearchBtn;
		@FindBy (xpath="//button[text()='Search']")private WebElement searchBtn;
		
		 
		
		
		@FindBy (xpath="//label[text()='Key Person Mobile']")private WebElement KPMobEle;
		@FindBy (xpath="(//button[@type='button'])[3]")private WebElement drugPT;
		@FindBy (xpath="//input[@placeholder='Discount Percent']")private WebElement discount;
		@FindBy (xpath="//input[@placeholder='Negotiation Factor']")private WebElement Negfactor;
		@FindBy (xpath="//span[text()='Special Instruction']")private WebElement speInstr;
		
	//Contact Details	
		    @FindBy (xpath="//label[text()='FL ID']")private WebElement fl;
			@FindBy (xpath="(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[18]")private WebElement conName;
			@FindBy (xpath="(//input[@type='text'])[12]")private WebElement desgn;
			@FindBy (xpath="(//input[@type='text'])[13]")private WebElement phone2;
			@FindBy (xpath="(//input[@type='text'])[14]")private WebElement email2;
			@FindBy (xpath="(//input[@type='text'])[15]")private WebElement remark;
			
			@FindBy (xpath="//span[text()='Save']")private WebElement saveBtn;
			
			public _2_NMProfile2()
			{
				PageFactory.initElements(driver, this);
			}
			
			public void verifynewBtn() throws Exception
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
			
			public void verifyProviderCon() throws Exception
			{
				Thread.sleep(1500);
				ProviderCon.click();                                   //This is correct process.
				
				for(int i=0;i<2;i++)
				{
					Thread.sleep(1500);
					ProviderCon.sendKeys(Keys.DOWN);
				}
				ProviderCon.sendKeys(Keys.ENTER);
			}
			
			
		/*	public void verifyProviderCon1() throws Exception             //Need to test in office
			{
				Thread.sleep(1500);
				ProviderCon.click();
				if(ProviderCon.getText()== "NM Group Entity")
				{
					NMGroupTy.click();
				
					for(int i=0;i<1;i++)
					{
						Thread.sleep(1500);
						NMGroupTy.sendKeys(Keys.DOWN);
					}
					NMGroupTy.sendKeys(Keys.ENTER);
					
				}
			}
		*/	
			public void verifyNMGroupTy() throws Exception         //When user select NM Group Entity
			{
				verifyProviderCon();
				//verifyProviderCon1();
				Thread.sleep(1500);
				
				NMGroupTy.click();
				
				for(int i=0;i<1;i++)
				{
					Thread.sleep(1500);
					NMGroupTy.sendKeys(Keys.DOWN);
				}
				NMGroupTy.sendKeys(Keys.ENTER);
			}
		/*	public void verifynetworkEnt()                      //When user select NM Group Provider
			{
				networkEnt.click();
			}*/
			public void verifycurrency() throws Exception
			{
				verifyNMGroupTy();
				Thread.sleep(1500);
				currency.click();
				
				for(int i=0;i<2;i++)
				{
					Thread.sleep(1500);
					currency.sendKeys(Keys.DOWN);
				}
				currency.sendKeys(Keys.ENTER);
			}
			public void verifyname() throws Exception
			{
				
				name.sendKeys(readExcel(4, 2));
			}
				
			/*public void vrfycode()
			{
				code.sendKeys(auto);
			}*/
			public void verifymemberGrp() throws Exception
			{
				memberGrp.click();
				
				for(int i=0;i<2;i++)
				{
					Thread.sleep(1000);
					memberGrp.sendKeys(Keys.UP);
				}
				memberGrp.sendKeys(Keys.ENTER);
				
			/*	try
				{
					//	memberGrp.sendKeys(readExcelFile(3, 2));
					memberGrp.sendKeys(_1_NetMemTypeProfile2.verifyName());            //To capture the data from previous screen(Network Member Type Profile)
					Thread.sleep(2000);
				driver.switchTo().alert().accept();	
				}
				catch(Exception e)
				{
					System.out.println("The exception is Handled= "+e);
				}
				*/
			}
			
			public void verifyaddress() throws Exception
			{
				address.sendKeys(readExcel(4,4));
			}
			public void verifyNMCountry() throws Exception
			{
				verifyProviderCon();
				//NMCountry.sendKeys(readExcelFile(3, 4));
				NMCountry.click();
				for(int i=0;i<=224;i++)
				{
					Thread.sleep(200);
					NMCountry.sendKeys(Keys.DOWN);
				}
				NMCountry.sendKeys(Keys.ENTER);
			}
			public void verifycity() throws Exception
			{
				verifyNMCountry();
				Thread.sleep(2000);
				city.sendKeys(readExcel(3, 5));
				for(int i=0;i<=1;i++)
				{
					Thread.sleep(1000);
					city.sendKeys(Keys.DOWN);
				}
				city.sendKeys(Keys.ENTER);
			}
			public void verifycitySubLoc() throws Exception
			{
				verifycity();
				Thread.sleep(1500);
				citySubLoc.sendKeys(readExcel(4, 6));
				Thread.sleep(2000);
				/*citySubLoc.click();
				
				for(int i=0;i<=8;i++)
				{
					citySubLoc.sendKeys(Keys.DOWN);
				}
				citySubLoc.sendKeys(Keys.ENTER);*/
			}
			
			
			public void verifyPhone() throws Exception
			{
				phone.sendKeys(readExcel(4, 8));
				Thread.sleep(2000);
			}
			public void verifyFax() throws Exception
			{
				fax.sendKeys(readExcel(4, 9));
				Thread.sleep(2000);
			}
			public void verifyEmail1() throws Exception
			{
				Email1.sendKeys(readExcel(4, 10));
				Thread.sleep(2000);
			}
			public void verifyKeyPerson() throws Exception
			{
				
			Keyperson.sendKeys(readExcel(4, 11));
				Thread.sleep(2000);
			
			}
			public void verifyKPDesignation() throws Exception
			{
				KPdesignation.sendKeys(readExcel(4, 12));
				Thread.sleep(2000);
			}
			public void verifyKPMobile() throws Exception
			{
				KPmobile.sendKeys(readExcel(4, 13));
				Thread.sleep(2000);
			}
			public void verifyKPmail() throws Exception
			{
				KPmail.sendKeys(readExcel(4, 14));
				Thread.sleep(2000);
			}
			public void verifyURL() throws Exception
			{
				url.sendKeys(readExcel(4, 15));	
			}
			
			public void verifyownership() throws Exception
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
				Thread.sleep(2000);
				js.executeScript("arguments[0].scrollIntoView();", KPMobEle);
				
				ownership.click();
				for(int i=0;i<=1;i++)
				{
					Thread.sleep(1500);
					ownership.sendKeys(Keys.DOWN);
				}
				ownership.sendKeys(Keys.ENTER);
			}
			public void verifygpsLocation() throws Exception
			{
				gpsLocation.sendKeys(readExcel(4, 16));
			}
			public void verifyremarks() throws Exception
			{
				remarks.sendKeys(readExcel(4, 17));
			}
			public void veriffyactiveSta() throws Exception
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
				js.executeScript("arguments[0].scrollIntoView();", KPMobEle);
				Thread.sleep(2000);
				activeSta.click();
				Thread.sleep(1500);
			}
			
			public void verifyServicePT() throws Exception
			{
			//	ServicePT.sendKeys(readExcelFile(row, col));
				JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
				js.executeScript("arguments[0].scrollIntoView();", KPMobEle);
				Thread.sleep(2000);
				
				PTsearchBtn.click();
				Thread.sleep(1500);
				priceTab.sendKeys("M");                                                       //Pending
				Thread.sleep(1500);
				searchBtn.click();                                           
				for(int i=0;i<=3;i++)
				{
					Thread.sleep(1500);
					ele1.sendKeys(Keys.DOWN);
				}
				ele1.sendKeys(Keys.ENTER);
				
				
			}
			
		
			
		/*	public void verifydrugPT()
			{
				//drugPT.sendKeys(readExcelFile(row, col));
				
				
				for(int i=0;i<=3;i++)
				{
					Thread.sleep(1500);
					PTsearchBtn.sendKeys(Keys.DOWN);
				}
				PTsearchBtn.sendKeys(Keys.ENTER)
			}
			public void verifydiscount()
			{
				discount.sendKeys(readExcelFile(row, col));
			}
			*/
			
		//Contact Details	
			
			public void verifyContactDetails() throws Exception
			{
				
				JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
				Thread.sleep(2000);
				js.executeScript("arguments[0].scrollIntoView();", fl);
				
				Thread.sleep(2000);
				conName.sendKeys(readExcel(4, 20));
				Thread.sleep(2000);
				desgn.sendKeys(readExcel(4, 21));
				Thread.sleep(2000);
				phone2.sendKeys(readExcel(4, 22));
				Thread.sleep(2000);
				email2.sendKeys(readExcel(4, 23));
				Thread.sleep(2000);
				remark.sendKeys(readExcel(4, 24));
				
			}
			
			public void verifysaveBtn()
			{
				 saveBtn.click();
				 driver.switchTo().alert().accept();
			}


}
