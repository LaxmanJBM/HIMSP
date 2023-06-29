package NetMemTypeProfileTest;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Browser;
import Utility.CommonFile;
import _1_Network_Development._2_NMProfile1;
import _1_Network_Development._2_NMProfile2;
public class _2_NetworkMemberProfileTest extends Browser{
	
	_2_NMProfile1 nmp;
	_2_NMProfile2 nmp2;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		nmp=new _2_NMProfile1();
		nmp2=new _2_NMProfile2();
		nmp.verifyNetMemPro();
		Thread.sleep(2000);
		nmp2.verifynewBtn();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@Test(priority=1,enabled=true)
	public void test1() throws Exception
	{
	//	nmp2.verifyProviderCon1();                            //need to test in office
	}
	@Test(priority=1,enabled=true)
	public void ProviderConTest() throws Exception
	{
		nmp2.verifyProviderCon();
	}
	@Test(priority=2,enabled=true)
	public void NMGroupTyTest() throws Exception
	{
		nmp2.verifyNMGroupTy();
	}
	
	@Test(priority=3,enabled=true)
	public void currencyTest() throws Exception
	{
		nmp2.verifycurrency();
	}
	@Test(priority=4,enabled=true)
	public void nameTest() throws Exception
	{
		nmp2.verifyname();
	}
	@Test(priority=5,enabled=true)
	public void memberGrpTest() throws Exception
	{
		nmp2.verifymemberGrp();                                        //Need To check
	}
	@Test(priority=6,enabled=true)
	public void addressTest() throws Exception
	{
		nmp2.verifyaddress();
	}
	@Test(priority=7,enabled=false)
	public void NMCountryTest() throws Exception
	{
		nmp2.verifyNMCountry();
	}
	@Test(priority=8,enabled=false)
	public void cityTest() throws Exception
	{
		nmp2.verifycity();
	}
	
	@Test(priority=9,enabled=false)
	public void citySubLocTest() throws Exception
	{
		nmp2.verifycitySubLoc();
	}
	
	@Test(priority=10,enabled=false)
	public void verifyPhone() throws Exception
	{
		nmp2.verifyPhone();
	}
	@Test(priority=11,enabled=false)
	public void verifyFax() throws Exception
	{
		nmp2.verifyFax();
	}
	@Test(priority=12,enabled=false)
	public void verifyEmail1() throws Exception
	{
		nmp2.verifyEmail1();
	}
	@Test(priority=13,enabled=false)
	public void verifyKeyPerson() throws Exception
	{
	   nmp2.verifyKeyPerson();
	}
	@Test(priority=14,enabled=false)
	public void verifyKPDesignation() throws Exception
	{
		nmp2.verifyKPDesignation();
	}
	@Test(priority=15,enabled=false)
	public void verifyKPMobile() throws Exception
	{
		nmp2.verifyKPMobile();
	}
	@Test(priority=16,enabled=false)
	public void verifyKPmail() throws Exception
	{
		nmp2.verifyKPmail();
	}
	@Test(priority=17,enabled=false)
	public void verifyURL() throws Exception
	{
		nmp2.verifyURL();
	}
	@Test(priority=18,enabled=false)
	public void ownershipTest() throws Exception
	{
		nmp2.verifyownership();
	}
	@Test(priority=19,enabled=false)
	public void gpsLocationTest() throws Exception
	{
		nmp2.verifygpsLocation();
	}
	@Test(priority=20,enabled=false)
	public void remarksTest() throws Exception
	{
		nmp2.verifyremarks();
	}
	@Test(priority=21,enabled=false)
	public void activeStaTest() throws Exception
	{
		nmp2.veriffyactiveSta();
	}
	@Test(priority=22,enabled=false)
	public void servicePTTest() throws Exception
	{
		nmp2.verifyServicePT();
	}
	@Test(priority=23,enabled=false)
	public void contactDetailsTest() throws Exception
	{
		nmp2.verifyContactDetails();
	}
	@Test(priority=24,enabled=false)
	public void saveTest()
	{
		nmp2.verifysaveBtn();
	}
	
	
	@AfterMethod
	public void exit(ITestResult b) throws Throwable
	{
		if(ITestResult.FAILURE == b.getStatus())
		{
			
			CommonFile.captureScreenshotFaildTC(driver,b.getName());
		}
		Thread.sleep(2000);
		driver.quit();
	}
	

}
