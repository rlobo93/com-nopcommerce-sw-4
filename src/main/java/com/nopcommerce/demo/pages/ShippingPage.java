package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import javax.smartcardio.Card;

public class ShippingPage extends Utility {


    //    2.24 Click on Radio Button “Next Day Air($0.00)”
    By nextDayAir = By.id("shippingoption_1");

    public void selectNextDayAir() {
        clickOnElement(nextDayAir);
    }

    //    2.25 Click on “CONTINUE”
    By continueBtn1 = By.xpath(" //button[@class='button-1 shipping-method-next-step-button']");

    public void setContinueBtn1() {
        clickOnElement(continueBtn1);
    }


    ////    2.26 Select Radio Button “Credit Card”
    By creditCard = By.id("paymentmethod_1");

    public void selectCreditCard() throws InterruptedException {
        clickOnElement(creditCard);
        Thread.sleep(500);
        clickOnElement(By.xpath(" //button[@class='button-1 payment-method-next-step-button']"));
    }


    ////    2.27 Select “Master card” From Select credit card dropdown
    By masterCardBy = By.id("CreditCardType");

    public void selectMasterCard(String text) {
        selectByVisibleTextFromDropDown(masterCardBy, text);
    }

//    2.28 Fill all the details

    //Cardholder name:
    By cardholderName = By.id("CardholderName");

    public void enterCardholderName(String text) {
        sendTextToElement(cardholderName, text);
    }

    //Card number:
    By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String text) {
        sendTextToElement(cardNumber, text);
    }

    //Expiration date:
    By expireMonth = By.id("ExpireMonth");

    public void enterExpireMonth(String text) {
        selectByVisibleTextFromDropDown(expireMonth, text);
    }

    By expireYear = By.id("ExpireYear");

    public void enterExpireYear(String text) {
        selectByVisibleTextFromDropDown(expireYear, text);
    }

    //Card code:
    By cardCode = By.id("CardCode");

    public void enterCardCode(String text) {
        sendTextToElement(cardCode, text);
    }

    ////    2.29 Click on “CONTINUE”
    By continueBtn2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void setContinueBtn2() {
        clickOnElement(continueBtn2);
    }

    ////    2.30 Verify “Payment Method” is “Credit Card”
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");

    public String verifyCreditCard() {
        return getTextFromElement(creditCardText);
    }


    ////    2.32 Verify “Shipping Method” is “Next Day Air”
    By nextdayAir = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");

    public String verifyNextDayAir() {
        return getTextFromElement(nextdayAir);
    }

    ////    2.33 Verify Total is “$2,950.00”
    By price = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");

    public String verifyPrice() {
        return getTextFromElement(price);
    }

    ////    2.34 Click on “CONFIRM”
    By continueBtn3 = By.xpath("//button[contains(text(),'Confirm')]");

    public void setContinueBtn3() {
        clickOnElement(continueBtn3);
    }

    ////    2.35 Verify the Text “Thank You”
    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");

    public String verifyThankYou() {
        return getTextFromElement(thankYou);
    }


    ////    2.36 Verify the message “Your order has been successfully processed!”
    By orderSuccessfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyorderSuccessfullyProcessed() {
        return getTextFromElement(orderSuccessfullyProcessed);
    }


    ////    2.37 Click on “CONTINUE”
    By continueBtn4 = By.xpath("//button[contains(text(),'Continue')]");

    public void setContinueBtn4() {
        clickOnElement(continueBtn4);
    }

    ////    2.37 Verify the text “Welcome to our store”
    By WelcometoOurstore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String verifyWelcometoOurstore() {
        return getTextFromElement(WelcometoOurstore);
    }


    //        2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By ndDayAir = By.id("shippingoption_2");

    public void select2ndDayAir() {
        clickOnElement(ndDayAir);
    }

    //        2.32 Select “Visa” From Select credit card dropdown
    By visa = By.id("CreditCardType");

    public void selectVisaCreditCard(String card) {
        selectByVisibleTextFromDropDown(visa, card);
    }

    //2.34 Click on “CONTINUE”CHECKOUT”
    By checkout = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    public void continueCheckout() {
        clickOnElement(checkout);
    }

    //        2.43 Click on “Logout” link
    By logOut =By.xpath("//h2[contains(text(),'Welcome to our store')]");

public void clickOnLogOutTab() {
    mouseHoverToElement(logOut);
    clickOnElement(logOut);
}




}
