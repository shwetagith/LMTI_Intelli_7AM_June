package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishlistBenefitsPage {

    WebDriver driver;

    public BabyWishlistBenefitsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBabyWishListBenefitsTitle(){

      return  driver.findElement(By.xpath("//h1[@class='a-size-extra-large br-ob-title-text']")).getText();

    }
}
