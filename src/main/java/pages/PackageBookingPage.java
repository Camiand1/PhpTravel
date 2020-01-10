package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackageBookingPage {

    private WebDriver driver;
    private By nameBox = By.xpath("//div[@id='packages_modal']//div[@class='form-group']//input[@class='form-control' and @placeholder='Name']");
    private By emailBox = By.xpath("//div[@id='packages_modal']//div[@class='form-group']//input[@class='form-control' and @placeholder='Email']");
    private By phoneBox = By.xpath("//div[@id='packages_modal']//div[@class='form-group']//input[@class='form-control' and @placeholder='Phone']");

    public PackageBookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void name(String name){
        driver.findElement(nameBox).click();
        driver.findElement(nameBox).sendKeys(name);
    }
    public void email(String email){
        driver.findElement(emailBox).click();
        driver.findElement(emailBox).sendKeys(email);
    }
    public void phone(String phone){
        driver.findElement(phoneBox).click();
        driver.findElement(phoneBox).sendKeys(phone);
    }
    public void sendBook(){
        driver.findElement(By.xpath("//*[@id=\"packages_modal\"]/div/div/div[2]/form/div/div[2]/div[3]/div/button")).click();
    }
}
