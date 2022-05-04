package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.smartcardio.Card;

public class ComputerPageTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    BillingAddress billingAddress = new BillingAddress();
    ShippingPage shippingPage = new ShippingPage();


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Thread.sleep(2000);
//    2.1 Click on Computer Menu.
        homePage.clickOnComputerTab();
        Thread.sleep(1000);

//    2.2 Click on Desktop
        computerPage.clickOnDesktop();
        Thread.sleep(1000);

//    2.3 Select Sort By position "Name: A to Z"
        mouseHoverToElement(By.xpath("//select[@id='products-orderby']"));
        computerPage.selectNameAtoZ("5");
        Thread.sleep(2000);

//    2.4 Click on "Add To Cart"
        mouseHoverToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        computerPage.clickAddToCart();
        Thread.sleep(2000);

        //--------------Build your own computer Page-----------------/////

//    2.5 Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputer.buildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(1000);
//    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.selectintelPentiume2ghz("1");
        Thread.sleep(1000);
//    2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.selectRam8Gb("5");
        Thread.sleep(1000);

//    2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.selectHDD400Gb();
        Thread.sleep(1000);

//    2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.selectVistaPremium();
        Thread.sleep(1000);

//    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer.addTotalCommander();
       Thread.sleep(3000);

//    2.11 Verify the price "$1,475.00"
        String expectedMessage2 ="$1,475.00";
        String actualMessage2 = buildYourOwnComputer.priceText();
        Assert.assertEquals(actualMessage2,expectedMessage2);
        Thread.sleep(1000);

//    2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.selectAddToChart();
        Thread.sleep(1000);

//----------------------------shopping cart-----------------///
//    2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
//    After that close the bar clicking on the cross button.

        String expectedMessage3 ="The product has been added to your shopping cart";
       String actualMessage3 = shoppingCartPage.verifyMessage();
        Assert.assertEquals(actualMessage3,expectedMessage3);
        shoppingCartPage.closeMessageBar();
       Thread.sleep(1000);

//    2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCartPage.clickShoppingChart();
        Thread.sleep(2000);

//    2.15 Verify the message "Shopping cart"
        String expectedMessage4 ="Shopping cart";
        String actualMessage4 = shoppingCartPage.VerifyShoppingCart();
        Assert.assertEquals(actualMessage4,expectedMessage4);
        Thread.sleep(1000);

//    2.16 Change the Qty to "2" and Click on "Update shopping cart"

        shoppingCartPage.changeQty("2");
        shoppingCartPage.clickOnShoppingCart();
       Thread.sleep(2000);

//    2.17 Verify the Total"$2,950.00"
        String expectedMessage5 ="$2,950.00";
        String actualMessage5 = shoppingCartPage.verifyTotal();
        Assert.assertEquals(actualMessage5,expectedMessage5);

//    2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickCheckbox();

//    2.19 Click on “CHECKOUT”
        shoppingCartPage.clickCheckoutBtn();
        Thread.sleep(1000);

//********************************login page***********************//
//    2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage6 ="Welcome, Please Sign In!";
        String actualMessage6 = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage6,expectedMessage6);
        Thread.sleep(1000);
//    2.21Click on “CHECKOUT AS GUEST”Tab
        loginPage.clickGuestBtn();
        Thread.sleep(1000);
        //********************************billing page***********************//

//    2.22 Fill the all mandatory field
        //first name
        billingAddress.enterfirstname("Ron");
        Thread.sleep(1000);

        //Last name
        billingAddress.enterLastName("Jira");
         Thread.sleep(1000);

        //Email
        billingAddress.enterEmailId("rlobo1993@gamil.co.uk");
        Thread.sleep(1000);

        //Country
        billingAddress.setCountry("United Kingdom");
        Thread.sleep(1000);

        //City
        billingAddress.enterCity("london");
        Thread.sleep(1000);

        //Address 1:
        billingAddress.enterAdddress("105 london street");
        Thread.sleep(1000);

        //zip
        billingAddress.enterZip("UB10 10BU");
        Thread.sleep(1000);

        //Phone number:
        billingAddress.enterPhoneNumber("0712345678");
        Thread.sleep(1000);

//    2.23 Click on “CONTINUE”
        billingAddress.clickContinueBtn();
        Thread.sleep(1000);


//**********************************shipping****************************************
//    2.24 Click on Radio Button “Next Day Air($0.00)”
        shippingPage.selectNextDayAir();
        Thread.sleep(1000);

//    2.25 Click on “CONTINUE”
        shippingPage.setContinueBtn1();
        Thread.sleep(1000);

//    2.26 Select Radio Button “Credit Card”
        shippingPage.selectCreditCard();
        Thread.sleep(1000);

//    2.27 Select “Master card” From Select credit card dropdown
        shippingPage.selectMasterCard("Master card");

//    2.28 Fill all the details
        //Cardholder name:
        shippingPage.enterCardholderName("MR R Jira");
        Thread.sleep(1000);

        //Card number:
        shippingPage.enterCardNumber("5512345678912345");
        Thread.sleep(1000);

        //Expiration date:
        shippingPage.enterExpireMonth("09");
        shippingPage.enterExpireYear("2027");
        Thread.sleep(1000);

        //Card code:
        shippingPage.enterCardCode("007");
        Thread.sleep(1000);

//    2.29 Click on “CONTINUE”
        shippingPage.setContinueBtn2();
        Thread.sleep(1000);

//    2.30 Verify “Payment Method” is “Credit Card”
        String expectedMessage7 ="Credit Card";
        String actualMessage7 = shippingPage.verifyCreditCard();
        Assert.assertEquals(actualMessage7,expectedMessage7);
        Thread.sleep(1000);

//    2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedMessage8 ="Next Day Air";
        String actualMessage8 = shippingPage.verifyNextDayAir();
        Assert.assertEquals(actualMessage8,expectedMessage8);
        Thread.sleep(1000);
//    2.33 Verify Total is “$2,950.00”
        String expectedMessage9 ="$2,950.00";
        String actualMessage9 =shippingPage.verifyPrice();
        Assert.assertEquals(actualMessage9,expectedMessage9);
        Thread.sleep(1000);

//    2.34 Click on “CONFIRM”
        shippingPage.setContinueBtn3();
        Thread.sleep(1000);

//    2.35 Verify the Text “Thank You”
        String expectedMessage10 ="Thank you";
        String actualMessage10 = shippingPage.verifyThankYou();
        Assert.assertEquals(actualMessage10,expectedMessage10);
        Thread.sleep(1000);

//    2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage11 ="Your order has been successfully processed!";
        String actualMessage11 = shippingPage.verifyorderSuccessfullyProcessed();
        Assert.assertEquals(actualMessage11,expectedMessage11);
        Thread.sleep(1000);

//    2.37 Click on “CONTINUE”
        shippingPage.setContinueBtn4();
        Thread.sleep(1000);

//    2.37 Verify the text “Welcome to our store”
        String expectedMessage12 ="Welcome to our store";
        String actualMessage12 = shippingPage.verifyWelcometoOurstore();
        Assert.assertEquals(actualMessage12,expectedMessage12);



    }


}
