package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetASingleProduct;


public class GetASingleProductSteps {

    @Steps
    GetASingleProduct getASingleProduct;

    @Given("I set product API endpoint with the desired id")
    public void setApiGetEndInvalidIdProduct(){

        getASingleProduct.setApiGetEndValidIdProduct();
    }

    @When("I send GET request endpoint for get products info by ID")
    public void sendGetRequestInvalidIdProduct(){
        getASingleProduct.sendGetRequestValidIdProduct();
    }

    @And("I receive a product details by ID request")
    public void getAProduct(){
        getASingleProduct.receiveProductDetail();
    }

}