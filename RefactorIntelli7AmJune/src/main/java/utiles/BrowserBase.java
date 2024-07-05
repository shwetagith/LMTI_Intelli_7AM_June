package utiles;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {

    public WebDriver driver;
    public WebDriver getDriver() throws IOException {

        if(driver == null) {
            File file = new File("src/main/resources/configurations/frameworkconfi.properties");
            FileInputStream fis = new FileInputStream(file);
            Properties pro = new Properties();
            pro.load(fis);
            switch (pro.getProperty("browser").toLowerCase()) {
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new InvalidArgumentException("enter valid browser");
            }

            driver.get(pro.getProperty("environment"));
        }

        return driver;
    }
}
