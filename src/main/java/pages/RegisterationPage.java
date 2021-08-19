package pages;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
public class RegisterationPage extends PageBase {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		jse =  (JavascriptExecutor)driver;
		action =new Actions(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")
	WebElement genderRdoBtn ; 

	@FindBy(name = "firstname")
	WebElement fnTxtBox; 

	@FindBy(name="lastname")
	WebElement lnTxtBox ; 

	@FindBy(id="dob")
	WebElement bdateTxtBox ; 


	@FindBy(name ="email_address")
	WebElement  emailTxtBox; 

	@FindBy(name ="company")
	WebElement companyTxtBox ; 

	@FindBy(name ="street_address")
	WebElement saTxtBox ;

	@FindBy(name ="suburb")
	WebElement suburbTxtBox ;

	@FindBy(name ="postcode")
	WebElement postcodeTxtBox ;

	@FindBy(name ="city")
	WebElement cityTxtBox ;

	@FindBy(name ="state")
	WebElement stateTxtBox ;

	@FindBy(name ="country")
	WebElement countryDropDown ;

	@FindBy(name ="telephone")
	WebElement telephoneTxtBox ;

	@FindBy(name ="fax")
	WebElement faxTxtBox ;

	@FindBy(name ="password")
	WebElement passwordTxtBox ;

	@FindBy(name ="confirmation")
	WebElement confirmPasswordTxtBox ;

	@FindBy(id  = "tdb4")
	WebElement continueButton ;

	@FindBy(id = "tdb4")
	WebElement logOutButton ;
	
	@FindBy(css="div.result")
	public WebElement successRegisterMessage ; 
	
	@FindBy(xpath ="/html/body/div[1]/div[3]/h1")
	public WebElement successLogoutMessage ; 
	
	public void selectOptions() {
		Select  select = new Select(countryDropDown);
		select.selectByVisibleText("Egypt");
	}

	public void userRegistration(String firstName , String lastName ,String birthdate, String email,String compny,String street ,String subrub,String postcode,String city,String state,String telephone ,String password) 
	{
		clickButton(genderRdoBtn);
		setTextElementText(fnTxtBox, firstName);
		setTextElementText(lnTxtBox, lastName);
		setTextElementText(bdateTxtBox, birthdate);
		setTextElementText(emailTxtBox, email);
		setTextElementText(companyTxtBox, compny);
		setTextElementText(saTxtBox, street);

		setTextElementText(suburbTxtBox, subrub);
		setTextElementText(postcodeTxtBox, postcode);
		setTextElementText(cityTxtBox, city);
		setTextElementText(stateTxtBox, state);
		scrollToBottom();
		selectOptions();
		setTextElementText(telephoneTxtBox, telephone);
		setTextElementText(confirmPasswordTxtBox, password);

		setTextElementText(passwordTxtBox, password);
		clickButton(continueButton);
		scrollToBottom();
		setTextElementText(confirmPasswordTxtBox, password);

		setTextElementText(passwordTxtBox, password);
		clickButton(continueButton);

	}
	
	public void userLogout() 
	{
		clickButton(logOutButton);

	}


}
