package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SignInBookPage {
    private WebDriver driver;
    private By emailBox = By.id("username");
    private By passwordBox = By.id("password");

    public SignInBookPage(WebDriver driver) {
        this.driver = driver;
    }
    public void signInCategory(){
        driver.findElement(By.id("signintab")).click();
    }
    public void signInWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 250)");
    }
    public void emailSignIn(String emailSignIn){
        driver.findElement(emailBox).click();
        driver.findElement(emailBox).sendKeys(emailSignIn);
    }
    public void passwordSignIn(String passwordSignIn){
        driver.findElement(passwordBox).click();
        driver.findElement(passwordBox).sendKeys(passwordSignIn);
    }
    public void signInBookWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(250, 1600)");
    }
    public void confirmBooking(){
        driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[9]/button")).click();
    }
}
