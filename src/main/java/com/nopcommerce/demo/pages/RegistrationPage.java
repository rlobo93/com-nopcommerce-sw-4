package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By registerTab = By.linkText("Register");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");

    By addEmail = By.id("Email");
    By addPassword = By.id("Password");
    By addConfirmPassword = By.id("ConfirmPassword");
    By registerbutton = By.id("register-button");
    By registrationText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continuebutton = By.xpath("//a[contains(text(),'Continue')]");






    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }

    public void clickMaleGender() {
        clickOnElement(genderMale);
    }

    public void setFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void setLastName(String name) {
        sendTextToElement(lastName, name);
    }
//    select Date Of Birth Day
    By Dob =By.name("DateOfBirthDay");
    public void dateOfBirthDay (String value){
        selectByValueFromDropDown(Dob,value);
    }

//    select Month
    By birthMonth= By.name("DateOfBirthMonth");
    public void dateOfBirthMonth(String value){
        selectByVisibleTextFromDropDown(birthMonth,value);
    }

//    select Year
    By year = By.name("DateOfBirthYear");
    public void dateOfBirthYear (String value){
        selectByValueFromDropDown(year,value);
    }

    public void addEmail(String email) {
        sendTextToElement(addEmail, email);
    }

    public void setPassword(String password) {
        sendTextToElement(addPassword, password);
    }

    public void setConfirmPassword(String ConfirmPassword) {
        sendTextToElement(addConfirmPassword, ConfirmPassword);

    }

    public void clickRegisterButton(){
        clickOnElement(registerbutton);
    }
    public String getRegistrationText(){
        return getTextFromElement(registrationText);
    }

    public void clickContinue(){
        clickOnElement(continuebutton);
    }




}
