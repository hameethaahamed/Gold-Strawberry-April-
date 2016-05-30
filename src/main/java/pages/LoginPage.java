package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers {

	public LoginPage(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not LoginPage","FAIL");
		}
	}

	public LoginPage enterUsername(String data){

		enterById("username",data);
		return this;
	}

	public LoginPage enterPassword(String data){
		enterById("password",data);
		return this;
	}

	public HomePage clickLoginButton(){

		clickByClassName("decorativeSubmit");
		return new HomePage();

	}
	
	public LoginPage verifyErrorMessage(String data){
		verifyTextContainsByXpath("//*[@id='errorDiv']/p[2]",data);
		return this;
	}
	
	public LoginPage clickLoginButtonForFailure(){

		clickByClassName("decorativeSubmit");
		return this;

	}
	
	
	




}
