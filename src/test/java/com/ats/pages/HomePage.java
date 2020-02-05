package com.ats.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 50, 50);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@name='username']")
    private WebElement ebUserName;

    @FindBy(xpath = "//*[@name='password']")
    WebElement ebPassword;

    @FindBy(xpath = "//*[@id='root']//*/button[@type='submit']")
    WebElement btnLogin;

    public void login(String userName, String password) {
        wait.until(ExpectedConditions.visibilityOf(ebUserName)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(ebPassword)).clear();
        wait.until(ExpectedConditions.visibilityOf(ebPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(btnLogin)).click();
    }

}
