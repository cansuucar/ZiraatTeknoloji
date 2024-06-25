package tests;

import base.BaseTest;
import org.junit.Test;
import pages.MevduatGetirisiHesaplamaPage;

public class MevduatHesaplama extends BaseTest {

    @Test
    public void Mevduat() throws InterruptedException {

        MevduatGetirisiHesaplamaPage mevduatHesaplama = new MevduatGetirisiHesaplamaPage();
        mevduatHesaplama.clickMevduatHesaplama();
        mevduatHesaplama.waitMetod(500);
        mevduatHesaplama.clickDovizTuru();
        mevduatHesaplama.clickDovizSecimi();
        mevduatHesaplama.vadeSilveYaz();
        mevduatHesaplama.tutarYaz();
        mevduatHesaplama.hesaplaButton();
        mevduatHesaplama.waitMetod(500);
        mevduatHesaplama.kontrolEt();


    }

}
