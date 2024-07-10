package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParagonPage {

    WebDriver driver;

    public ParagonPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickProfileIcon(){

        driver.findElement(By.xpath("//div[@class='gray flex items-center ']//*[name()='svg']")).click();
    }
}
