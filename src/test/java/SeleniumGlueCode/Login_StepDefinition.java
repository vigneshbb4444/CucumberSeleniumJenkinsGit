package SeleniumGlueCode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition {

	
	@Given("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Login page");
		
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters details");
		
	}

	@Then("^verify gmail page is displayed$")
	public void verify_gmail_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify gmail");
		
	}


}
