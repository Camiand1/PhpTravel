package test;

import logicTest.PhpTravelController;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class PhpTravelTestFireFox {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        driver= new FirefoxDriver(capabilities);
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\camila.gamboa\\IdeaProjects\\PhpTravel Firefox\\src\\main\\drivers\\apache-jmeter-5.2.1");
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/index.php");
        Thread.sleep(1000);
        driver.manage().window().maximize();
    }

    @Test
    public void testHomePhpTravels() throws Exception {
        PhpTravelController homePhp = new PhpTravelController(driver);
        homePhp.toursAsGuest();
    }

    @Test
    public void signUpPhpTravels() throws Exception {
        PhpTravelController signUp = new PhpTravelController(driver);
        signUp.signUpAndBook();

    }

    @Test
    public void signInBookPhpTravels() throws Exception {
        PhpTravelController signInBook = new PhpTravelController(driver);
        signInBook.bookAndSignIn();
    }

    @Test
    public void logInBooking() throws Exception {
        PhpTravelController logInBook = new PhpTravelController(driver);
        logInBook.logInAndBook();
    }
}
