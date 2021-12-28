package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Loginpage");
	}

	@When("user enters credential")
	public void user_enters_credential() {
		System.out.println("Credential");
	}

	@When("user enters login button")
	public void user_enters_login_button() {
		System.out.println("Button");
	}

	@Then("User navigated to home page")
	public void user_navigated_to_home_page() {
	System.out.println("Homepage");
}

}
