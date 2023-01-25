package demo;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import pomRepository.HomePage;

public class TC_Acti_002 extends BaseClass{
	@Test
	public void addNewCustomer() {
		HomePage Hp=new HomePage(driver);
		Hp.getTaskTab().click();
		Hp.getAddNewButton().click();
		Hp.getAddNewCustomerLink().click();
		Hp.getEnterCustomerNameTextField().sendKeys(ReadData.fromPropertyFile("customername"));
	    Hp.getCreateCustomerButton().click();
		
	}

}
