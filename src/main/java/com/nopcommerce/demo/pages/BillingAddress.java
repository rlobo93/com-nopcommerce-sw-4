package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingAddress extends Utility {



   // 2.22 Fill the all mandatory field
        //first name
    By firstname = By.id("BillingNewAddress_FirstName");
    public void enterfirstname (String text){
        clearValue(firstname);
        sendTextToElement(firstname,text);
    }

    //Last name
    By lastName = By.id("BillingNewAddress_LastName");
    public void enterLastName(String text) {
        clearValue(lastName);
        sendTextToElement(lastName,text);
    }

    //Email
    By emailId =By.id("BillingNewAddress_Email");
    public void enterEmailId (String email) {
        clearValue(emailId);
        sendTextToElement(emailId,email);
    }

    //Country
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public void setCountry(String value){
        selectByVisibleTextFromDropDown(country,value);
    }

    //City
    By city = By.id("BillingNewAddress_City");
    public void enterCity(String text){
        clearValue(city);
        sendTextToElement(city,text);
    }

    //Address 1:
    By addressline1 = By.id("BillingNewAddress_Address1");
    public void enterAdddress (String text){
        sendTextToElement(addressline1,text);
    }

    //zip
    By zip = By.id("BillingNewAddress_ZipPostalCode");
    public void enterZip (String text){
        sendTextToElement(zip,text);
    }

    //Phone number:
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public void enterPhoneNumber(String value){
        sendTextToElement(phoneNumber,value);
    }

    //    2.23 Click on “CONTINUE”
    By continueBtn  = By.xpath(" //button[@class='button-1 new-address-next-step-button'][@onclick='Billing.save()']");
    public void clickContinueBtn () {
        clickOnElement(continueBtn);
    }








}
