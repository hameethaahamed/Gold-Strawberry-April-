package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers {

	public HomePage(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not HomePage","FAIL");
		}
	}
		
		public HomePage verifyWelcome(String data){
			
			verifyTextContainsByXpath("//*[@id='form']/h2",data);
			return this;
		}
		
		public CrmHomePage crmsfaClick(){
			clickByXpath("//*[@id='button']/a/img");
			return new CrmHomePage();
		}
		
		public LoginPage clickLogoutButton(){

			clickByClassName("decorativeSubmit");
			return new LoginPage();

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

