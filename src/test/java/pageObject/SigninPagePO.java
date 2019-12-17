package pageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.trello.common.framework.cucumber.web.core.ObjectLocators;
import com.trello.common.framework.cucumber.web.core.Until;
import com.trello.common.framework.cucumber.web.core.WebDriverBase;
import static com.trello.common.framework.cucumber.web.objectlocators.WebObjectLocators.getLocator;

// TODO: Auto-generated Javadoc
/**
 * The Class SigninPagePO.
 */
public class SigninPagePO  extends WebDriverBase{
	
	/** The email input box. */
	private static String emailIdBox = getLocator("emailIdBox");
	
	/** The sign incontinue button. */
	private static String signIncontinueButton = getLocator("signIncontinueButton");

	/** The password box. */
	private static String passwordBox = getLocator("passwordBox");

	/** The login button. */
	private static String loginButton = getLocator("loginButton");
	
	/** The login submit button. */
	private static String loginSubmitButton = getLocator("loginSubmitButton");


	/**
	 * Verify page.
	 *
	 * @param pageTitle the page title
	 */
	public void verifyPage(String pageTitle) {
        waitForPageToLoad();
        assertTrue(pageTitle.equalsIgnoreCase(driver.getTitle()));
	}
	

	/**
	 * Enter credentials.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public void enterCredentials (String username, String password) {
		
		 waitForPageToLoad();
	        wait(Until.elementsToBePresent(emailIdBox));
			clickOnElement(emailIdBox);
	        By locator1 = ObjectLocators.getBySelector(emailIdBox);
			WebElement emailInputBoxElement = driver.findElement(locator1);
			emailInputBoxElement.sendKeys(username);
			clickOnElement(loginButton);
			waitForPageToLoad();
			clickOnElement(signIncontinueButton);
			waitForPageToLoad();
			   wait(Until.elementsToBePresent(passwordBox));
				clickOnElement(passwordBox);
		        By locator2 = ObjectLocators.getBySelector(passwordBox);
				WebElement passwordBoxElement = driver.findElement(locator2);
				passwordBoxElement.sendKeys(password);
		}
	
	/**
	 * Click login button.
	 */
	public void clickLoginButton() {
		waitForPageToLoad();
		wait(Until.elementsToBePresent(loginSubmitButton));
		clickOnElement(loginSubmitButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
