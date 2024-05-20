package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetAllCategories;

public class GetAllCategoriesSteps {

    @Steps
    GetAllCategories getAllCategories;

    @Given("I set categories API endpoint for get all categories")
    public void setApiAllCategories() {
        getAllCategories.setApiCategories();
    }

    @When("I send GET request body for get all categories")
    public void sendCategories() {
        getAllCategories.sendCategories();
    }

    @And("I receive data for all categories")
    public void receiveCategories() {
        getAllCategories.receiveValidDataForAllCategories();
    }
}