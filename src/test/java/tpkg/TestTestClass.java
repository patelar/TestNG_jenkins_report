package tpkg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestClass {
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is before test");
	}
	
	@BeforeClass
	public void beforeCLass(){
		System.out.println("This is before class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is before method");
	}
	
	@Test
	public void firstTest(){
		System.out.println("This is first test");
	}
	@Test
	public void secondTest(){
		System.out.println("This is second test");
	}
	@Test
	public void thirdTest(){
		System.out.println("This is third test");
	}
	@Test
	public void forthTest(){
		System.out.println("This is forth test");
	}
	@Test
	public void fifthTest(){
		System.out.println("This is fifth test");
	}
	
	
	@Test
	public void sixthTest(){
		System.out.println("This is sixth test");
		int a=20;
		int b=20;
		Assert.assertEquals(a, b);
	}
	
	@Test
	public void seventhTest(){
		System.out.println("This is seventh test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("this is after method");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("this is after class");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("this is after test");
	}

}
