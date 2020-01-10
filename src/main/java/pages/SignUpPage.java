package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;
    private By firstNameBox = By.name("firstname");
    private By lastNameBox = By.name("lastname");
    private By phoneBox = By.name("phone");
    private By emailBox = By.name("email");
    private By passwordBox = By.name("password");
    private By confirmPasswordBox = By.name("confirmpassword");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signInMyAccount() {
        driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@class='btn btn-text-inherit btn-interactive' and @id='dropdownCurrency']")).click();
        driver.findElement(By.linkText("Sign Up")).click();
    }
    public void firstName(String firstName){
        driver.findElement(firstNameBox).click();
        driver.findElement(firstNameBox).sendKeys(firstName);
    }
    public void lastName(String lastName){
        driver.findElement(lastNameBox).click();
        driver.findElement(lastNameBox).sendKeys(lastName);
    }
    public void phone(String phone){
        driver.findElement(phoneBox).click();
        driver.findElement(phoneBox).sendKeys(phone);
    }
    public void signUpWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 250)");
    }
    public void email(String email){
        driver.findElement(emailBox).click();
        driver.findElement(emailBox).sendKeys(email);
    }
    public void password(String password){
        driver.findElement(passwordBox).click();
        driver.findElement(passwordBox).sendKeys(password);
    }
    public void confirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordBox).click();
        driver.findElement(confirmPasswordBox).sendKeys(confirmPassword);
    }
    public void signUpButton(){
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm Password'])[1]/following::button[1]")).click();
    }
}
