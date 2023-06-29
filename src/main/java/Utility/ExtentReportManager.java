package Utility;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {
	
	public static ExtentReports report;
	public static ExtentReports getReportInstance()
	{
		if(report==null)
		{
		Date d=new Date();
		String date= d.toString().replace(" ", "-").replace(":", "-");
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\Admin\\eclipse-workspace\\HIMS_P\\ExtentReports//"+ date +"report.html");
//Ok		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\Admin\\eclipse-workspace\\HIMS_Project\\Extent_Report\\ report.html");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Enviornement", "Production");
		report.setSystemInfo("Build Number", "001.1245.25");
		report.setSystemInfo("Browser", "Chrome");
		
		htmlReporter.config().setDocumentTitle("UI Automation");
		htmlReporter.config().setDocumentTitle("UI Test Report");
		}
		return report;

}
}
