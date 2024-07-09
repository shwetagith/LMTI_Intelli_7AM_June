package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LearnMoreExplicitWaitPage {

    WebDriver driver;

    public LearnMoreExplicitWaitPage(WebDriver driver) {
    this.driver = driver;
    }

    public void clickChangeTextButton(){

        driver.findElement(By.cssSelector("#quote")).click();
    }

    public String getLearnMoreAspirantsText()  {

        String value = null ;
        try{
            value=driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }
        catch(NoSuchElementException e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.pollingEvery(Duration.ofSeconds(5));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
            wait.ignoring(NoSuchElementException.class);
            value= driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }
        catch (InvalidArgumentException e){

        }

     return value;

    }


}
