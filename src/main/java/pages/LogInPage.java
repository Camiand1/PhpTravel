package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;
    private By useaNameBox = By.name("username");
    private By passwordBox = By.name("password");


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void logInMyAccount(){
        driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@class='btn btn-text-inherit btn-interactive' and @id='dropdownCurrency']")).click();
        driver.findElement(By.linkText("Login")).click();
    }
    public void userName(String userName){
        driver.findElement(useaNameBox).click();
        driver.findElement(useaNameBox).sendKeys(userName);
    }
    public void password(String password){
        driver.findElement(passwordBox).click();
        driver.findElement(passwordBox).sendKeys(password);
    }
    public void logInButton(){
        driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
    }

}
