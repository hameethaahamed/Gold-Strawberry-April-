package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_CreateLead extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC003";
		testCaseName="Login";
		testDescription="Login to Opentaps(Positive)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password,String companyname, String firstname, String lastname){
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.crmsfaClick()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLeadButton()
		.verifyFirstName(firstname);

	}
	
	
	
	
	
	
	
	
	
	
}
