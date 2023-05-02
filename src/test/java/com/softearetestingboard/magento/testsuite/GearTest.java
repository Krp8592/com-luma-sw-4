package com.softearetestingboard.magento.testsuite;

import com.softearetestingboard.magento.pages.GearPage;
import com.softearetestingboard.magento.pages.HomePage;
import com.softearetestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();

        // Click on Bags
        homePage.mouseHoverAndClickOnBags();

        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffleElement();

        // Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearPage.getOvernightDuffleText();
        Assert.assertEquals(expectedText, actualText, "Overnight Duffle text element is not displayed");

        //Clear The default quantity from element
        gearPage.clearTheInputBox();

        // Change Qty 3
        gearPage.sendQtyToInputQuantityBox("3");

        // Click on ‘Add to Cart’ Button.
        gearPage.clickOnOverAddToCartButton();

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = gearPage.getAddedToCartMessage();
        Assert.assertEquals(expectedText, actualText, "Added to shooping cart message not displayed.");

        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartElement();

        // Verify the product name ‘Overnight Duffle’
        expectedText = "Overnight Duffle";
        actualText = gearPage.getTextProductNameTextElement();
        Assert.assertEquals(expectedText, actualText, "'Overnight Duffle' text element is not displayed.");

        //Verify the Qty is ‘3’
        expectedText = "3";
        actualText = gearPage.getInputQty();
        Assert.assertEquals(expectedText, actualText, "'3' text element is not displayed.");

        //Verify the Qty is ‘$135.00’
        expectedText = "$135.00";
        actualText = gearPage.getProductPrice();
        Assert.assertEquals(expectedText, actualText, "'$135.00' text element is not displayed.");

        // Change Qty to ‘5’
        gearPage.sendQtyToUpdateInQuantityBox("5");

        // Click on ‘Update Shopping Cart’ button
        gearPage.clickUpdateShoppingCartButton();

        // Verify the product price ‘$225.00’
        expectedText = "$225.00";
        actualText = gearPage.getUpdatedProductPrice();
        Assert.assertEquals(expectedText, actualText, "'$225.00' text element is not displayed.");

    }

}
