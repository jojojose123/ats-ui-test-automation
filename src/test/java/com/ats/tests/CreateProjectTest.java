package com.ats.tests;

import com.ats.data.providers.DataProviders;
import com.ats.pages.DashBoardPage;
import com.ats.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.awt.*;

public class CreateProjectTest {
    public String url = "https://spec.atsspecsolutions.com/login?redirect=%2F";
    public HomePage objHomePage;
    public DashBoardPage objDashBoardPage;
    WebDriver driver;

    @BeforeMethod()
    public void BeforeMet(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test(dataProvider = "data-provider-create-new-project", dataProviderClass = DataProviders.class)
    public void CreateProject(String userName, String password,String ProjectName,String Country,String State,String City,String BidDate,String Area) throws AWTException {
        String verify = "Completed";
        objHomePage = new HomePage(driver);
        objHomePage.login(userName,password);

        objDashBoardPage = new DashBoardPage(driver);
        objDashBoardPage.NewProject(ProjectName,Country,State,City,BidDate,Area);
        Assert.assertEquals(verify,"Completed");
    }

    @AfterMethod()
    public void AfterMet(){
        driver.quit();
    }



}
