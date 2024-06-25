package pages;

import base.BaseFunctions;
import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class IbanHesaplamaPage extends BaseFunctions {

    By ibanHesaplama = By.xpath("(//a[text()='IBAN Hesaplama'])[1]");
    By subeTuru = By.id("select2-ddlSube-container");
    By subeSecim = By.xpath("(//ul[@id='select2-ddlSube-results']//li)[2]");
    By musteriNo = By.id("musteriNo");
    By ekNo = By.id("ekNo");
    By ibanHesaplaButton = By.xpath("//a[text()='HESAPLA']");
    By ibanKontrol = By.xpath("//label[text()='IBAN']");

    public void clickIbanHesaplama() {

        click(ibanHesaplama);

    }

    public void clickSubeTuru() {

        click(subeTuru);

    }

    public void clickSubeSecimi() {

        click(subeSecim);

    }


    public void musteriClick() {

        click(musteriNo);

    }

    public void musteriYaz() {

        sendKeys(musteriNo, "50403030");

    }

    public void ekNoClick() {

        click(ekNo);

    }

    public void ekNoType() {

        sendKeys(ekNo, "5040");

    }

    public void ibanHesaplaButton() {

        click(ibanHesaplaButton);
    }

    public void ibanKontrolEt() {

        Assert.assertEquals("IBAN text doesnt visible", getText(ibanKontrol), "IBAN");
    }


}
