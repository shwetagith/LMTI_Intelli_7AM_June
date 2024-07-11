package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utiles.TestContext;

public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @Before()
    public void setUp(){
        System.out.println("Execution Begins............");
    }

    @AfterStep()
    public void captureScreenshot(Scenario sc){
        TakesScreenshot screenshot = (TakesScreenshot)context.browserBase.getDriver();
       byte[] byteData = screenshot.getScreenshotAs(OutputType.BYTES);
       sc.attach(byteData,"image/png",sc.getName());

    }

    @After()
    public void closeBrowser(){
        context.browserBase.getDriver().quit();
    }
}
