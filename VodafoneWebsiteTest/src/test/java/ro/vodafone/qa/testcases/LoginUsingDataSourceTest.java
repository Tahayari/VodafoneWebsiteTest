package ro.vodafone.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ro.vodafone.qa.base.TestBase;
import ro.vodafone.qa.pages.LoginPage;
import ro.vodafone.qa.pages.PostpaidDashboardPage;
import ro.vodafone.qa.util.TestUtil;

public class LoginUsingDataSourceTest extends TestBase{

	LoginPage loginPage;
	PostpaidDashboardPage postpaidDashboardPage;
	
	String sheetName = "postpaid";

	public LoginUsingDataSourceTest(){
		super();
	}

	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();		
	}

	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider="getTestData")
	public void LoginPostpaidTest(String un,String pwd){
		postpaidDashboardPage = loginPage.login(un,pwd);
		
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
