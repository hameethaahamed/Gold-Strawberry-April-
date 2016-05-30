package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import linkedinpages.*;
import wrappers.OpentapsWrappers;

public class Search_Company_Count extends OpentapsWrappers{

	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="LinkedIn_Company_Count";
		testCaseName="Linked in Company count";
		testDescription="Linked in Company count(Positive)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String emailid,String password,String keyword, String companyname) throws InterruptedException{
		
		new LinkedIn_LoginPage()
		.enterEmailID(emailid)
		.enterPassword(password)
		.clickSignIn()
		.clickAdvancedSearch()
		.enterKeyword(keyword)
		.enterCompany(companyname)
		.clickSearch()
		.VerifyCompanyCount();
	
	}
	
}
