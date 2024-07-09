package utiles;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage getAmazonHomePage(){

        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        return amazonHomePage;
    }

    public BabyWishlistBenefitsPage getBabyWishListBenifitPage() {

        BabyWishlistBenefitsPage benefitsPage = new BabyWishlistBenefitsPage(driver);
        return benefitsPage;
    }

    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage wishListPage = new BabyWishListPage(driver);
        return wishListPage;
    }


    public LearnMoreAlertPage getLearnMoreAlertPage(){
        LearnMoreAlertPage alertPage = new LearnMoreAlertPage(driver);
        return alertPage;
    }

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }

    public LearnMoreExplicitWaitPage getExplictPage(){

        LearnMoreExplicitWaitPage explicitWaitPage = new LearnMoreExplicitWaitPage(driver);
        return explicitWaitPage;
    }

    public LearnMoreLoginPage getLearnMoreLoginPage(){

        LearnMoreLoginPage loginPage= new LearnMoreLoginPage(driver);
        return loginPage;
    }





}
