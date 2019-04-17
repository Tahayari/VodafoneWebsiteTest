package ro.vodafone.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ro.vodafone.qa.base.TestBase;
import ro.vodafone.qa.pages.LoginPage;
import ro.vodafone.qa.pages.PostpaidDashboardPage;

public class LoginPageTest extends TestBase	{
	
	LoginPage loginPage;
	PostpaidDashboardPage postpaidDashboardPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
//	@Test(priority=1)
//	public void loginPageTitleTest(){
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "Inregistreaza-te in MyVodafone - Vodafone");
//	}
//	
//	@Test(priority=2)
//	public void vdfLogoTest(){
//		boolean flag = loginPage.validateVDFLogo();
//		Assert.assertTrue(flag);
//	}
	
	@Test(priority=3)
	public void loginMethodTest(){
		postpaidDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
