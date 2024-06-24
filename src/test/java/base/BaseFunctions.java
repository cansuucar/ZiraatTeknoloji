package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseFunctions extends BaseTest{
    //metodlar

    public void click(By by){
        driver.findElement(by).click();
    }



    public void waitmethod() throws InterruptedException {

        Thread.sleep(10000);

    }

    public void sendKeys(By locator, int text) {
        driver.findElement(locator).sendKeys();
    }


    public void reset(By by){  //sıfırla
        driver.findElement(by).clear();
    }


}
