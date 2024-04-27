package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.AddProductToCart;
import starter.pages.CheckOut;

public class AddProductToCartSteps {
    @Steps
    AddProductToCart addProductToCart;

    @Steps
    CheckOut checkOut;

    @And("I see products description")
    public void seeProductDescription() {
        Assertions.assertTrue(addProductToCart.validationProductDescriptions());
    }

    @And("I click add to cart button")
    public void AddToCartButton(){
        addProductToCart.clickAddToCartButton();
    }

    @And("I click cart button")
    public void clickCartButton(){
        addProductToCart.clickCartButton();
    }

    @Then("I can see my product in cart page")
    public void seeProductInCartPage(){
        Assertions.assertTrue(checkOut.validationOnCartPage());
    }
}
