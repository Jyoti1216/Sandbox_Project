package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.Registration_page;
import utilities.ExtentReport;
import utilities.LoadProperties;

public class RegistrationTest {
	
	Registration_page registration;

	@BeforeClass
	@Parameters("Browser")
	public void setup(String Browser) throws Throwable {

		LoadProperties.property();

		ExtentReport.startTest();

		registration = new Registration_page();
		registration.LaunchSandbox(Browser);

	}

	@Test(priority = 0)
	private void SandBox() throws Exception {

		String title = registration.Title();
		Assert.assertTrue(title.contains("System Dashboard - Sandbox Environment"));
		ExtentReport.test.log(LogStatus.PASS, "Sandbox Title Verfied");
	}

	@Test(priority = 1)
	public void Register_ValidUserValidPass() throws Exception {

		Thread.sleep(3000);
		registration.register(LoadProperties.config.getProperty("firstName"),
				LoadProperties.config.getProperty("lastName"), LoadProperties.config.getProperty("companyName"),
				LoadProperties.config.getProperty("Email"));
		Thread.sleep(3000);
		ExtentReport.test.log(LogStatus.PASS, "submited");

	}
	
	@Test(priority = 2)
	public void SetPassword() {

		registration.VerifyMail(LoadProperties.config.getProperty("Email"), LoadProperties.config.getProperty("EmailPassword"));
		registration.EnterPassword(LoadProperties.config.getProperty("password"));
	}
	
}
