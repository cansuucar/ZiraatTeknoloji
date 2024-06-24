package pages;

import base.BaseFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DenemePage extends BaseFunctions {


    By krediHesaplamaButton = By.xpath("(//a[text()='Konut Kredisi'])[1]");
    By tutarTextClick = By.cssSelector("#calc-tutar");
     By krediTuru = By.id("select2-ddlCredit-container");
     By krediSecimi = By.xpath("(//ul[@id='select2-ddlCredit-results']//li)[3]");
    By vadeTextClick = By.cssSelector("#calc-vade");
    By faizOraniText = By.cssSelector("#faiz-orani");
    By hesaplaButtonClick = By.xpath("//a[text()='HESAPLA']");

   public void clickKrediHesaplama(){

    click(krediHesaplamaButton);

}

    public void clickKrediTuru(){

        click(krediTuru);

    }

    public void clickKrediSecimi(){

        click(krediSecimi);

    }

   public void tutarClick(){

   click(tutarTextClick);

}
    public void tutarYaz(){

        driver.findElement(By.cssSelector("#calc-tutar")).sendKeys("11");

    }

   public void faizClick(){

       driver.findElement(By.cssSelector("#faiz-orani")).sendKeys("5,45");
    }


    public void hesaplaButton(){

    click(hesaplaButtonClick);
    }

    public void vadeSilveYaz(){

        driver.findElement(By.cssSelector("#calc-vade")).clear();
        driver.findElement(By.cssSelector("#calc-vade")).sendKeys("15");
    }
}
