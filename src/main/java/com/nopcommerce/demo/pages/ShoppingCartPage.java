package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingChartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingChartBtn = By.xpath("//span[contains(text(),'Shopping cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quainty = By.xpath("//input[@value='1']");
    By shoppingCart = By.id("updatecart");
    By total = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By checkbox = By.id("termsofservice");

    //    2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
    public String verifyMessage() {
        return getTextFromElement(shoppingChartMessage);
    }
    //close the bar
    public void closeMessageBar() {
        mouseHoverToElement(closeMessage);
        clickOnElement(closeMessage);
    }
    //    2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void clickShoppingChart() {
        mouseHoverToElement(shoppingChartBtn);
        clickOnElement(shoppingChartBtn);
    }
    //    2.15 Verify the message "Shopping cart"
    public String VerifyShoppingCart() {
        return getTextFromElement(shoppingCartText);
    }

    //    2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void changeQty(String value) {
        clearValue(quainty);
        sendTextToElement(quainty, value);
    }
    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
    //    2.17 Verify the Total"$2,950.00"
    public String verifyTotal() {
        return getTextFromElement(total);
    }

    //    2.18 click on checkbox “I agree with the terms of service”
    public void clickCheckbox() {
        clickOnElement(checkbox);
    }

    //    2.19 Click on “CHECKOUT”
    By checkoutBox = By.id("checkout");
    public void clickCheckoutBtn(){
        clickOnElement(checkoutBox);
    }







}
