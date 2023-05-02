package com.softearetestingboard.magento.pages;

import com.softearetestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By overnightDuffleElement = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overnightDuffleTextElement = By.xpath("//span[@class='base']");
    By inputQuantityBox = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedToShoppingCartTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By productNameTextElement = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By attributeValue = By.xpath("//input[@title='Qty']");
    By productPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By updateShoppingCartField = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatedProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");


    public void clickOnOvernightDuffleElement() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(overnightDuffleElement);
    }

    public String getOvernightDuffleText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(overnightDuffleTextElement);
    }

    public void clearTheInputBox() throws InterruptedException {
        Thread.sleep(1000);
        clearTextFromElement(inputQuantityBox);
    }
    public void sendQtyToInputQuantityBox(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(inputQuantityBox, quantity);
    }

    public void clickOnOverAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shoppingCart);
    }

    public String getTextProductNameTextElement() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productNameTextElement);
    }

    public String getInputQty() throws InterruptedException {
        Thread.sleep(1000);
        return getAttributeValue(attributeValue , "value");
    }

    public String getProductPrice() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productPrice);
    }

    public void sendQtyToUpdateInQuantityBox(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(updateShoppingCartField, quantity);
    }

    public void clickUpdateShoppingCartButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(updateShoppingCartButton);
    }

    public String getUpdatedProductPrice() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(updatedProductPrice);
    }

}
