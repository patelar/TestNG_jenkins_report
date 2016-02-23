package tpkg;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jdk.internal.jfr.events.ExceptionThrownEvent;

public class TestTestClass {
	ExtentReports reports;
	ExtentTest logger;
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is before test");
		reports = new ExtentReports("./test-output/customReports.html");
		
	}
	
	@BeforeClass
	public void beforeCLass(){
		System.out.println("This is before class");
	}
	
	@BeforeMethod
	public void beforeMethod(final ITestContext testContext){
		System.out.println("This is before method");
		//logger =reports.startTest("commontest");
	}
	
	@Test
	public void firstTest(){
		System.out.println("This is first test");
		logger =reports.startTest("FirstTest");
		logger.log(LogStatus.INFO, "first test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	@Test
	public void secondTest(){
		System.out.println("This is second test");
		logger =reports.startTest("secondTest");
		logger.log(LogStatus.INFO, "second test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	@Test
	public void thirdTest(){
		System.out.println("This is third test");
		logger =reports.startTest("thirdTest");
		logger.log(LogStatus.INFO, "third test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	@Test
	public void forthTest(){
		System.out.println("This is forth test");
		logger =reports.startTest("forthTest");
		logger.log(LogStatus.INFO, "forth test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	@Test
	public void fifthTest(){
		System.out.println("This is fifth test");
		logger =reports.startTest("fifthTest");
		logger.log(LogStatus.INFO, "fifth test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	
	
	@Test
	public void sixthTest(){
		System.out.println("This is sixth test");
		logger =reports.startTest("sixthTest1");
		Assert.assertEquals(1,2);
		logger.log(LogStatus.PASS, "passed :D");
	}
	
	@Test
	public void seventhTest(){
		System.out.println("This is seventh test ");
		logger =reports.startTest("seventhTest");
		logger.log(LogStatus.INFO, "seventh test executing now");
		logger.log(LogStatus.PASS, "executed");
	}
	
	@AfterMethod()
	public void afterMethod(ITestResult result){
		System.out.println("this is after method");
		if(result.getStatus()==ITestResult.FAILURE){
			System.out.println("faulure recorded on test:"+result.getTestName());
			logger.log(LogStatus.FAIL, "this is failed");
		}
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("this is after class");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("this is after test");
		reports.endTest(logger);
		reports.flush();
	}

}
