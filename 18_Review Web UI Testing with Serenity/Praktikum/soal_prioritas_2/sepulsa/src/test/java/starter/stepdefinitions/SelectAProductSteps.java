package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePage;
import starter.pages.PulsaPage;

public class SelectAProductSteps {
    @Steps
    HomePage homePage;

    @Steps
    PulsaPage pulsaPage;

    @And("I see all the product service")
    public void seeAllProductService(){
        Assertions.assertTrue(homePage.validateSeeAllProductService());
    }

    @And("I click pulsa product service")
    public void clickPulsaProduct(){
        homePage.clickPulsaProduct();
    }

    @Then("I am on the pulsa page")
    public void inThePulsaPage(){
        Assertions.assertTrue(pulsaPage.validatePulsaPage());}
}
