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
public class DashBoardPagePO  extends WebDriverBase{
		/** The email input box. */
	private static String dashboardcontinueButton = getLocator("dashboardcontinueButton");
	
	/** The continue button. */
	private static String dashBoardTitleInputBox = getLocator("dashBoardTitleInputBox");
	
	/** The dashboardtodo 1. */
	private static String dashboardtodo1 = getLocator("dashboardtodo1");
	
	/** The dashboardtodo 2. */
	private static String dashboardtodo2 = getLocator("dashboardtodo2");
	
	/** The dashboardtodo 3. */
	private static String dashboardtodo3 = getLocator("dashboardtodo3");
	
	/** The home button. */
	private static String homeButton = getLocator("homeButton");

	
	/**
	 * Verify page.
	 *
	 * @param pageTitle the page title
	 */
	public void verifyPage(String pageTitle) {
        waitForPageToLoad();
        log.info("Title is "+driver.getTitle());
        assertTrue(driver.getTitle().contains(pageTitle));
	}
	
	
	/**
	 * Enter dash board title.
	 *
	 * @param title the title
	 */
	public void enterDashBoardTitle (String title) {
		
		 waitForPageToLoad();
	        wait(Until.elementsToBePresent(dashBoardTitleInputBox));
			clickOnElement(dashBoardTitleInputBox);
	        By locator1 = ObjectLocators.getBySelector(dashBoardTitleInputBox);
			WebElement titleInputBoxElement = driver.findElement(locator1);
			titleInputBoxElement.sendKeys(title+getRandomIntBetweenRange());
		}

	/**
	 * Click next.
	 */
	public void clickNext() {
		 waitForPageToLoad();
	        wait(Until.elementsToBePresent(dashboardcontinueButton));
			clickOnElement(dashboardcontinueButton);

	}
	
	/**
	 * Enter things to do.
	 *
	 * @param toDo1 the to do 1
	 * @param toDo2 the to do 2
	 * @param toDo3 the to do 3
	 */
	public void enterThingsToDo(String toDo1, String toDo2, String toDo3) {
		 waitForPageToLoad();
	        wait(Until.elementsToBePresent(dashboardtodo1));
			clickOnElement(dashboardtodo1);
			 By locator1 = ObjectLocators.getBySelector(dashboardtodo1);
				WebElement todo1Element = driver.findElement(locator1);
				todo1Element.sendKeys(toDo1);
				
				clickOnElement(dashboardtodo2);
				 By locator2 = ObjectLocators.getBySelector(dashboardtodo2);
					WebElement todo2Element = driver.findElement(locator2);
					todo2Element.sendKeys(toDo2);
					
					clickOnElement(dashboardtodo3);
					 By locator3 = ObjectLocators.getBySelector(dashboardtodo3);
						WebElement todo3Element = driver.findElement(locator3);
						todo3Element.sendKeys(toDo3);
				
	}

	/**
	 * Checks if is in home page.
	 */
	public void isInHomePage() {
		 waitForPageToLoad();
	        wait(Until.elementsToBePresent(homeButton));
	}
}
