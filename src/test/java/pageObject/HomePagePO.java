package pageObject;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.trello.common.framework.cucumber.web.core.Until;
import com.trello.common.framework.cucumber.web.core.WebDriverBase;
import static com.trello.common.framework.cucumber.web.objectlocators.WebObjectLocators.getLocator;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePagePO.
 */
public class HomePagePO  extends WebDriverBase{
	
	/** The sign in link. */
	private static String signInLink = getLocator("signInLink");

	/** The create user link. */
	private static String createUserLink = getLocator("createUserLink");

	
	/**
	 * Click sign in.
	 */
	public void clickCreateUser() {
        wait(Until.elementsToBePresent(createUserLink));
		clickOnElement(createUserLink);
	}
	
	/**
	 * Click sign in.
	 */
	public void clickSignIn() {
        wait(Until.elementsToBePresent(signInLink));
		clickOnElement(signInLink);
	}
	
	/**
	 * Gets the home page.
	 *
	 * @param url the url
	 * @return the home page
	 */
	public void getHomePage(String url) {
		goToUrl(url);
		waitForPageToLoad();
	}
	
}
