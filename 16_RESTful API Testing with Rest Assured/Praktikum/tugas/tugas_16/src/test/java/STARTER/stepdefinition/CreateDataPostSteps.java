package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import STARTER.User.CreateDataPost;

public class CreateDataPostSteps {
    @Steps
    CreateDataPost createDataPost;

    @Given("I set API endpoint for create a post data")
    public void setApiEndPoint(){
        createDataPost.setApiEndPoint();
    }

    @When("I send a request to create a post data")
    public void sendPostRequest(){
        createDataPost.sendPostRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201(){
        createDataPost.receiveStatusCode201();
    }

    @And("I receive valid data for created post data")
    public void receiveCreatedPostData(){
        createDataPost.receiveCreatedPostData();
    }

    @When("I send a request to create a post data with unrecognized additional parameter")
    public void sendUnrecognizedParameter(){
        createDataPost.sendUnrecognizedParameter();
    }

    @Then("the response body should contain an error message that mentions the unrecognized parameter")
    public void receiveValidParameter(){
        createDataPost.receiveValidParameter();
    }
}
