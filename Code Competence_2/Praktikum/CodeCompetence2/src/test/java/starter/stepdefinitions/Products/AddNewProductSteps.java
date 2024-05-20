package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.AddNewProduct;

public class AddNewProductSteps {

    @Steps
    AddNewProduct addNewProduct;

    @Given("I set product API endpoint for create new product")
    public void setApiNewUser() {
        addNewProduct.setApiNewProduct();
    }

    @When("I send POST request for create a new product with valid credentials")
    public void receiveValidDataForCreateNewUser() {
        addNewProduct.sendCreateProductRequest();
    }

    @And("I receive The product that has been created has been successfully added with a customized ID number")
    public void sendCreateUserRequest() {
        addNewProduct.receiveValidDataForCreateNewProduct();
    }
}