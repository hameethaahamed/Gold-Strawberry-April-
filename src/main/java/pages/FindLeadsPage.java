package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
  
	public FindLeadsPage(){
	if(!verifyTitle("Find Leads | oepntaps CRM") ){
		Reporter.reportStep("Landed in Wrong Page.This is not LoginPage","FAIL");
		}
	}
	public FindLeadsPage enterLeadId(String data){
		enterByXpath("//input[@name='id']"), data);
		 return new	FindLeadsPage();
	}
	public FindLeadsPage clickFindLeadsButton(){
		
		return new FindLeadsPage();
	}
	public ViewLeadsPage clickLeadID(String data){
		
		return  new ViewLeadsPage();
	}
	
}
