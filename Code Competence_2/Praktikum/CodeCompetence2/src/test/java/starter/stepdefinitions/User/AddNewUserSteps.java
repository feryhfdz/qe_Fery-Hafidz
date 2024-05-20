package starter.stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.User.AddNewUser;

public class AddNewUserSteps {
    @Steps
    AddNewUser addNewUser;

    @Given("I set users API endpoint")
    public void setApiUser(){
        addNewUser.setApiNewUser();
    }

    @When("I send POST request endpoint for create new user")
    public void sendRequestUser(){
        addNewUser.sendCreateUser();
    }

    @And("I receive valid data for my user")
    public void receiveUserData(){
        addNewUser.receiveValidDataForNewUser();
    }

}