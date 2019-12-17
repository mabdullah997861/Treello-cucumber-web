package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.trello.common.framework.cucumber.web.core.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePagePO;
import pageObject.SigninPagePO;

// TODO: Auto-generated Javadoc
/**
 * The Class SignInPage.
 */
public class SignInPage  {
	
	
	/** The driver. */
	WebDriver driver = Hooks.driver;

	/**
	 * User on sign in page with title.
	 *
	 * @param title the title
	 * @throws Throwable the throwable
	 */
	@Given("^User on SignIn Page with title \"([^\"]*)\"$")
	public void user_on_SignIn_Page_with_title(String title) throws Throwable {
		SigninPagePO signinPagePO = PageFactory.instantiatePage(driver, SigninPagePO.class);
		signinPagePO.verifyPage(title);
	}


/**
 * User enters credentials as and.
 *
 * @param username the username
 * @param password the password
 * @throws Throwable the throwable
 */
@Given("^User enters credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_credentials_as_and(String username, String password) throws Throwable {
	SigninPagePO signinPagePO = PageFactory.instantiatePage(driver, SigninPagePO.class);
	signinPagePO.enterCredentials(username, password);
}

/**
 * User clicks login button.
 *
 * @throws Throwable the throwable
 */
@Given("^User clicks Login button$")
public void user_clicks_Login_button() throws Throwable {
	SigninPagePO signinPagePO = PageFactory.instantiatePage(driver, SigninPagePO.class);
	signinPagePO.clickLoginButton();
}


}
