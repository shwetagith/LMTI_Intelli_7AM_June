package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utiles.TestContext;

public class LearnMoreSteps {

    TestContext context;
    String confirmationMessageText;

    public LearnMoreSteps(TestContext context){

        this.context = context;
    }

    @Given("user clicks on the confirmation box")
    public void clickConfirmationBox(){
        context.pageObjectManager.getLearnMoreAlertPage().clickConfirmationBox();
    }

    @When("user get the confirmation message text and click the cancel button")
    public void userGetTheConfirmationMessageTextAndClickTheCancelButton() {
       confirmationMessageText=  context.pageObjectManager.getLearnMoreAlertPage().getConfirmationMessageText();
        context.pageObjectManager.getLearnMoreAlertPage().clickCancelButton();
    }

    @Then("validate the confirmation and UI text")
    public void validateTheConfirmationAndUIText() {

        Assert.assertEquals("Press a Button !",confirmationMessageText);
        Assert.assertEquals("You Pressed Cancel", context.pageObjectManager.getLearnMoreAlertPage().getconfirmBoxUiText());

    }

    @Then("user compares the table value")
    public void userComparesTheTableValue() {


        Assert.assertEquals("16.44%",context.pageObjectManager.getWikiPage().getShareHoldingHolderValue().get("Public"));

        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getShareHolderValue().get(3));
        Assert.assertEquals("16.44%",context.pageObjectManager.getWikiPage().getShareHoldingValue().get(3));

    }

    @Given("user clicks on change to text button")
    public void userClicksOnChangeToTextButton() {
        context.pageObjectManager.getExplictPage().clickChangeTextButton();
    }

    @Then("user verify the text in UI")
    public void userVerifyTheTextInUI() {
        context.pageObjectManager.getExplictPage().getLearnMoreAspirantsText();
    }

    @Given("user enters the credi and navigate to homepage")
    public void userEntersTheCrediAndNavigateToHomepage() {

       context.pageObjectManager.getLearnMoreLoginPage().enterUserName().enterPassword().clickLogin();


    }

    @Then("verify the navigation")
    public void verifyTheNavigation() {
        Assert.assertEquals("Event Management",context.pageObjectManager.getLearnMoreLoginPage().switchToChildWindow());
        context.pageObjectManager.getLearnMoreLoginPage().switchBackToParent();
    }
}
