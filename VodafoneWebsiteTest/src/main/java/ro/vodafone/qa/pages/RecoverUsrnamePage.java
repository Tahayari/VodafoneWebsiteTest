package ro.vodafone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ro.vodafone.qa.base.TestBase;

public class RecoverUsrnamePage extends TestBase{

	@FindBy(xpath="//input[@id='field-phoneNumber']")
	WebElement msisdnField;
	
	@FindBy(xpath="//input[@id='field-emailClient']")
	WebElement emailField;
	
	@FindBy(xpath="//button[@id='tap']")
	WebElement pasulUrmBtn;
	
	public RecoverUsrnamePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyRecoverUsrnamePageTitle(){
		return driver.getTitle();
	}
	
	
}
