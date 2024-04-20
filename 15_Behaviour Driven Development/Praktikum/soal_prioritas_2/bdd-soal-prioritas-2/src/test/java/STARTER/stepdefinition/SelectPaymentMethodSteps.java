package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectPaymentMethodSteps {
    @Given("I am on the checkout page")
    public void onCheckoutPage() {}

    @When("I choose the payment method using DANA")
    public void chooseDANApaymentMethod() {}

    @And("I click \"Pay Now\" button")
    public void clickPayNowButton() {}

    @Then("I was directed to the DANA link to confirm payment")
    public void verifyDirectedToDANALink() {}

    @When("I choose the payment method using Gopay")
    public void chooseGopayPaymentMethod() {}

    @Then("I was directed to the Gopay link to confirm payment")
    public void verifyDirectedToGopayLink() {}

    @When("I choose the payment method using Virgo")
    public void chooseVirgoPaymentMethod() {}

    @Then("I was directed to the Virgo link to confirm payment")
    public void verifyDirectedToVirgoLink() {}
}
