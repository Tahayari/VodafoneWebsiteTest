package ro.vodafone.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ro.vodafone.qa.base.TestBase;
import ro.vodafone.qa.pages.LoginPage;

public class LoginPageTest extends TestBase	{
	
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Inregistreaza-te in MyVodafone - Vodafone");
	}
	
	@Test
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
