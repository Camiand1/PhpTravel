package test;

import logicTest.PhpTravelController;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PhpTravelTestChrome {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
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
