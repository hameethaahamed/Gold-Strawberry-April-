package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_Login extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC002";
		testCaseName="Login";
		testDescription="Login to Opentaps(Negative)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String user){
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButtonForFailure()
		.verifyErrorMessage(user);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
