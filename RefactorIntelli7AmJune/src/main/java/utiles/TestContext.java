package utiles;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

   public BrowserBase browserBase;
   public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        browserBase = new BrowserBase();
        pageObjectManager = new PageObjectManager(browserBase.getDriver());
    }
}
