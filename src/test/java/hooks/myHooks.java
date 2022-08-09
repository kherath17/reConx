package hooks;

import envSetup.basePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;


public class myHooks {
    //Hooks

    @Before
    public void setUppDriver(){
        basePage.setupDriver();
    }
    @After()
    public void tearDown(){
        basePage.tearDown();
    }


    @AfterStep()
    public void takeSnapShot() throws IOException {
        WebDriver driver= basePage.driver;
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("C:\\Users\\E-LINE\\Desktop\\Learning\\WebAutomation\\ElementScreenshot.jpg"));
    }
}
