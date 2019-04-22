package ro.vodafone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ro.vodafone.qa.base.TestBase;

public class RegisterPage extends TestBase{
	
	@FindBy(xpath="//input[@id='sso_phone_input']")
	WebElement msisdnField;
	
	@FindBy(xpath="//li[contains(text(),'Înregistrare')]")
	WebElement breadcrumb;
	
	@FindBy(xpath="//button[@id='continue1']")
	WebElement pasulUrmBtn;
	
	public RegisterPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyBreadcrum(){
		return breadcrumb.getText();
	}
	
	
	//TODO: Submit a MSISDN function
}
