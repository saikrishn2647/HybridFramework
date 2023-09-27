package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginPageTest extends BaseClass {

	@Test

	public void login_test() {
		try {
			logger.info("****Starting TC_OO1_LoginPageTest****");
			LoginPage lp = new LoginPage(driver);
			logger.info("providing login details");

			lp.setEmail(rb.getString("email"));
			lp.setpwd(rb.getString("password"));
			lp.clicklogbtn();
			logger.info("clicked on loginbutton");

			DashBoardPage dp = new DashBoardPage(driver);
			boolean targetpage = dp.isDashBoardexists();
			Assert.assertEquals(targetpage, true, "Invalid Login Data");
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("****Finished TC_OO1_LoginPageTest****");
	}
}
