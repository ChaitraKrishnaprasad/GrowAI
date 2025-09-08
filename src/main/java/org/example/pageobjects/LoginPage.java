package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login = By.id("login-button");
    By list_products = By.xpath("//div[@class='app_logo']");
    By product1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void ClickLogin(){
        driver.findElement(btn_login).click();
    }
    public void isProductDisplayed(){
        driver.findElement(list_products).isDisplayed();
    }
    public void addToCart(){
        driver.findElement(product1).click();
    }
}
