package pages;

import base.BaseFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;


public class KrediHesaplamaPage extends BaseFunctions {


    By krediHesaplamaButton = By.xpath("(//a[text()='Konut Kredisi'])[1]");
    By tutarTextClick = By.cssSelector("#calc-tutar");
    By krediTuru = By.id("select2-ddlCredit-container");
    By krediSecimi = By.xpath("(//ul[@id='select2-ddlCredit-results']//li)[3]");
    By vadeTextClick = By.cssSelector("#calc-vade");
    By faizOraniText = By.cssSelector("#faiz-orani");
    By hesaplaButtonClick = By.xpath("//a[text()='HESAPLA']");
    By kontrolCheck = By.xpath("//label[text()='Yıllık Maliyet Oranı']");


    public void clickKrediHesaplama() {

        click(krediHesaplamaButton);

    }

    public void clickKrediTuru() {

        click(krediTuru);

    }

    public void clickKrediSecimi() {

        click(krediSecimi);

    }

    public void tutarClick() {

        click(tutarTextClick);

    }

    public void tutarYaz() {

        sendKeys(tutarTextClick, "50000");

    }

    public void faizClick() {

        sendKeys(faizOraniText, "5,45");
    }


    public void hesaplaButton() {

        click(hesaplaButtonClick);
    }

    public void vadeSilveYaz() {

        sendKeys(vadeTextClick, "15");

    }

    public void kontrolEt() {

        Assert.assertEquals("Yıllık Maliyet Oranı text doesnt visible", getText(kontrolCheck), "Yıllık Maliyet Oranı");
    }


}
