package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CreateProject;
import pages.Registration_page;
import utilities.ExtentReport;
import utilities.InvokeBrowser;
import utilities.LoadProperties;
import utilities.Locators;

public class CreateXrayProject_TestScenario5 {

	CreateProject createproject;
	Registration_page registration;

	@BeforeClass
	private void Setup() throws Exception {

		registration = new Registration_page();
		createproject = new CreateProject();

		InvokeBrowser.OpenSite();
	}

	@Test(priority = 24)
	private void New_Registration() throws Exception {

		registration.register(LoadProperties.config.getProperty("firstName"),
				LoadProperties.config.getProperty("lastName"), LoadProperties.config.getProperty("companyName"),
				LoadProperties.config.getProperty("Email"));
		registration.VerifyMail(LoadProperties.config.getProperty("Email"),
				LoadProperties.config.getProperty("EmailPassword"));
		registration.EnterPassword(LoadProperties.config.getProperty("password"));
	}

	@Test(priority = 25)
	private void login_ValidUserValidPass() throws Exception {

		Thread.sleep(3000);
		createproject.login(LoadProperties.config.getProperty("user"), LoadProperties.config.getProperty("password"));
		Thread.sleep(5000);

		ExtentReport.test.log(LogStatus.PASS, "");
	}

	@Test(priority = 26)
	private void CreateXrayProject() throws Exception {

		createproject.Click(Locators.Project);
		createproject.Click(Locators.CreateProject);
		createproject.Click(Locators.XrayProject);
		createproject.Click(Locators.Next);
		createproject.Click(Locators.Select);
	}

	@Test(priority = 27)
	private void ProjectName() throws Exception {

		Thread.sleep(2000);
		createproject.Name(LoadProperties.config.getProperty("XrayProject_Name3"));
	}

	@Test(priority = 28)
	private void UserStory() {

		createproject.userstories(LoadProperties.config.getProperty("story5"));
	}

	@Test(priority = 29)
	private void logout() {

		createproject.logout();
	}

	@AfterClass
	public void endtest() {
		ExtentReport.endTest();
	}
}
