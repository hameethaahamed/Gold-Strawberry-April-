package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_Login extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC001";
		testCaseName="Login";
		testDescription="Login to Opentaps(Positive)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String user){
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyWelcome(user)
		.clickLogoutButton();
		
	}
	
	
	
	
	
	
	
	
	
	
}
