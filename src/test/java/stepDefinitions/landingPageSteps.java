package stepDefinitions;

import hooks.myHooks;
import io.cucumber.java.en.*;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import pageObjects.landingPage;

import java.io.IOException;

public class landingPageSteps {
    landingPage lp = new landingPage();

    @Given("User navigate to url")
    public void userNavUrl() {
        Assert.assertEquals(lp.getPageTitle(),"Address Manager");
    }

    @When("User enter {string} and {string}")
    public void userEnterCredentials(String username,String password) throws IOException, ParseException {
        lp.enterUserName(username);
        lp.enterPassword(password);

    }

    @Then("User click login")
    public void clkLogin() {
        Assert.assertEquals(lp.clickLogin(),"Address Manager");
    }
    @Then("User redirected to loggedIn Page")
    public void userLoggedIn() throws IOException, ParseException {
        Assert.assertEquals(lp.userLoggedIn(),"View Data");
    }
}
