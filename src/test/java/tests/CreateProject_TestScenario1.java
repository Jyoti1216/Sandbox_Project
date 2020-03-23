package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CreateProject;
import utilities.ExtentReport;
import utilities.LoadProperties;
import utilities.Locators;

public class CreateProject_TestScenario1 {
	
	CreateProject createproject;
	
	@BeforeClass
	private void Setup() throws InterruptedException {
		
		createproject = new CreateProject();
	}
	
	@Test(priority = 3)
	private void login_ValidUserValidPass() throws Exception {
		
		Thread.sleep(5000);
		createproject.login(LoadProperties.config.getProperty("user"), LoadProperties.config.getProperty("password"));
		Thread.sleep(5000);

		ExtentReport.test.log(LogStatus.PASS, "");
	}
	
	@Test(priority = 4)
	private void NewProject() throws InterruptedException {
		
		createproject.Click(Locators.CloseButton);
		createproject.Click(Locators.OKButton);
		createproject.Click(Locators.Project);
		createproject.Click(Locators.CreateProject);
		createproject.Click(Locators.ScrumProject);
		createproject.Click(Locators.Next);
		createproject.Click(Locators.Select);
	}
	
	@Test(priority = 5)
	private void ProjectName() {
		
		createproject.Name(LoadProperties.config.getProperty("Project_Name1"));
	}

	@Test(priority = 6)
	private void UserStory() {
		
		createproject.userstories(LoadProperties.config.getProperty("story1"));
	}
	
	@Test(priority = 7)
	private void logout() {
	
		createproject.logout();
	}
}


