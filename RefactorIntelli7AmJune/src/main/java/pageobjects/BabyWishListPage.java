package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBenifit(){

      //  driver.findElement(By.xpath("//*[normalize-space(text())='Benefits']")).click();
        WebElement element =driver.findElement(By.xpath("//*[normalize-space(text())='Benefits']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()",element);
    }
}
