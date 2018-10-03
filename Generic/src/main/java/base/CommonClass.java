package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CommonClass {
    public static WebDriver driver = null;
    public static Actions builder = null;
    public static WebDriverWait wait = null ;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","/Users/afia/IdeaProjects/GroupBlueFrameWork/Generic/DriversForBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        builder = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");

        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void end(){
        driver.close();
    }
}
