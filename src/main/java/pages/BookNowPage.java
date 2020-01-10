package pages;

import org.openqa.selenium.*;

public class BookNowPage {
    private WebDriver driver;
    private By firstNameBox = By.xpath("//*[@id=\"guestform\"]/div[1]/div[1]/div/input");
    private By lastNameBox = By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input");
    private By emailBox = By.xpath("//*[@id=\"guestform\"]/div[2]/div[1]/input");
    private By confirmEmailBox = By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input");
    private By mobileBox = By.xpath("//*[@id=\"guestform\"]/div[3]/div/input");
    private By adrresBox = By.xpath("//*[@id=\"guestform\"]/div[4]/div/input");


    public BookNowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void bookingChatWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 1300)");
    }

    public void bookNowButton(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();
    }
    public void bookingWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 250)");
    }
    public void firstName(String name){
        driver.findElement(firstNameBox).click();
        driver.findElement(firstNameBox).sendKeys(name);
    }
    public void lastName(String lastName){
        driver.findElement(lastNameBox).click();
        driver.findElement(lastNameBox).sendKeys(lastName);
    }
    public void email(String email){
        driver.findElement(emailBox).click();
        driver.findElement(emailBox).sendKeys(email);
    }
    public void confirmEmail(String confirmEmail){
        driver.findElement(confirmEmailBox).click();
        driver.findElement(confirmEmailBox).sendKeys(confirmEmail);
    }
    public void mobile(String mobile){
        driver.findElement(mobileBox).click();
        driver.findElement(mobileBox).sendKeys(mobile);
    }
    public void addres(String address){
        driver.findElement(adrresBox).click();
        driver.findElement(adrresBox).sendKeys(address);
    }
    public void bookingWindowContinue() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(250, 500)");
    }

    public void country(){
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input")).sendKeys("Colombia");
        driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input")).sendKeys(Keys.ENTER);
    }
    public void bookingWindowConfirmBook() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(500, 1750)");
    }
    public void confirmBooking(){
        driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[9]/button")).click();
    }

}
