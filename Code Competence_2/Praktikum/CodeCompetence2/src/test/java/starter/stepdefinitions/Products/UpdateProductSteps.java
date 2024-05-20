package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.UpdateProduct;


public class UpdateProductSteps {

    @Steps
    UpdateProduct updateProduct;

    @Given("I set product api endpoint for update product")
    public void setApiGetEndInvalidIdProfile(){
        updateProduct.setApiUpdateProduct();
    }

    @When("I send PUT request to update product")
    public void sendGetRequestInvalidIdProfile(){
        updateProduct.sendPUTupdate();
    }

    @And("I receive detail information product")
    public void receiveValidProfile(){
        updateProduct.receiveValidComment();
    }

}