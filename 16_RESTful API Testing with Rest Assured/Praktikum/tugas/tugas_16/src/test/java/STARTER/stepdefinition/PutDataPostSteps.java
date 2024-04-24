package STARTER.stepdefinition;

import STARTER.User.PutDataPost;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class PutDataPostSteps {
    @Steps
    PutDataPost putDataPost;

    @Given("I set API endpoint for put data with ID")
    public void setApiEndPoint(){
        putDataPost.setApiEndPoint();
    }

    @When("I send a PUT request to the endpoint with the ID and updated data")
    public void putPostDataUpdate(){
        putDataPost.putPostDataUpdate();
    }

    @And("The post data should be updated successfully")
    public void postDataUpdated(){
        putDataPost.postDataUpdated();
    }

    @When("I send a PUT request to update the post data with that invalid ID")
    public void sendRequestUpdateInvalidID(){
        putDataPost.sendRequestUpdateInvalidID();
    }

    @And("the response body contains an error message Post not found")
    public void receiveErrorMessage(){
        putDataPost.receiveErrorMessage();
    }

}
