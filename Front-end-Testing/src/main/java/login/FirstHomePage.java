package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstHomePage {
	
	public final static String url= "http://127.0.0.1:5501/Home.html";
	

	private WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	private WebElement navtoBecomeAMemberPage; 
	
	
// constructor
	
	public FirstHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//Methods
	public void navtoBecomeaMember() {
		navtoBecomeAMemberPage.click();
		
	}
	
}
