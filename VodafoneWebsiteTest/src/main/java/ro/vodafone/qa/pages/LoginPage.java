package ro.vodafone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ro.vodafone.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//form[@name='LoginPortalDesktop_Authentication']//input[@name='IDToken1']")
	@CacheLookup
	WebElement username;

	@FindBy(xpath="//input[@id='PortalDesktop_Authenticationlogin-password']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath="//button[@id='PortalDesktop_Authenticationauthenticate']")
	@CacheLookup
	WebElement loginBtn;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/a[1]")
	@CacheLookup
	WebElement contnouBtn;

	@FindBy(partialLinkText="Logo Vodafo")
	@CacheLookup
	WebElement vdfLogo;
	
	@FindBy(xpath="//form[@name='LoginPortalDesktop_Authentication']//a[@title='Am uitat numele de utilizator'][contains(text(),'Am uitat numele de utilizator')]")
	@CacheLookup
	WebElement forgotUsrnameURL;
	
	@FindBy(xpath="//form[@name='LoginPortalDesktop_Authentication']//a[@title='Am uitat parola'][contains(text(),'Am uitat parola')]")
	@CacheLookup
	WebElement fogotPassURL;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateVDFLogo(){
		return vdfLogo.isDisplayed();
	}
	
	public RecoverUsrnamePage forgotUsrname(){
		forgotUsrnameURL.click();
		return new RecoverUsrnamePage();
	}
	
	public RecoverPwdPage forgotPwd(){
		fogotPassURL.click();
		return new RecoverPwdPage();
	}
	
	public RegisterPage contNouBtn(){
		contnouBtn.click();
		return new RegisterPage();
	}
	
	public PostpaidDashboardPage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new PostpaidDashboardPage();
	}
	
	
}
