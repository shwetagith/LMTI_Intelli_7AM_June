package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage {

    WebDriver driver;

    public AmazonSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectProductFromSearchResult(int index){

        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']")).click();
    }

    public void selectFromDropdownValue(String cityAbrevation){

        driver.findElement(By.xpath("//a[@value='"+cityAbrevation+"']")).click();
    }

    public void getCellValue(int rowIndex , int columnIndex){
        driver.findElement(By.xpath("//table[@class='wikitable']/child::tbody/child::tr["+rowIndex+"]/child::td["+columnIndex+"]")).getText();
    }
}
