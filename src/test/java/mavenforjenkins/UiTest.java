package mavenforjenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UiTest {
    WebDriver driver = null;


    @Parameters("Browser")
    @BeforeMethod
    public void browserSetUp(String browserName) {
        System.out.println("Parameter value is " + browserName);
        if (browserName.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @Test
    public void openApplication() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    public void openNewApplication() {
        driver.get("https://www.facebook.com");
        Assert.assertTrue(driver.getTitle().contains("Facebook"));
    }
    @Test
    public void openAnotherNewApplication() {
        driver.get("https://www.gmail.com");
        Assert.assertTrue(driver.getTitle().contains("Gmail"));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
