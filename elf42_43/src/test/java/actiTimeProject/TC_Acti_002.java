package actiTimeProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import pomRepository.HomePage;

public class TC_Acti_002 extends BaseClass{
	@Test
	public void addNewCustomer() {
		HomePage Hp=new HomePage(driver);
		Hp.getTaskTab().click();
		Reporter.log("Successfully Clicked on Task Tab",true);
		
		Hp.getAddNewButton().click();
		Reporter.log("Successfully Clicked on ADD NEW Button",true);
		
		Hp.getAddNewCustomerLink().click();
		Reporter.log("Successfully Clicked On ADD NEW CUSTOMER link",true);
		
		Hp.getEnterCustomerNameTextField().sendKeys(ReadData.fromPropertyFile("customername"));
	    Hp.getCreateCustomerButton().click();
	    Reporter.log("Successfully Clicked On Create Customer Button",true);
	    Reporter.log("New Customer Is Created",true);
		
	}

}
