package starter.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set API endpoint to Login")
    public void setApiEndLogin(){
        login.setApiLogin();
    }

    @When("I send request to login and fill valid credential\\(email, password)")
    public void sendLoginRequest() {
        login.sendLoginValid();
    }

    @And("I receive my token")
    public void receiveValidToken(){
        login.receiveValidLogin();
    }

    @When("I send request to login and fill blank credentials")
    public void sendLoginBlankCredential() {
        login.sendLoginBlank();
    }

    @And("I receive error message with empty field")
    public void receiveErrorMessageEmptyField(){
        login.receiveErrorMessageEmpty();
    }

    @When("I send request to login with invalid email")
    public void sendRequestLoginInvalidEmail(){
        login.sendRequestLoginInvalidEmail();
    }

    @Then("I receive error message stating that username or password is incorrect")
    public void receiveErrorMessageInvalidEmail(){
        login.receiveErrorMessageInvalidEmail();
    }

}