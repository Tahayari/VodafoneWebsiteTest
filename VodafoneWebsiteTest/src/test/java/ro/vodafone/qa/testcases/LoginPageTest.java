package ro.vodafone.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ro.vodafone.qa.base.TestBase;
import ro.vodafone.qa.pages.LoginPage;
import ro.vodafone.qa.pages.PostpaidDashboardPage;
import ro.vodafone.qa.pages.RecoverPwdPage;
import ro.vodafone.qa.pages.RecoverUsrnamePage;
import ro.vodafone.qa.pages.RegisterPage;

public class LoginPageTest extends TestBase	{
	
	LoginPage loginPage;
	PostpaidDashboardPage postpaidDashboardPage;
	RecoverUsrnamePage recoverUsrnamePage;
	RecoverPwdPage recoverPwdPage;
	RegisterPage registerPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		recoverUsrnamePage = new RecoverUsrnamePage();
		recoverPwdPage = new RecoverPwdPage();
		registerPage = new RegisterPage();
	}
	
	// Verify Login Page Title
	@Test(priority=1,enabled=true)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Inregistreaza-te in MyVodafone - Vodafone");
	}
	
	// Validate VDF Logo
	@Test(priority=2,enabled=true)
	public void vdfLogoTest(){
		boolean flag = loginPage.validateVDFLogo();
		Assert.assertTrue(flag);
	}
	
	// Validate Login from authentication page
	@Test(priority=3)
	public void loginMethodTest(){
		postpaidDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	// Verify Recover username page title
	@Test(priority=4,enabled=true)
	public void verifyRecoverUsrnamePageTitle(){
		loginPage.forgotUsrname();
		String title = recoverUsrnamePage.verifyRecoverUsrnamePageTitle();
		Assert.assertEquals(title, "Recupereaza cont - MyVodafone - Vodafone");
	}
	
	// Verify Recover password page title
	@Test(priority=5,enabled=true)
	public void verifyRecoverPwdPageTitle(){
		loginPage.forgotPwd();
		String title = recoverPwdPage.verifyRecoverPwdPageTitle();
		Assert.assertEquals(title, "Recuperare parola - Vodafone.ro");
	}
	
	// Verify Register page breadcrum
	@Test(priority=6,enabled=true)
	public void verifyRegisterPage(){
		loginPage.contNouBtn();
		String actual = registerPage.verifyBreadcrum();
		Assert.assertEquals(actual, "Înregistrare");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
