package Tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utility.DriverActions;
import utility.Log;

public class Login extends BaseTest{
	
	DriverActions driverActions = new DriverActions();
	LoginPage loginPage;
	
	/*
	 * @Optional used pass the optional value if we get null or blank value from xml parameter value
	 */
	@Test
	@Parameters({"browser"})
	public void TC_1_Login(@Optional("check the browserName") String browser) {
		try {
			
			Log.info("Method Name: "+this.getClass().getName() + " Log Message :launch the browser and enter URL");
			driverActions.initializeAndLaunch(browser);
			
			loginPage = new LoginPage(driverActions.getDriver());
			Log.info("Method Name: "+this.getClass().getName() + " Log Message : enter username into Username filed");
			loginPage.enterLoginUsername("manager@xyzrestaurants.com");
			Log.info("Method Name: "+this.getClass().getName() + " Log Message : enter password into password field");
			loginPage.enterLoginPassword("Ecolab@123");
			Log.info("Method Name: "+this.getClass().getName() + " Log Message : click on sign in button");
			loginPage.clickOnSignIn();			
			
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
		}finally {
			driverActions.quit();
		}
		
		
	}
	

}
