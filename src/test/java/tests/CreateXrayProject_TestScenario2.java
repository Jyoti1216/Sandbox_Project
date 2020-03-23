package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CreateProject;
import utilities.ExtentReport;
import utilities.LoadProperties;
import utilities.Locators;

public class CreateXrayProject_TestScenario2 {

	CreateProject createproject;

	@BeforeClass
	private void Setup() {

		createproject = new CreateProject();
	}

	@Test(priority = 8)
	private void login_ValidUserValidPass() throws Exception {

		Thread.sleep(3000);
		createproject.Click(Locators.loginAgain);
		createproject.login(LoadProperties.config.getProperty("user"), LoadProperties.config.getProperty("password"));
		Thread.sleep(5000);

		ExtentReport.test.log(LogStatus.PASS, "");
	}

	@Test(priority = 9)
	private void CreateXrayProject() throws Exception {

		createproject.Click(Locators.Project);
		createproject.Click(Locators.CreateProject);
		createproject.Click(Locators.XrayProject);
		createproject.Click(Locators.Next);
		createproject.Click(Locators.Select);
	}

	@Test(priority = 10)
	private void ProjectName() throws Exception {

		Thread.sleep(2000);
		createproject.Name(LoadProperties.config.getProperty("XrayProject_name1"));
	}

	@Test(priority = 11)
	private void UserStory() {

		createproject.userstories(LoadProperties.config.getProperty("story2"));
	}
	
	@Test(priority = 12)
	private void logout() {
		
		createproject.logout();
	}
}
