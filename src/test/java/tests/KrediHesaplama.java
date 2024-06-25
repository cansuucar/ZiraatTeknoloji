package tests;

import base.BaseTest;
import org.junit.Test;
import pages.KrediHesaplamaPage;

public class KrediHesaplama extends BaseTest {

    @Test
    public void krediHesaplama() throws InterruptedException {

        KrediHesaplamaPage krediHesaplamaPage = new KrediHesaplamaPage();
        krediHesaplamaPage.clickKrediHesaplama();
        krediHesaplamaPage.waitMetod(500);
        krediHesaplamaPage.clickKrediTuru();
        krediHesaplamaPage.clickKrediSecimi();
        krediHesaplamaPage.tutarClick();
        krediHesaplamaPage.tutarYaz();
        krediHesaplamaPage.waitMetod(500);
        krediHesaplamaPage.vadeSilveYaz();
        krediHesaplamaPage.faizClick();
        krediHesaplamaPage.hesaplaButton();
        krediHesaplamaPage.waitMetod(500);
        krediHesaplamaPage.kontrolEt();

    }
}
