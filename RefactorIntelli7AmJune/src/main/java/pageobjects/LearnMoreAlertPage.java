package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {

    WebDriver driver;

    public LearnMoreAlertPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickAlertBox(){

    }

    public void clickConfirmationBox(){

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }

    public String getConfirmationMessageText(){

       return driver.switchTo().alert().getText();
    }

    public void clickCancelButton(){

        driver.switchTo().alert().dismiss();
    }

    public void clickOkButton(){

        driver.switchTo().alert().accept();
    }

    public String getconfirmBoxUiText(){

      String val=  driver.findElement(By.cssSelector("#demo")).getText();
      return val;
    }

}
