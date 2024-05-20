package starter.stepdefinitions.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Cart.AddNewCart;

public class AddNewCartSteps {

    @Steps
    AddNewCart addNewCart;

    @Given("I set cart API endpoint for create new cart")
    public void setApiNewCart() {
        addNewCart.setApiNewCart();
    }


    @When("I send POST request endpoint for create new cart")
    public void sendRequestNewCart() {
        addNewCart.sendNewCreateCart();
    }

    @And("I receive request body input data added successfully")
    public void receiveValidCart() {
        addNewCart.receiveValidDataForCreateNewCart();
    }
}