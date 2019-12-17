package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.trello.common.framework.cucumber.web.core.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CreateUserPagePO;
import pageObject.HomePagePO;
import pageObject.SigninPagePO;

// TODO: Auto-generated Javadoc
/**
 * The Class SignInPage.
 */
public class CreateUserPage  {
	
	
	/** The driver. */
	WebDriver driver = Hooks.driver;

	/**
	 * User on sign in page with title.
	 *
	 * @param title the title
	 * @throws Throwable the throwable
	 */
	@Given("^User on Create User Page with title \"([^\"]*)\"$")
	public void user_on_Create_User_Page_with_title(String title) throws Throwable {
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.verifyPage(title);
	}

	

	/**
	 * User enters in the email text box.
	 *
	 * @param emailText the email text
	 * @param domain the domain
	 * @throws Throwable the throwable
	 */
	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\" in the email text box$")
	public void user_enters_and_in_the_email_text_box(String emailText, String domain) throws Throwable {
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.enterValueInEmailInputBox(emailText,domain);

	}

	/**
	 * User clicks continue button.
	 *
	 * @throws Throwable the throwable
	 */
	@Given("^User clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.clickContinueButton();

	}


	/**
	 * User enters first name.
	 *
	 * @param firstname the firstname
	 * @throws Throwable the throwable
	 */
	@Given("^User enters first name \"([^\"]*)\"$")
	public void user_enters_first_name(String firstname) throws Throwable {
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.enterFirstNameInputBox(firstname);
	}

	/**
	 * User enters password.
	 *
	 * @param password the password
	 * @throws Throwable the throwable
	 */
	@Given("^User enters Password \"([^\"]*)\"$")
	public void user_enters_Password(String password) throws Throwable {
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.enterPasswordInputBox(password);
	}

	/**
	 * User clicks on signup button.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^User clicks on Signup Button$")
	public void user_clicks_on_Signup_Button() throws Throwable {
		CreateUserPagePO createUserPagePO = PageFactory.instantiatePage(driver, CreateUserPagePO.class);
		createUserPagePO.clickSignUpButton();
	}


}
