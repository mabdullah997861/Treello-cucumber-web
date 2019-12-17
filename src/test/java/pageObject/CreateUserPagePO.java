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
public class CreateUserPagePO  extends WebDriverBase{
	
	/** The email input box. */
	private static String emailInputBox = getLocator("emailInputBox");
	
	/** The continue button. */
	private static String continueButton = getLocator("continueButton");
	
	/** The name input box. */
	private static String nameInputBox = getLocator("nameInputBox");

	/** The passwordinput box. */
	private static String passwordinputBox = getLocator("passwordinputBox");
	
	/** The sign up button. */
	private static String signUpButton = getLocator("signUpButton");

	
	/**
	 * Enter value in email input box.
	 *
	 * @param value the value
	 * @param domain the domain
	 */
	public void enterValueInEmailInputBox(String value, String domain) {
        waitForPageToLoad();
        wait(Until.elementsToBePresent(emailInputBox));
		clickOnElement(emailInputBox);
        By locator = ObjectLocators.getBySelector(emailInputBox);
		WebElement emailInputBoxElement = driver.findElement(locator);
		emailInputBoxElement.sendKeys(value+getRandomIntBetweenRange()+domain);
	}
	
	/**
	 * Click continue button.
	 */
	public void clickContinueButton() {
        wait(Until.elementsToBePresent(continueButton));
		clickOnElement(continueButton);
		
	}
	
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
	 * Enter value in email input box.
	 *
	 * @param firstname the firstname
	 */
	public void enterFirstNameInputBox(String firstname) {
        waitForPageToLoad();
        wait(Until.elementsToBePresent(nameInputBox));
		clickOnElement(nameInputBox);
        By locator = ObjectLocators.getBySelector(nameInputBox);
		WebElement emailInputBoxElement = driver.findElement(locator);
		emailInputBoxElement.sendKeys(firstname+getRandomIntBetweenRange());
	}
	
	/**
	 * Enter value in email input box.
	 *
	 * @param password the password
	 */
	public void enterPasswordInputBox(String password) {
        waitForPageToLoad();
        wait(Until.elementsToBePresent(passwordinputBox));
		clickOnElement(passwordinputBox);
        By locator = ObjectLocators.getBySelector(passwordinputBox);
		WebElement emailInputBoxElement = driver.findElement(locator);
		emailInputBoxElement.sendKeys(password+getRandomIntBetweenRange());
	}
	
	
	/**
	 * Click sign up button.
	 */
	public void clickSignUpButton() {
        wait(Until.elementsToBePresent(signUpButton));
		clickOnElement(signUpButton);
		
	}
	
}
