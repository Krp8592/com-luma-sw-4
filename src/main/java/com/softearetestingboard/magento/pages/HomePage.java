package com.softearetestingboard.magento.pages;

import com.softearetestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By womenTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By womenJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By menBottoms = By.xpath("//a[@id='ui-id-18']");
    By menPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By gearBags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(womenTops);
    }

    public void mouseHoverAndClickOnJackets() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(womenJackets);
    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(menBottoms);
    }

    public void mouseHoverAndClickOnPants() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(menPants);
    }


    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(gearBags);
    }


}
