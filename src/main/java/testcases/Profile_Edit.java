package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import linkedinpages.LinkedIn_LoginPage;
import wrappers.OpentapsWrappers;

public class Profile_Edit extends OpentapsWrappers{

	@BeforeClass
	public void setData(){
		browserName="firefox";
		dataSheetName="Edit_Profile";
		testCaseName="Editing Profile in LikedIn";
		testDescription="Editing Profile in LikedIn(Positive)";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String emailid,String password,String skill) throws InterruptedException{
		
		new LinkedIn_LoginPage()
		.enterEmailID(emailid)
		.enterPassword(password)
		.clickSignIn()
		.mouse_hover_profile()
		.clickEditprofile()
		.clickAddSkill()
		
		.enterNewSkill(skill)
		.clickAdd()
		.clickSave()
		.verifyAddSkill(skill);
	}
	
}
