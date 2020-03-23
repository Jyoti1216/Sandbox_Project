package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.InvokeBrowser;
import utilities.Locators;

public class CreateProject {
	
	public void login(String strUserName, String strPasword) {
		
		InvokeBrowser.driver.findElement(Locators.UserName).sendKeys(strUserName);
		InvokeBrowser.driver.findElement(Locators.Password).sendKeys(strPasword);
		InvokeBrowser.driver.findElement(Locators.login).click();
		InvokeBrowser.driver.switchTo().window(Registration_page.tabs.get(0));
	}

	public void Click(By locator) throws InterruptedException {

		InvokeBrowser.driver.findElement(locator).click();
		Thread.sleep(3000);
	}

	public void Name(String name) {
	
		InvokeBrowser.driver.findElement(Locators.ProjectName).sendKeys(name);
		InvokeBrowser.driver.findElement(Locators.SubmitButton).click(); 
	}

	public void userstories(String story) {
		
		WebDriverWait wait = new WebDriverWait(InvokeBrowser.driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserStoryField));
		InvokeBrowser.driver.findElement(Locators.UserStoryField).sendKeys(story);
		InvokeBrowser.driver.findElement(Locators.UserStoryField).sendKeys(Keys.ENTER);
	}

	public void logout() {
		
		InvokeBrowser.driver.findElement(Locators.ProfileButton).click();
		InvokeBrowser.driver.findElement(Locators.LogoutButton).click();
		InvokeBrowser.driver.switchTo().window(Registration_page.tabs.get(0));
	}

}
