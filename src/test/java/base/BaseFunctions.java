package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunctions extends BaseTest{
    //metodlar

    public void click(By by){
        driver.findElement(by).click();
    }



    public void waitMetod(int value) throws InterruptedException {

        Thread.sleep(value);

    }

    public void sendKeys(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }


    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

}
