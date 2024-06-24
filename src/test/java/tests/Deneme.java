package tests;

import base.BaseTest;
import org.junit.Test;
import pages.DenemePage;

public class Deneme extends BaseTest {

    @Test
    public void deneme() throws InterruptedException {

        DenemePage denemePage= new DenemePage();
        denemePage.clickKrediHesaplama();
        denemePage.waitmethod();
        denemePage.clickKrediTuru();
        denemePage.waitmethod();
        denemePage.clickKrediSecimi();
        denemePage.waitmethod();
        denemePage.tutarClick();
        denemePage.waitmethod();
        denemePage.tutarYaz();
        denemePage.waitmethod();
        denemePage.vadeSilveYaz();
        denemePage.waitmethod();
        denemePage.faizClick();
        denemePage.waitmethod();
        denemePage.hesaplaButton();
        denemePage.waitmethod();
    }
}
