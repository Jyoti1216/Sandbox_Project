package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CreateProject;
import pages.Registration_page;
import utilities.ExtentReport;
import utilities.InvokeBrowser;
import utilities.LoadProperties;
import utilities.Locators;

public class CreateXrayProject_TestScenario3 {

	CreateProject createproject;
	Registration_page registration;

	@BeforeClass 
	private void Setup() {

		registration = new Registration_page();
		createproject = new CreateProject();
	
		InvokeBrowser.OpenSite();
	}
	
	@Test(priority = 13)
	private void New_Registration() throws Exception {
		
		registration.register(LoadProperties.config.getProperty("firstName"),
				LoadProperties.config.getProperty("lastName"), LoadProperties.config.getProperty("companyName"),
				LoadProperties.config.getProperty("Email"));
		registration.VerifyMail(LoadProperties.config.getProperty("Email"), LoadProperties.config.getProperty("EmailPassword"));
		registration.EnterPassword(LoadProperties.config.getProperty("password"));
	}
	
	@Test(priority = 14)
	private void login_ValidUserValidPass() throws Exception {

		Thread.sleep(3000);
		createproject.login(LoadProperties.config.getProperty("user"), LoadProperties.config.getProperty("password"));
		Thread.sleep(5000);

		ExtentReport.test.log(LogStatus.PASS, "");
	}

	@Test(priority = 15)
	private void CreateXrayProject() throws Exception {

		createproject.Click(Locators.Project);
		createproject.Click(Locators.CreateProject);
		createproject.Click(Locators.XrayProject);
		createproject.Click(Locators.Next);
		createproject.Click(Locators.Select);
	}

	@Test(priority = 16)
	private void ProjectName() {

		createproject.Name(LoadProperties.config.getProperty("XrayProject_Name2"));
	}

	@Test(priority = 17)
	private void UserStory() {

		createproject.userstories(LoadProperties.config.getProperty("story3"));
	}

	@Test(priority = 18)
	private void logout() {

		createproject.logout();
	}

}
