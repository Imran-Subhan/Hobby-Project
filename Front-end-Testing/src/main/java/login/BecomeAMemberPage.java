package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeAMemberPage {
	
	private WebDriver driver;
	
	@FindBy (id = "UsernameInp")
	private WebElement CreateUsername; 
	
	@FindBy (id = "PasswordInp")
	private WebElement CreatePassword;
	
	@FindBy (xpath = "/html/body/form/button")
	private WebElement Submit;
	
// constructor
	
	public BecomeAMemberPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//Methods
	public void CreatePassword() {
		CreatePassword.click();
		CreatePassword.sendKeys("45678");
		
	}
	public void CreateUsername() {
		CreateUsername.click();
		CreateUsername.sendKeys("fghej");
	}
	public void submitUser() {
		Submit.click();
	}

}
