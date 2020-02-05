import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class HomeAndStuffHomePageTests {
    public String url = "https://www.homeandstuff.com";
    WebDriver driver;

    @BeforeMethod()
    public void BeforeMet(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    @Test
    public void SearchTest(){

    }

    @AfterMethod()
    public void AfterMet(){
    //driver.close();
    //driver.quit();
    }



}
