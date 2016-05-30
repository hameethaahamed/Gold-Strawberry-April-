package pages;

import wrappers.OpentapsWrappers;

public class ViewLeadsPage extends OpentapsWrappers{
	
	public ViewLeadsPage verifyFirstName(String text){
		verifyTextByXpath("(//span[@class='tabletext'])[4]",text);
		return new ViewLeadsPage();
	}
	
}
