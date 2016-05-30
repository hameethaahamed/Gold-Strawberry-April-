package pages;

import wrappers.OpentapsWrappers;

public class CrmHomePage extends OpentapsWrappers{

	
	public MyLeadsPage clickLead(){
		clickByLink("Leads");
		return new MyLeadsPage();
	}
}
