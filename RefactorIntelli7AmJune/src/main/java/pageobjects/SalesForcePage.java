package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SalesForcePage {

    WebDriver driver ;

    public SalesForcePage(WebDriver driver){
        this.driver = driver ;
    }

    public int getResponseCode() throws IOException {

      String hrefValue =  driver.findElement(By.id("forgot_password_link")).getAttribute("href");

      URL linkURL = new URL(hrefValue);
        HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();
        conn.connect();
      int responseCode = conn.getResponseCode();
        System.out.println(responseCode);
        return responseCode;



    }
}
