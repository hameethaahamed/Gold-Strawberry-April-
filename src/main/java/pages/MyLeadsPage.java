package pages;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {

	public CreateLeadPage clickCreateLead(){
	clickByLink("Create Lead");
	return new CreateLeadPage();
}
}
