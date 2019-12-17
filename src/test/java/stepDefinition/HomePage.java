package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.trello.common.framework.cucumber.web.core.PageFactory;

import cucumber.api.java.en.Given;
import pageObject.HomePagePO;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePage.
 */
public class HomePage  {
	
	/** The driver. */
	WebDriver driver = Hooks.driver;

	/**
	 * User is on trello home page.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^User is on Trello Home Page \"([^\"]*)\"$")
	public void user_is_on_Trello_Home_Page(String url) throws Throwable {
		HomePagePO homePagePO = PageFactory.instantiatePage(driver, HomePagePO.class);
		homePagePO.getHomePage(url);
	}

	/**
	 * User click on sign in button.
	 *
	 * @throws Throwable the throwable
	 */
	@Given("^User Click on Create User Button$")
	public void user_Click_on_Create_User_Button() throws Throwable {
		HomePagePO homePagePO = PageFactory.instantiatePage(driver, HomePagePO.class);
		homePagePO.clickCreateUser();
	}
	
	/**
	 * User clicks on sign in button.
	 *
	 * @throws Throwable the throwable
	 */
	@Given("^User Clicks on Sign In Button$")
	public void user_Clicks_on_Sign_In_Button() throws Throwable {
		HomePagePO homePagePO = PageFactory.instantiatePage(driver, HomePagePO.class);
		homePagePO.clickSignIn();
	}


}
