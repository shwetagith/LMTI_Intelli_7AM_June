package utiles;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.BabyWishListPage;
import pageobjects.BabyWishlistBenefitsPage;
import pageobjects.LearnMoreAlertPage;

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





}
