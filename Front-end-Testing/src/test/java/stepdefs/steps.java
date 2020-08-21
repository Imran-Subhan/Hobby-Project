package stepdefs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import login.BecomeAMemberPage;
import login.FirstHomePage;

public class steps {
	WebDriver driver;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Given("^We can Open Google search for and access the Arsenal Stats home page$")
	public void we_can_Open_Google_search_for_and_access_the_Arsenal_Stats_home_page() throws Throwable {
		System.out.println("this step open google and search for and access Arsenal Stats home page");
		driver.get(FirstHomePage.url);
		FirstHomePage HomePage = PageFactory.initElements(driver, FirstHomePage.class);
		HomePage.navtoBecomeaMember();
		BecomeAMemberPage CreateUser = PageFactory.initElements(driver, BecomeAMemberPage.class);
		CreateUser.CreateUsername();
		CreateUser.CreatePassword();
		CreateUser.submitUser();
		Thread.sleep(2000);
			
	}
	
	
	@When("^I navigate to Become A Member and create a Username and password$")
	public void navigate_to_Become_A_Member_and_create_a_Username_and_password() throws Throwable {
		
		System.out.println("this step is create a user login by entering a username and password");
		
	}
	
	@Then("^I can navigate to login and sign in with the Username and Password I created$")
	public void navigate_to_login_and_sign_in_with_the_Username_and_Password() throws Throwable {
		
		System.out.println("this step is to navigate to login and sign in with the Username and Password I created");
		
	

}
}
