package pages;

public class EditLeadsPage {

	public EditLeadsPage selectSource(){
		
		 return new	EditLeadsPage();
	}
	public EditLeadsPage clickOnAdd(String data){
		
		return this;
	}
	public EditLeadsPage selectMarketingCampaign(String data){
		
		return  this;
	}
	public ViewLeadsPage clickOnUpdateButton(){
		
		return new ViewLeadsPage();
	}
}