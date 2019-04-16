package ro.vodafone.qa.pages;

import static ro.vodafone.qa.base.TestBase.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ro.vodafone.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//form[@name='LoginPortalDesktop_Authentication']//input[@name='IDToken1']")
	WebElement username;

	@FindBy(xpath="//input[@id='PortalDesktop_Authenticationlogin-password']")
	WebElement password;

	@FindBy(xpath="//button[@id='PortalDesktop_Authenticationauthenticate']")
	WebElement loginBtn;

	@FindBy(xpath="//body[@class='myvodafone autentificare']/div[@class='page-wrap']/div[@class='page']/div[@id='content']/div[@class='row']/div[@id='SSOBox_3_portletBox']/div[@id='SSOBox_3']/div[@class='port-authentication port-authentication-grid-3 grid-3']/form[@id='loginFormPortalDesktop_Authentication']/div[@class='form-row submit-row']/a[1]")
	WebElement contnouBtn;

	@FindBy(partialLinkText="Logo Vodafo")
	WebElement vdfLogo;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateVDFLogo(){
		return vdfLogo.isDisplayed();
	}
	
	public PostpaidDashboardPage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new PostpaidDashboardPage();
	}
	
	
	
	
	
	
	
	
	
}
