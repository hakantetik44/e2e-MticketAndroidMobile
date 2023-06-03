package stepdefinitions;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {

    private AppiumDriverLocalService appiumServer = AppiumDriverLocalService.buildDefaultService();
    final Runtime runtime = Runtime.getRuntime();
    @Before
    public void setUp(){
        //it starts appium server

        appiumServer.start();

    }
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }



    }
}