package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class LearnMoreLoginPage {

    WebDriver driver;
    String parentProp;

    public LearnMoreLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LearnMoreLoginPage enterUserName(){

        driver.findElement(By.id("username")).sendKeys("LearnMore");
        return this;
    }

    public LearnMoreLoginPage enterPassword(){

        driver.findElement(By.cssSelector("#password")).sendKeys("learnmore@123");
        return this;
    }

    public LearnMoreLoginPage clickLogin(){
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        return this;
    }

    public String switchToChildWindow(){

         parentProp = driver.getWindowHandle();
       Set<String> s =driver.getWindowHandles();
       Iterator<String > iterator = s.iterator();
        iterator.next();
       String childwind =  iterator.next();

        driver.switchTo().window(childwind);

      return  driver.getTitle();
    }

    public void switchBackToParent(){

        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
    }
}
