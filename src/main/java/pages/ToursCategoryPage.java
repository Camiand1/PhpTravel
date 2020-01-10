package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ToursCategoryPage {

    private WebDriver driver;

    public ToursCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void toursCategory() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']//span[@class='select2-chosen']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id=\"select2-drop\"]//div[@class=\"select2-search\"]//input")).sendKeys("Dubai");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id=\"select2-drop\"]//div[@class=\"select2-search\"]//input")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id=\"select2-drop\"]//div[@class=\"select2-search\"]//input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"tours\"]/div/div/form/div/div/div[4]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/h5/a")).click();
        Thread.sleep(1000);
    }

    public void toursWindow() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 600)");
    }

    public void select() throws Exception {

        driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();
        Thread.sleep(1000);

        /*
        driver.findElement(By.name("passport[1][name]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][name]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][name]")).sendKeys("Lola");
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][passportnumber]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][passportnumber]")).sendKeys("15469843");
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][age]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[1][age]")).sendKeys("30");
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][name]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][name]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][name]")).sendKeys("Nano");
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][passportnumber]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][passportnumber]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][passportnumber]")).sendKeys("6481232");
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][age]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("passport[2][age]")).sendKeys("40");
        Thread.sleep(1000);
        driver.findElement(By.name("logged")).click();

         */
    }
    public void guestWindow() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 1500)");
    }
    public void guestName1(String guestName1){
        driver.findElement(By.name("passport[1][name]")).click();
        driver.findElement(By.name("passport[1][name]")).sendKeys(guestName1);
    }
    public void guestPassport1(String guestPassport1){
        driver.findElement(By.name("passport[1][passportnumber]")).click();
        driver.findElement(By.name("passport[1][passportnumber]")).sendKeys(guestPassport1);
    }
    public void guestAge1(String guestAge11){
        driver.findElement(By.name("passport[1][age]")).click();
        driver.findElement(By.name("passport[1][age]")).sendKeys(guestAge11);
    }
    public void confirmBooking() {
        driver.findElement(By.name("logged")).click();
    }

}
