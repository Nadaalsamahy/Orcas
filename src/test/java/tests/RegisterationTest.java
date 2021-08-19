package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterationPage;

public class RegisterationTest extends TestBase {

	
	RegisterationPage registerObject;
	String FirstName = "Nada";
	String LastName = "Talaat"	;
	String DB ="05/21/1970";	
	String mail = "NadaTalaat18@gmail.com";
	String company ="NTG";
	String Street ="fayed22";
	String Suburb = "Ahmed Fayed 22";
	String postCode="19955";
	String City = "cairo";
	String State ="fayed 21";
	String telephone ="4080130";		
	String password ="123456789AabcD";
	
	@Test(priority=1,alwaysRun=true)
	
	public void UserCanRegisterSuccssfully() {
		registerObject = new RegisterationPage(driver); 
		registerObject.userRegistration(FirstName, LastName,DB , mail, company, Street, Suburb, postCode, City, State, telephone, password);
		//Assert.assertTrue(registerObject.successRegisterMessage.getText().contains("Your Account Has Been Created"));
	}
	

	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
		//Assert.assertTrue(registerObject.successLogoutMessage.getText().contains("Log off"));
	}


}

