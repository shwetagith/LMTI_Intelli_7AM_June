package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utiles.ReadExcel;

public class AmazonHomePage {

    WebDriver driver ; //null

    public AmazonHomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectValueFromDropdownBasedOnIndex(int index){

        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void enterProduct(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void enterProduct(String sheetName, int row , int colum){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ReadExcel.readData(sheetName,row,colum));
    }

    public void searchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void clickBabyWishList(){

        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        // driver.findElement(By.linkText("Baby Wishlist")).click();
        driver.findElement(By.partialLinkText("by Wishl")).click();

    }

    public void clickAmazonFresh(){

    }


}
