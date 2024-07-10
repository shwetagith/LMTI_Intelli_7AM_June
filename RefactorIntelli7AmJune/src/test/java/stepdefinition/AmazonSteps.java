package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utiles.TestContext;

public class AmazonSteps {

    TestContext context;

    public AmazonSteps(TestContext context){
        this.context =context;
    }

    @Given("user enters the product name and click on baby wishlist page")
    public void homePage(){
      context.pageObjectManager.getAmazonHomePage().clickBabyWishList();
    }

    @When("user clicks on benefits")
    public void userClicksOnBenefits() {

        context.pageObjectManager.getBabyWishListPage().clickBenifit();
    }

    @Then("user verify the Baby wishlist Benefits page")
    public void userVerifyTheBabyWishlistBenefitsPage() {

        context.pageObjectManager.getBabyWishListBenifitPage().getBabyWishListBenefitsTitle();

    }

    @Given("user enters the product name")
    public void userEntersTheProductName() {
    context.pageObjectManager.getAmazonHomePage().enterProduct("xyz",0,0);


    }
}
