package com.ats.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DashBoardPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    //private Robot robot;


    public DashBoardPage(WebDriver driver) {
        this.driver = driver;

        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 50, 50);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@href='/createNewProject']")
    private WebElement btnCreateNewProject;

    @FindBy(xpath = "//*[@class='MuiTypography-root-945 MuiTypography-h6-955 MuiTypography-noWrap-964']")
    WebElement txtDashboard;

    @FindBy(xpath = "//label[text()='Project Name *']//following::input")
    WebElement ebProjectName;

    @FindBy(xpath = "//label[text()='Country *']//following::input")
    WebElement cbCountry;

    @FindBy(xpath = "//label[text()='State/Province *']//following::input")
    WebElement ebState;

    @FindBy(xpath = "//label[text()='City *']//following::input")
    WebElement ebCity;

    @FindBy(xpath = "//label[text()='Bid Date *']//following::input")
    WebElement ebBidDate;

    @FindBy(xpath = "//label[text()='Area (in sq. ft.) *']//following::input")
    WebElement ebArea;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnNext;

    @FindBy(xpath = "//p[text()='Commercial']")
    WebElement btnCommercial;

    @FindBy(xpath = "//input[@value='Map { \"id\": 13, \"value\": \"Entertainment Center\" }']")
    WebElement rbType;

    @FindBy(xpath = "//span[text()='Finish']")
    WebElement btnFinish;

    public void NewProject(String ProjectName,String Country,String State,String City,String BidDate,String Area) throws AWTException {

        wait.until(ExpectedConditions.visibilityOf(btnCreateNewProject)).click();
        wait.until(ExpectedConditions.visibilityOf(ebProjectName)).sendKeys(ProjectName);
        wait.until(ExpectedConditions.visibilityOf(cbCountry)).sendKeys(Country);
        wait.until(ExpectedConditions.visibilityOf(ebState)).sendKeys(State);
        wait.until(ExpectedConditions.visibilityOf(ebBidDate)).sendKeys(BidDate);
        wait.until(ExpectedConditions.visibilityOf(ebArea)).sendKeys(Area);
        wait.until(ExpectedConditions.visibilityOf(ebCity)).sendKeys(City);
        wait.until(ExpectedConditions.visibilityOf(btnNext)).click();
        wait.until(ExpectedConditions.visibilityOf(btnCommercial)).click();
        js.executeScript("window.scrollBy(0,1000)"); //Scroll vertically down by 1000 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(200,300)");
        Robot robot = new Robot();
        // Simulate key Events
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_SPACE);
        rbType.click();
        wait.until(ExpectedConditions.visibilityOf(btnNext)).click();
        wait.until(ExpectedConditions.visibilityOf(btnFinish)).click();
    }

}
