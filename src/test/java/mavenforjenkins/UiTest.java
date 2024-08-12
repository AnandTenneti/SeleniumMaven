package mavenforjenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTest {

    @Test
    public void openApplication() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();

    }
  @Test
    public void openNewApplication() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }
}
