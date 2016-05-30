package linkedinpages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedIn_LoginPage extends OpentapsWrappers {


	public LinkedIn_LoginPage enterEmailID(String data){
		enterById("login-email", data);
		return new LinkedIn_LoginPage();
	}
	
	public LinkedIn_LoginPage enterPassword(String data){
		enterById("login-password", data);
		return this;
	}
	
	public LinkedIn_HomePage clickSignIn(){
		clickByXpath("//input[@value='Sign in']");
		return new LinkedIn_HomePage();
	}
}
