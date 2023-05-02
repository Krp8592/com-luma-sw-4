package com.softearetestingboard.magento.testsuite;

import com.softearetestingboard.magento.pages.HomePage;
import com.softearetestingboard.magento.pages.MenPage;
import com.softearetestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {

        //Mouse Hover on men Menu
        homePage.mouseHoverOnMenMenu();

        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();

        //Click on pants
        homePage.mouseHoverAndClickOnPants();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOn32();

        // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOnBlack();

        // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOnAddToCart();

        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.getAddedToCartMessage();
        Assert.assertEquals(expectedText, actualText, "The added to cart message is not displayed");

        // Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartElement();

        // Verify the text "Shopping Cart".
        expectedText = "Shopping Cart";
        actualText = menPage.getShoppingCartText();
        Assert.assertEquals(expectedText, actualText, "Shopping cart text element is not displayed");

        // Verify the product name ‘Cronus Yoga Pant
        expectedText = "Cronus Yoga Pant";
        actualText = menPage.getCoronusYogaPantText();
        Assert.assertEquals(expectedText, actualText, "Cronus Yoga Pant text element is not displayed");

        // Verify the product size ‘32’.
        expectedText = "32";
        actualText = menPage.getSize32Text();
        Assert.assertEquals(expectedText, actualText, "'32' text element is not displayed");

        // Verify the product colour ‘Black’
        expectedText = "Black";
        actualText = menPage.getColourBlackText();
        Assert.assertEquals(expectedText, actualText, "'Black' text element is not displayed");
    }
}
