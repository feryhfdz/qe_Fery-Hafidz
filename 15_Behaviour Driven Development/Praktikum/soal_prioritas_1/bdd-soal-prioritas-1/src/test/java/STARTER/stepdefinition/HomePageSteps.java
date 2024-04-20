package STARTER.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    @Given("I am on the LinkedIn homepage")
    public void onLinkedInHomePage() {}

    @When("I click on the \"Start a post\" field")
    public void clickStartAPostField() {}

    @And("I enter text content for my post")
    public void enterPostTextContent() {}

    @When("I click the \"Post\" button")
    public void clickPostButton() {}

    @Then("My text post is successfully published on my LinkedIn feed")
    public void verifyPostPublished() {}

    @When("I click the \"X\" button")
    public void clickDiscardButton() {}

    @Then("A confirmation dialog appears asking me to confirm discarding the post or save as draft")
    public void verifyDiscardConfirmationDialog() {}

    @When("I confirm discarding the post")
    public void confirmDiscardPost() {}

    @Then("The post creation process is cancelled")
    public void verifyPostCreationCancelled() {}

    @And("I am returned to the LinkedIn homepage without the post being published")
    public void verifyReturnedToHomePage() {}
}
