package linkedinpages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedIn_HomePage extends OpentapsWrappers {



	public LinkedIn_SearchPage clickAdvancedSearch(){
		clickById("advanced-search");
		return new LinkedIn_SearchPage();
	}
	
	public LinkedIn_HomePage mouse_hover_profile(){
		mouseOverByXpath("//*[@id='main-site-nav']/ul/li[2]/a");
		return new LinkedIn_HomePage();
	}
	
	public  LinkedIn_EditProfilePage clickEditprofile(){
		
		moveToElementAndClickByLink("Edit Profile");
		return new LinkedIn_EditProfilePage();
	}
}
