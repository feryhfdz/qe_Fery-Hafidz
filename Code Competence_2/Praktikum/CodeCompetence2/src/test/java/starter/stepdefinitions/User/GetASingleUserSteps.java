package starter.stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.User.GetASingleUser;

public class GetASingleUserSteps {
    @Steps
    GetASingleUser getASingleUser;

    @Given("I set users API endpoint by ID")
    public void setApiMyUserbyID(){
        getASingleUser.setApiMyUserById();
    }

    @When("I send GET request to get user information by ID")
    public void sendUserRequestbyID(){
        getASingleUser.sendRequestMyUserById();
    }

    @And("I receive detail user information by ID")
    public void receiveMyUserbyID(){
        getASingleUser.receiveValidUserById();
    }
}