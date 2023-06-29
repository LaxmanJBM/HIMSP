package _1_Network_Development;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.Browser;
public class _2_NMProfile1 extends Browser{
		
		_1_NetMemTypeProfile1 nmtp1;
	@FindBy (xpath="//a[text()='Network Member Profile']")private WebElement NetMemPro; 
		
			public _2_NMProfile1()
			{
				PageFactory.initElements(driver, this);
			}
			public void verifyNetMemPro() throws Exception
			{
				nmtp1=new _1_NetMemTypeProfile1();
				nmtp1.VerifyAppLogIn();
				nmtp1.verifyHIMSBtn();
				nmtp1.verifynetDevBtn();
				Thread.sleep(2000);
				NetMemPro.click();
				
			}
}
