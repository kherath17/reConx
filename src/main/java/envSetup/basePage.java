package envSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {
    public static WebDriver driver;
    public static void setupDriver(){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\E-LINE\\Desktop\\GapStars\\conxillium\\src\\main\\resources\\chromeDriver\\chromedriver.exe");
        //driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        //Commented and made return type to void and on classes where this been called can refer to static driver variable
        //return (WebDriverManager) driver;
    }

    public static void tearDown(){
        driver.quit();
    }
}
