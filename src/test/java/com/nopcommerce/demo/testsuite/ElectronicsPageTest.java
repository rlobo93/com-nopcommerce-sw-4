package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends TestBase {
    HomePage homePage = new HomePage();
    ElectronicsPages electronicsPages = new ElectronicsPages();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    ShippingPage shippingPage = new ShippingPage();
    BillingAddress billingAddress = new BillingAddress();


    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //        2.1 Mouse Hover on “Electronics” Tab,
        homePage.electronicsTabMousehover();
        Thread.sleep(1000);
        // 2.2 Mouse Hover on “Cell phones” and click
        homePage.cellPhoneMouseHover();
        Thread.sleep(1000);

//        2.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = electronicsPages.verifyCellPhones();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);

//        2.4 Click on List View Tab
        electronicsPages.selectListView();
        Thread.sleep(1000);

//        2.5 Click on product name “Nokia Lumia 1020” link
        electronicsPages.selectNokiaLumia();
        Thread.sleep(1000);
//        2.6 Verify the text “Nokia Lumia 1020”
        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = electronicsPages.verifyNokiaText();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);

//        2.7 Verify the price “$349.00”
        String expectedMessage2 = "$349.00";
        String actualMessage2 = electronicsPages.verifyPrice();
        Assert.assertEquals(actualMessage2, expectedMessage2);
        Thread.sleep(1000);

//        2.8 Change quantity to 2
        electronicsPages.changeQty("2");
        Thread.sleep(3000);

//        2.9 Click on “ADD TO CART” tab
        electronicsPages.clickAddToCart();
        Thread.sleep(1000);


//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = electronicsPages.verifyShoppingCartMessage();
        Assert.assertEquals(actualMessage3, expectedMessage3);
        Thread.sleep(1000);

//        After that close the bar clicking on the cross button.
        electronicsPages.selectCrossButton();
        Thread.sleep(1000);

//        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPages.clickShoppingChart();
        Thread.sleep(1000);


//        2.12 Verify the message "Shopping cart"

        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = shoppingCartPage.VerifyShoppingCart();
        Assert.assertEquals(actualMessage4, expectedMessage4);
        Thread.sleep(1000);

//////        2.13 Verify the quantity is 2
////   int expectedMessage5 = 2;
////    int actualMessage5 = getNumberFromElement(By.xpath("//input[@id='itemquantity11218']"));
////    Assert.assertEquals(actualMessage5, expectedMessage5);
////    Thread.sleep(1000);
//

//        2.14 Verify the Total $698.00
        String expectedMessage6 = "$698.00";
        String actualMessage6 = shoppingCartPage.verifyTotal();
        Assert.assertEquals(actualMessage6, expectedMessage6);
        Thread.sleep(1000);

////        2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickCheckbox();

//        2.16 Click on checkout
        shoppingCartPage.clickCheckoutBtn();

//        2.17 Verify the Text “Welcome, Please Sign In!”

        String expectedMessage7 = "Welcome, Please Sign In!";
        String actualMessage7 = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage7, expectedMessage7);
        Thread.sleep(1000);

//        2.18 Click on “REGISTER” tab
        loginPage.registerTab();

//        2.19 Verify the text “Register”

        String expectedMessage8 = "Register";
        String actualMessage8 = registrationPage.getRegisterText();
        Assert.assertEquals(actualMessage8, expectedMessage8);
        Thread.sleep(1000);

//        2.20 Fill the mandatory fields

        //Gender
        registrationPage.clickMaleGender();
        Thread.sleep(1000);
        //First name:
        registrationPage.setFirstName("Ron");
        Thread.sleep(1000);
        //Last name
        registrationPage.setLastName("Jira");
        Thread.sleep(1000);
        //Date of birth:
        registrationPage.dateOfBirthDay("9");
        registrationPage.dateOfBirthMonth("November");
        registrationPage.dateOfBirthYear("1991");
        Thread.sleep(1000);
        //Email:
        registrationPage.addEmail("rrrr12@gmail.co.uk");
        Thread.sleep(1000);
        //Password:
        registrationPage.setPassword("ron1234");
        //Confirm password
        registrationPage.setConfirmPassword("ron1234");
        Thread.sleep(1000);

//        2.21 Click on “REGISTER” Button
        registrationPage.clickRegisterButton();
        Thread.sleep(1000);

//        2.22 Verify the message “Your registration completed”
        String expectedMessage9 = "Your registration completed";
        String actualMessage9 = registrationPage.getRegistrationText();
        Assert.assertEquals(actualMessage9, expectedMessage9);
        Thread.sleep(1000);

//        2.23 Click on “CONTINUE” tab
        registrationPage.clickContinue();

//        2.24 Verify the text “Shopping cart”
        String expectedMessage10 = "Shopping cart";
        String actualMessage10 = shoppingCartPage.VerifyShoppingCart();
        Assert.assertEquals(actualMessage10, expectedMessage10);
        Thread.sleep(1000);

//        2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickCheckbox();

//        2.26 Click on “CHECKOUT”
        shoppingCartPage.clickCheckoutBtn();
        Thread.sleep(2000);

//        2.27 Fill the Mandatory fields
        //first name
        billingAddress.enterfirstname("Ron");
        Thread.sleep(1000);

        //Last name
        billingAddress.enterLastName("Jira");
        Thread.sleep(1000);

        //Email
        billingAddress.enterEmailId("rlo@gamil.co.uk");
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

//        2.28 Click on “CONTINUE”
        billingAddress.clickContinueBtn();
        Thread.sleep(1000);


//        2.29 Click on Radio Button “2nd Day Air ($0.00)”
        shippingPage.select2ndDayAir();
        Thread.sleep(1000);

//        2.30 Click on “CONTINUE”
        shippingPage.setContinueBtn1();
        Thread.sleep(1000);

//        2.31 Select Radio Button “Credit Card”
        shippingPage.selectCreditCard();
        Thread.sleep(1000);


//        2.32 Select “Visa” From Select credit card dropdown
        shippingPage.selectVisaCreditCard("Visa");
        Thread.sleep(1000);

//        2.33 Fill all the details
        //Cardholder name:
        shippingPage.enterCardholderName("MR R Jira");
        Thread.sleep(1000);
        //Card number:
        shippingPage.enterCardNumber("4111111111111111");

        //Expiration date:
        shippingPage.enterExpireMonth("09");
        shippingPage.enterExpireYear("2027");
        Thread.sleep(1000);

        //Card code:
        shippingPage.enterCardCode("007");
        Thread.sleep(1000);

//        2.34 Click on “CONTINUE”CHECKOUT”
        shippingPage.continueCheckout();
        Thread.sleep(1000);

//        2.35 Verify “Payment Method” is “Credit Card”
        String expectedMessage11 = "Credit Card";
        String actualMessage11 = shippingPage.verifyCreditCard();
        Assert.assertEquals(actualMessage11, expectedMessage11);
        Thread.sleep(1000);

//        2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedMessage12 = "2nd Day Air";
        String actualMessage12 = shippingPage.verifyNextDayAir();
        Assert.assertEquals(actualMessage12, expectedMessage12);
        Thread.sleep(1000);


//        2.37 Verify Total is “$698.00”
        String expectedMessage13 = "$698.00";
        String actualMessage13 = shippingPage.verifyPrice();
        Assert.assertEquals(actualMessage13, expectedMessage13);
        Thread.sleep(1000);

//        2.38 Click on “CONFIRM”
        shippingPage.setContinueBtn3();
        Thread.sleep(1000);

//        2.39 Verify the Text “Thank you”
        String expectedMessage14 = "Thank you";
        String actualMessage14 = shippingPage.verifyThankYou();
        Assert.assertEquals(actualMessage14, expectedMessage14);
        Thread.sleep(1000);

//        2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage15 = "Your order has been successfully processed!";
        String actualMessage15 = shippingPage.verifyorderSuccessfullyProcessed();
        Assert.assertEquals(actualMessage15, expectedMessage15);
        Thread.sleep(1000);

//        2.41 Click on “CONTINUE”
        shippingPage.setContinueBtn4();
        Thread.sleep(1000);

//        2.42 Verify the text “Welcome to our store”
        String expectedMessage16 = "Welcome to our store";
        String actualMessage16 = shippingPage.verifyWelcometoOurstore();
        Assert.assertEquals(actualMessage16, expectedMessage16);
        Thread.sleep(1000);

//        2.43 Click on “Logout” link
        shippingPage.clickOnLogOutTab();

//        2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String expectedMessage17 = "https://demo.nopcommerce.com/";
        String actualMessage17 = driver.getCurrentUrl();
        Assert.assertEquals(actualMessage17, expectedMessage17);

    }

}
