package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBenifit(){

        driver.findElement(By.xpath("//*[normalize-space(text())='Benefits']")).click();
    }
}
