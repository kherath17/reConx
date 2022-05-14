package runner;

import envSetup.basePage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(
        plugin={"pretty",
                "json:target/cucumber-reports/Cucumber.json"},
        features = {"src/main/resources"},
        glue = {"stepDefinitions","hooks"}, // Hooks are used here instead of testng so it acts as same , hooks is written inside hooks package and called inside glue
        tags = "@master"

)

public class testRunner extends AbstractTestNGCucumberTests {

    /*
    @BeforeClass
    public void setUppDriver(){
        basePage.setupDriver();
    }
    @AfterClass
    public void tearDown(){
        basePage.tearDown();
    }

     */

}

