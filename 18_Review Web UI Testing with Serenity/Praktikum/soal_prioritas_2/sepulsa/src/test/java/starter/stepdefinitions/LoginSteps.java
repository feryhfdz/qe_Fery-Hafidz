package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the landing page")
    public void onTheLandingPage(){
        loginPage.openUrl("https://www.sepulsa.com/");
        Assertions.assertTrue(loginPage.validationOnLandingPage());
    }

    @When("I click sign in button on the landing page")
    public void clickSignInButton(){
        loginPage.clickSignInButtonHome();
    }

    @And("I am on the login page")
    public void onTheLoginPage(){
        Assertions.assertTrue(loginPage.validationOnLoginPage());
    }

    @And("I input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("skaha578562@gmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Fery12yog@");
    }

    @And("I input invalid email")
    public void inputInValidEmail(){
        loginPage.inputEmail("SALAHHHHH");
    }

    @And("I input invalid password")
    public void inputInValidPassword(){
        loginPage.inputPassword("salah@gmail.com");
    }

    @And("I click sign in button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @And("I see loading system")
    public void seeLoadingSystem(){
        Assertions.assertTrue(loginPage.validateLoadSystem());
    }

    @Then("I switched to the home page and I saw a successful login confirmation message")
    public void seeConfirmationSuccessLogin(){
        Assertions.assertTrue(homePage.validateOnHomePage());
    }

    @Then("I can a error message {string}")
    public void validateErrorMessageIsDisplayed(String message){
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validationEqualErrorMessage(message));
    }
}
