package starter.stepdefinitions.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Cart.GetASingleCart;


public class GetASingleCartSteps {

    @Steps
    GetASingleCart getASingleCart;

    @Given("I set carts API endpoint with an valid ID to get cart by ID")
    public void setApiGetEndInvalidIdProfile(){
        getASingleCart.setApiGetEndValidCart();
    }

    @When("I send GET request endpoint for get cart by ID")
    public void sendGetRequestInvalidIdProfile(){
        getASingleCart.sendGetRequestValidCart();
    }

    @And("I receive detail a product cart by ID")
    public void receiveAProductCategory(){
        getASingleCart.receiveCart();
    }



}