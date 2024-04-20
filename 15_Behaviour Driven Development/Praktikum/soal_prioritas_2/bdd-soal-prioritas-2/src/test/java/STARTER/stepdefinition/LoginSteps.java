package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void onLoginPage() {}

    @When("I enter my valid username and password")
    public void enterValidCredentials() {}

    @And("I click \"Sign In\" button")
    public void clickSignInButton() {}

    @Then("I should be directed to the HomePage")
    public void verifyHomePageAccess() {}

    @When("I enters an invalid username or password")
    public void enterInvalidCredentials() {}

    @Then("an error message should be displayed")
    public void verifyErrorMessage() {}

    @When("I click the \"Forgot Password?\" link")
    public void clickForgotPasswordLink() {}

    @And("I enter my registered email address")
    public void enterRegisteredEmail() {}

    @And("I click \"Send\" button")
    public void clickSendButton() {}

    @Then("I should receive a password reset email with instructions")
    public void verifyPasswordResetEmailSent() {}

}
