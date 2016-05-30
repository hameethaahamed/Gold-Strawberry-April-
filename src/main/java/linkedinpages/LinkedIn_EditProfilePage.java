package linkedinpages;

import wrappers.OpentapsWrappers;

public class LinkedIn_EditProfilePage extends OpentapsWrappers {

	public LinkedIn_EditProfilePage clickAddSkill(){
		clickByLink("Add skill");
		return new LinkedIn_EditProfilePage();
	}
	
	public LinkedIn_EditProfilePage enterNewSkill(String data) throws InterruptedException{
		enterById("edit-skills-add-ta", data);
		Thread.sleep(2000);
		return this;
	}
	
	public LinkedIn_EditProfilePage clickAdd(){
		clickByXpath("//*[@id='edit-skills-add-btn']");
		return this;
	}
	
	public LinkedIn_EditProfilePage clickSave() throws InterruptedException{
		Thread.sleep(3000);
		clickByXpath("//*[@id='skills-editor-form']/p/input");
		return this;
	}
	
	public LinkedIn_EditProfilePage verifyAddSkill(String data) throws InterruptedException{
		Thread.sleep(3000);
		verifyTextDisplayed("//*[text()='"+data+"']");
		return this;
	}
}
