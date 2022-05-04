package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {

    By buildYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By intelPentiume2ghz = By.xpath("//select[@id='product_attribute_1']");
    By ram8Gb = By.xpath("//select[@id='product_attribute_2']");
    By hDD400Gb = By.id("product_attribute_3_7");
    By vistaPremium = By.id("product_attribute_4_9");
    By totalCommander = By.id("product_attribute_5_12");
    By price = By.id("price-value-1");
    By addToChart = By.id("add-to-cart-button-1");

    //    2.5 Verify the Text "Build your own computer"
    public String buildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputer);
    }
    //    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectintelPentiume2ghz(String value) {
        mouseHoverToElement(intelPentiume2ghz);
        selectByValueFromDropDown(intelPentiume2ghz, value);
    }
    //    2.7.Select "8GB [+$60.00]" using Select class.
    public void selectRam8Gb(String value) {
        mouseHoverToElement(ram8Gb);
        selectByValueFromDropDown(ram8Gb, value);
    }
    //    2.8 Select HDD radio "400 GB [+$100.00]"
    public void selectHDD400Gb() {
        mouseHoverToElement(hDD400Gb);
        clickOnElement(hDD400Gb);
    }
    //    2.9 Select OS radio "Vista Premium [+$60.00]"
    public void selectVistaPremium() {
        clickOnElement(vistaPremium);
    }
    //    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    public void addTotalCommander() {
        mouseHoverToElement(totalCommander);
        clickOnElement(totalCommander);
    }
    //    2.11 Verify the price "$1,475.00"
    public String priceText() {
        return getTextFromElement(price);
    }
    //    2.12 Click on "ADD TO CARD" Button.
    public void selectAddToChart() {
        mouseHoverToElement(addToChart);
        clickOnElement(addToChart);
    }


}
