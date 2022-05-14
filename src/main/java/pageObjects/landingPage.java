package pageObjects;

import envSetup.basePage;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class landingPage extends basePage {
    //should initialize to teh variable within
    WebDriver driver= basePage.driver;


    public String getPageTitle(){
        driver.get("https://conxillium.github.io/AddressManager/login");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        return title;
    }
    public void enterUserName(String user) throws IOException, ParseException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);

    }

    public void enterPassword(String password) throws IOException, ParseException {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public String clickLogin(){
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        //driver.switchTo().alert().accept();
        String title = driver.getTitle();
        return title;
    }
    public String userLoggedIn() throws IOException, ParseException {
        String loggedIn = driver.findElement(By.xpath("//h2[@class='display-3']")).getText();
        return loggedIn;
    }
}
