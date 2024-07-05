package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utiles.TestContext;

public class WikiSteps {

    TestContext testContext;

    public WikiSteps(TestContext testContext){
        this.testContext = testContext;
    }

    @Given("user extract the shareholders and shareholding values")
    public void shareHolding(){

        testContext.pageObjectManager.getWikiPage().getShareHolderValue();
        testContext.pageObjectManager.getWikiPage().getShareHoldingValue();
    }

    @Then("user compares the table value")
    public void userComparesTheTableValue() {

        Assert.assertEquals("Public",testContext.pageObjectManager.getWikiPage().getShareHolderValue().get(3));
        Assert.assertEquals("16.44",testContext.pageObjectManager.getWikiPage().getShareHoldingValue().get(3));
    }
}
