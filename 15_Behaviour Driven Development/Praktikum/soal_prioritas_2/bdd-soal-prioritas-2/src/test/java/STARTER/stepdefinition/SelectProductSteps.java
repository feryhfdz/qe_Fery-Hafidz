package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectProductSteps {
    @Given("I am on the home page")
    public void onHomePage() {}

    @When("I select the \"Pulsa\" product")
    public void selectPulsaProduct() {}

    @Then("I will see the display to fill in the telephone number and desired pulsa amount")
    public void verifyPhoneAndAmountInput() {}

    @When("I select the \"Voucher Game\" product")
    public void selectVoucherGameProduct() {}

    @Then("I will see the display of various game voucher options and game top ups")
    public void verifyGameVoucherOptions() {}

    @When("I select the \"other product\" product")
    public void selectOtherProduct() {}

    @Then("I should see all sepulsa's products")
    public void verifyAllSepulsaProducts() {}
}
