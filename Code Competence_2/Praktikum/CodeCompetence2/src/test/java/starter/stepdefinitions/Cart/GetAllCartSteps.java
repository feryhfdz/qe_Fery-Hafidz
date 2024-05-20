package starter.stepdefinitions.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Cart.GetAllCart;
import starter.user.StatusCode;

public class GetAllCartSteps {
    @Steps
    GetAllCart getAllCart;

    @Steps
    StatusCode statusCode;

    @Given("I set cart API endpoint for get all cart")
    public void setApiEndProfile(){
        getAllCart.setApiEndGetAllCart();
    }

    @When("I send GET request endpoint for get all cart")
    public void sendUserRequest(){
        getAllCart.sendRequestCart();
    }

    @And("I receive data for all cart")
    public void receiveValidProfile(){
        getAllCart.receiveValidCart();
    }
}