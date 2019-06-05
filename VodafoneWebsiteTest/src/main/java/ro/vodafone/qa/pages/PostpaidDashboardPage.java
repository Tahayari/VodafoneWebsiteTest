package ro.vodafone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ro.vodafone.qa.base.TestBase;

public class PostpaidDashboardPage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Detalii factură')]")
	WebElement facturaTxt ;
		
	public PostpaidDashboardPage(){
		PageFactory.initElements(driver,this);
	}
	
	
}
