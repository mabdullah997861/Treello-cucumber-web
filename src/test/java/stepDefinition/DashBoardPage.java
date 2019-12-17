package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.trello.common.framework.cucumber.web.core.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.DashBoardPagePO;
import pageObject.HomePagePO;
import pageObject.SigninPagePO;

// TODO: Auto-generated Javadoc
/**
 * The Class SignInPage.
 */
public class DashBoardPage  {
	
	
	/** The driver. */
	WebDriver driver = Hooks.driver;

	/**
	 * User is on dashboard page with title.
	 *
	 * @param title the title
	 * @throws Throwable the throwable
	 */
	@Given("^User is on Dashboard page with title \"([^\"]*)\"$")
	public void user_is_on_Dashboard_page_with_title(String title) throws Throwable {
		DashBoardPagePO dashBoardPagePO = PageFactory.instantiatePage(driver, DashBoardPagePO.class);
		dashBoardPagePO.verifyPage(title);
	}

	/**
	 * User enters in the title.
	 *
	 * @param title the title
	 * @throws Throwable the throwable
	 */
	@Given("^User enters \"([^\"]*)\" in the title$")
	public void user_enters_in_the_title(String title) throws Throwable {
		DashBoardPagePO dashBoardPagePO = PageFactory.instantiatePage(driver, DashBoardPagePO.class);
		dashBoardPagePO.enterDashBoardTitle(title);
	}

	/**
	 * User clicks next button.
	 *
	 * @throws Throwable the throwable
	 */
	@Given("^User clicks next button$")
	public void user_clicks_next_button() throws Throwable {
		DashBoardPagePO dashBoardPagePO = PageFactory.instantiatePage(driver, DashBoardPagePO.class);
		dashBoardPagePO.clickNext();

	}

	/**
	 * User enters.
	 *
	 * @param toDo1 the to do 1
	 * @param toDo2 the to do 2
	 * @param toDo3 the to do 3
	 * @throws Throwable the throwable
	 */
	@Given("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters(String toDo1, String toDo2, String toDo3) throws Throwable {
		DashBoardPagePO dashBoardPagePO = PageFactory.instantiatePage(driver, DashBoardPagePO.class);
		dashBoardPagePO.enterThingsToDo(toDo1, toDo2, toDo3);
	}

	
	/**
	 * User gets on trello dashboard.
	 *
	 * @throws Throwable the throwable
	 */
	@Then("^User gets on Trello Dashboard$")
	public void user_gets_on_Trello_Dashboard() throws Throwable {
	    
	}

	

}
