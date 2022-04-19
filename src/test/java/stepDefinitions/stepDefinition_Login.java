
package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition_Login {
	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
       
    }
	@When("^User login into application with username \"([^\"]*)\" and password$")
    public void user_login_into_application_with_username_something_and_password(String strArg1) throws Throwable {
        System.out.print(strArg1);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        
    }

    @And("^Dashbaord is displayed$")
    public void dashbaord_is_displayed() throws Throwable {
        
    }

}
