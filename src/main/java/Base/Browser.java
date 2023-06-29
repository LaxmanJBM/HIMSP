package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.CommonFile;
import Utility.ExtentReportManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends CommonFile{
	
	public ExtentReports report=ExtentReportManager.getReportInstance();
	public ExtentTest logger;

protected static WebDriver driver;
	
	public void initilization() throws Exception
	{

//Without Using Headless Browser		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		driver = new ChromeDriver(options);
		driver.get(readExcelFile(0, 0));
		driver.manage().window().maximize();  
		

		
//Using Headless Browser 		
	/*	System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Admin\\eclipse-workspace\\HIMS_P\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*","ignore-certificate-errors"); 
	    options.addArguments("headless");
	    options.addArguments("window-size=1200x600");                                              //Its Run properly
	    driver = new ChromeDriver(options);
	    driver.get(readExcelFile(0, 0));
	    System.out.println("title is: " + driver.getTitle()); */
		
		
	}

}
