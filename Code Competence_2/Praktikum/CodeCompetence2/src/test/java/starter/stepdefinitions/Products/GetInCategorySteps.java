package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetInCategory;

public class GetInCategorySteps {

    @Steps
    GetInCategory getInCategory;

    @Given("I set category API endpoint for get in category")
    public void setApiInCategory() {
        getInCategory.setApiCategory();
    }

    @When("I send GET request endpoint for get in category")
    public void sendGetInCategory() {
        getInCategory.sendInCategory();
    }

    @And("I receive detail information by category")
    public void receiveValidDataForInCategory() {
        getInCategory.receiveValidDataForCategory();
    }
}