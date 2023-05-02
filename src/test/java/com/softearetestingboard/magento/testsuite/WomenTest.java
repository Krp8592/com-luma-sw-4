package com.softearetestingboard.magento.testsuite;

import com.softearetestingboard.magento.pages.HomePage;
import com.softearetestingboard.magento.pages.WomenPage;
import com.softearetestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Click on Jackets
        homePage.mouseHoverAndClickOnJackets();

        // Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.productListAfterSorting(), womenPage.productListBeforeSorting());

    }


    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Click on Jackets
        homePage.mouseHoverAndClickOnJackets();

        // Verify the products price display in Low to High
        Assert.assertEquals(womenPage.priceListAfterSorting(), womenPage.priceListBeforeSorting());


    }
}
