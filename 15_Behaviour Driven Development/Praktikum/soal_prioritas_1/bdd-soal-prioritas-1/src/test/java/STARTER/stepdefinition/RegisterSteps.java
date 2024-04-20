package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @Given("I am on the LinkedIn registration page")
    public void onLinkedInRegistrationPage() {}

    @When("I enters all required registration information")
    public void enterRegistrationInfo() {}

    @And("I clicks the \"Join Now\" button")
    public void clickJoinNowButton() {}

    @Then("I LinkedIn account is successfully created")
    public void accountCreatedSuccessfully() {}

    @When("I enters registration information with an already registered email address")
    public void enterInfoWithUsedEmail() {}

    @Then("I should see the system displays an error message stating that the email address is already in use")
    public void verifyErrorMessage() {}
}
