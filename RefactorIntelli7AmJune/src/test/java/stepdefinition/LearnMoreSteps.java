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
}
