package starter.stepdefinitions.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Cart.UpdateCart;


public class UpdateCartSteps {

    @Steps
    UpdateCart updateCart;

    @Given("I set carts API endpoint for update cart")
    public void setApiGetEndValidIdProfile(){
        updateCart.setApiUpdateCart();
    }

    @When("I send PUT request to update cart")
    public void sendGetRequestValidIdProfile(){
        updateCart.sendPutRequestUpdateCart();
    }

    @And("I should get the data cart that I updated")
    public void ReceiveDataUpdated(){
        updateCart.receiveDataCartUpdated();
    }
}