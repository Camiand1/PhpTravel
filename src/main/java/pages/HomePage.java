package pages;

import org.openqa.selenium.*;

public class HomePage {

    private WebDriver driver;
    private By tour = By.xpath("//div[@class= 'main-wrapper scrollspy-action']//a[@class= 'text-center tours ' and contains (text(),'Tours')]");
    private By destination = By.xpath("//div[@id='s2id_autogen8']//a[@class='select2-choice select2-default']//span[@class='select2-chosen']");
    private By destinationName = By.xpath("//div[@id=\"select2-drop\"]//div[@class=\"select2-search\"]//input");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void tourOption() {
        driver.findElement(tour).click();
    }

    public void setDestination() {
        driver.findElement(destination).click();
    }
    public void setDestinationName() throws Exception {
        driver.findElement(destinationName).sendKeys("Dubai");
        Thread.sleep(2000);
        driver.findElement(destinationName).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(destinationName).sendKeys(Keys.ENTER);
    }

    public void searchTours(){
        driver.findElement(By.xpath("//*[@id=\"tours\"]/div/div/form/div/div/div[4]/button")).click();

    }
    public void bigBusDubaiTour(){
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/h5/a")).click();
    }

    public void hideChatWindow(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, 1400)");
    }

    public void cheaperPrice(){
        driver.findElement(By.xpath("//*[@id=\"packages\"]/tbody/tr[2]/td[5]/a")).click();
    }
    public void gotItButton(){
        driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
    }


}
