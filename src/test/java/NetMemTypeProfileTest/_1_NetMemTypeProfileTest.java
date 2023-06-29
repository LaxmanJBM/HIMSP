package NetMemTypeProfileTest;
import java.util.concurrent.TimeUnit;	
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Browser;
import Utility.CommonFile;
import _1_Network_Development._1_NetMemTypeProfile1;
import _1_Network_Development._1_NetMemTypeProfile2;

public class _1_NetMemTypeProfileTest extends Browser{
	
		
	_1_NetMemTypeProfile1 peg1;
	_1_NetMemTypeProfile2 peg2;
			
			@BeforeMethod
			public void setup() throws Exception 
			{
				
				initilization();	
				peg1=new _1_NetMemTypeProfile1();
				peg2=new _1_NetMemTypeProfile2();
				peg1.VerifyAppLogIn();
				Thread.sleep(3000);
				
				peg1.verifyHIMSBtn();
				Thread.sleep(2000);
			    peg1.verifynetDevBtn();
			    Thread.sleep(2000);
			    peg1.verifyprofile();
			    Thread.sleep(2000);
				peg2.verifyNewBtn();
			    
				
				
				//peg2.verifySearchBtn1(); //This is for Search and edit button
				//Thread.sleep(2000);
				
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			}
			

	//To verify the JBM Logo is Displayed		
			@Test(priority=1,enabled=true)
			public void JBMLogoTest()
			{
				boolean logo = peg1.verifyJBMLogo();
				Reporter.log("Show the status of JBM Logo= "+logo);
			}
	//To verify the Financial Year		
			@Test(priority=2,enabled=true)
			public void finYearLebalTest()
			{
				String lebal = peg1.verifyfinYearLebal();
				Reporter.log("Show the Financial Year Lebal= "+lebal);
			}
	//To insert the Name		
			@Test(priority=3,enabled=true)
			public void nameTest() throws Exception
			{
				 peg2.verifyName();	
			}
	//To get the Text		
			@Test(priority=4,enabled=true)
			public void eleTest()
			{
				String text = peg2.verifyEle();
				Assert.assertEquals(text, "Network Member Type Profile");
				Reporter.log("Show the Text ="+text);
			}
	//To insert the Short Name		
			@Test(priority=5,enabled=true)
			public void shortNemeTest() throws Exception
			{
				peg2.verifyShortName();
			}
	//To Choose Network Type		
			@Test(priority=6,enabled=true)
			public void netTypeTest() throws Exception
			{
				peg2.verifyNetType();
			}
	//To Write the Remark		
			@Test(priority=7,enabled=true)
			public void remarkTest() throws Exception
			{
				peg2.verifyRemark();
			}
	//Finally save the data	by clicking	
			@Test(priority=8,enabled=true)
			public void saveBtnTest() throws Exception
			{
				 peg2.verifySaveBtn();
				
			}
			
			

	/*		
			
		//This is for Edit option
			
			@Test(priority=1,enabled=false)
			public void searchBtnTest1() throws Exception
			{
				peg2.verifySearchBtn1();
			}
			@Test(priority=2,enabled=false,dependsOnMethods="searchBtnTest1")
			public void searchBtnTest2() throws Exception
			{
				peg2.verifySearchBtn2();
			}
			@Test(priority=3,enabled=false)
			public void editTest() throws Exception
			{
				peg2.verifyEdit();
			}
			@Test(priority=4,enabled=true)
			public void shortNameTest() throws Exception
			{
				peg2.verifySearchBtn2();      //This is for Edit option
				
				Thread.sleep(4000);
				peg2.verifyEdit();
				Thread.sleep(3000);
				peg2.verifyShortName2();
				Thread.sleep(2000);
				peg2.verifySaveBtn2();
			}

			@Test(priority=5,enabled=false)
			public void saveBtnTest2() throws Exception
			{
				peg2.verifySaveBtn2();
			}*/
			
			@AfterMethod
			public void exit(ITestResult b) throws Throwable
			{
				if(ITestResult.FAILURE == b.getStatus())
				{
					
					CommonFile.captureScreenshotFaildTC(driver,b.getName());
				}
				report.flush();
				Thread.sleep(2500);
				driver.quit();
			}

}
