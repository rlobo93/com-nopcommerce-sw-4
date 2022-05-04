package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcometext = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By logOut= By.linkText("Log out");
    By logOutText = By.linkText("Log out");
    By errorText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");

    public String getWelcomeText(){
        return getTextFromElement(welcometext);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickLoginButton(){
        clickOnElement(loginButton);
    }


    public void clickLogOut(){
        clickOnElement(logOut);
    }

    public String getLogOutText(){
        return getTextFromElement(logOutText);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorText);
    }

//    2.21Click on “CHECKOUT AS GUEST”Tab
    By guestBtn = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public void clickGuestBtn(){
        clickOnElement(guestBtn);
    }

//Click on “REGISTER” tab
    By register = By.xpath("//button[contains(text(),'Register')]");
    public void registerTab(){
        clickOnElement(register);
    }



























}
