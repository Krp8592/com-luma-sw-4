package com.softearetestingboard.magento.pages;

import com.softearetestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By coronusYogaPants = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By coronusYogaPants32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By coronusYogaPantsBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By addedToShoppingCartTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartTextElement = By.xpath("//span[@class='base']");
    By coronusYogaPantsTextElement = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size32TextElement = By.xpath("//dd[contains(text(),'32')]");
    By colourBlackTextElement = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnCoronusYogaPantsAndClickOn32() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPants32);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnBlack() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPantsBlack);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(addToCart);
    }

    public String getAddedToCartMessage(){
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement(){
        clickOnElement(shoppingCart);
    }

    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartTextElement);
    }

    public String getCoronusYogaPantText(){
        return getTextFromElement(coronusYogaPantsTextElement);
    }

    public String getSize32Text(){
        return getTextFromElement(size32TextElement);
    }

    public String getColourBlackText(){
        return getTextFromElement(colourBlackTextElement);
    }

}
