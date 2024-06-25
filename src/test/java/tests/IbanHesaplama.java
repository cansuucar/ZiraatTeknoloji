package tests;

import base.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.openqa.selenium.By;
import pages.IbanHesaplamaPage;

public class IbanHesaplama extends BaseTest {

    @Test
    public void ibanHesaplama() throws InterruptedException {
        IbanHesaplamaPage ibanHesaplama = new IbanHesaplamaPage();
        ibanHesaplama.clickIbanHesaplama();
        ibanHesaplama.waitMetod(500);
        ibanHesaplama.clickSubeTuru();
        ibanHesaplama.clickSubeSecimi();
        ibanHesaplama.musteriClick();
        ibanHesaplama.musteriYaz();
        ibanHesaplama.waitMetod(500);
        ibanHesaplama.ekNoClick();
        ibanHesaplama.ekNoType();
        ibanHesaplama.ibanHesaplaButton();
        ibanHesaplama.waitMetod(500);
        ibanHesaplama.ibanKontrolEt();


    }


}


