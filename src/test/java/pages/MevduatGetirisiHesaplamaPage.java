package pages;

import base.BaseFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MevduatGetirisiHesaplamaPage extends BaseFunctions {

    By MevduatGetisisiButton= By.xpath("(//a[text()='Mevduat Getirisi Hesaplama'])[1]");
    By dovizTur = By.id("select2-dovizCinsi-container");
    By dovizSecim =By.xpath("(//ul[@id='select2-dovizCinsi-results']//li)[2]");
    By vadeSuresi = By.id("deposit-calc-vade");
    By tutarText =By.id("tutar");
    By mevduathesaplaButton = By.xpath("//a[text()='HESAPLA']");
    By kontrolVade = By.xpath("//label[text()='Faiz Oranı']");


    public void clickMevduatHesaplama(){

        click(MevduatGetisisiButton);
    }

    public void clickDovizTuru() {

        click(dovizTur);

    }
    public void clickDovizSecimi() {

        click(dovizSecim);

    }

    public void vadeSilveYaz() {

        sendKeys(vadeSuresi, "30");

    }
    public void tutarYaz() {

        sendKeys(tutarText, "50000");

    }


    public void hesaplaButton() {

        click(mevduathesaplaButton);
    }


    public void kontrolEt() {

        Assert.assertEquals("Faiz Oranı text doesnt visible", getText(kontrolVade), "Faiz Oranı");
    }

}
