package linkedinpages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedIn_SearchPage extends OpentapsWrappers {


		
	public LinkedIn_SearchPage enterKeyword(String data){
		enterById("advs-keywords", data);
		return new LinkedIn_SearchPage();
	}
	
	public LinkedIn_SearchPage enterCompany(String data){
		enterById("advs-company", data);
		return this;
	}
	
	public LinkedIn_SearchPage clickSearch(){
		clickByXpath("//input[@class='submit-advs']");
		return this;
	}
	
	public LinkedIn_SearchPage VerifyCompanyCount() throws InterruptedException{
		Thread.sleep(3000);
		String comp_count=getTextByXpath("//div[@class='search-info']/p/strong");
		System.out.println(comp_count);
		return this;
	}

}
