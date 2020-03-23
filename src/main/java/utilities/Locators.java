package utilities;

import org.openqa.selenium.By;

public class Locators extends LoadProperties {

	// New Registration
	public static By FirstName = By.xpath(LoadProperties.orXpath.getProperty("First_name"));
	public static By LastName = By.xpath(LoadProperties.orXpath.getProperty("Last_name"));
	public static By CompanyName = By.xpath(LoadProperties.orXpath.getProperty("company_name"));
	public static By Email = By.xpath(LoadProperties.orXpath.getProperty("email"));
	public static By Authorization = By.xpath(LoadProperties.orXpath.getProperty("authorize"));
	public static By Submit = By.xpath(LoadProperties.orXpath.getProperty("submit"));

	// Reset Password
	public static By Pass = By.xpath(LoadProperties.orXpath.getProperty("pass"));
	public static By Confirm = By.xpath(LoadProperties.orXpath.getProperty("confirm"));
	public static By ResetButton = By.xpath(LoadProperties.orXpath.getProperty("reset"));

	// Login
	public static By UserName = By.xpath(LoadProperties.orXpath.getProperty("username"));
	public static By Password = By.xpath(LoadProperties.orXpath.getProperty("password"));
	public static By RememberLogin = By.xpath(LoadProperties.orXpath.getProperty("rememberLogin"));
	public static By login = By.xpath(LoadProperties.orXpath.getProperty("Login"));

	// Create Project
	public static By CloseButton = By.xpath(LoadProperties.orXpath.getProperty("CloseButton"));
	public static By OKButton = By.xpath(LoadProperties.orXpath.getProperty("OKButton"));

	public static By Project = By.xpath(LoadProperties.orXpath.getProperty("project"));
	public static By CreateProject = By.xpath(LoadProperties.orXpath.getProperty("createProject"));
	public static By ScrumProject = By.xpath(LoadProperties.orXpath.getProperty("ScrumProject"));

	public static By XrayProject = By.xpath(LoadProperties.orXpath.getProperty("xrayProject"));
	public static By Next = By.xpath(LoadProperties.orXpath.getProperty("next"));
	public static By Select = By.xpath(LoadProperties.orXpath.getProperty("select"));
	public static By ProjectName = By.xpath(LoadProperties.orXpath.getProperty("name"));
	public static By SubmitButton = By.xpath(LoadProperties.orXpath.getProperty("submitbutton"));

	public static By UserStoryField = By.xpath(LoadProperties.orXpath.getProperty("usertext1"));

	//Logout Profile
	public static By ProfileButton = By.xpath(LoadProperties.orXpath.getProperty("profilebutton"));
	public static By LogoutButton = By.xpath(LoadProperties.orXpath.getProperty("logoutbutton"));
	
	public static By loginAgain = By.xpath(LoadProperties.orXpath.getProperty("loginagain"));


	// Create User Story
	public static By IssueType = By.xpath(LoadProperties.orXpath.getProperty("issueType"));
	public static By story = By.xpath(LoadProperties.orXpath.getProperty("story"));
	public static By StoryDesc = By.xpath(LoadProperties.orXpath.getProperty("storyDesc"));
	public static By CreateIssue = By.xpath(LoadProperties.orXpath.getProperty("createIssue"));
	
	//Create XrayTestPlan
	
	public static By Test_Plan = By.xpath(LoadProperties.orXpath.getProperty("Xray_Test_Plan"));
	public static By Create_Issue = By.xpath(LoadProperties.orXpath.getProperty("Create_issue"));
	public static By Task = By.xpath(LoadProperties.orXpath.getProperty("Task"));
	
	
	

}
