package Tests;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static Helper.Constants.Switch;
import static Helper.Constants.URL;
import static Helper.Constants.newURL;


public class BaseTest {
    static WebDriver driver;

    @Before
    public void runBeforeTestMethod() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get(URL);
        Thread.sleep(5000);
        WebElement switchToEnglish = driver.findElement(By.xpath(Switch)); //switch browser language to English
        switchToEnglish.click();
        Thread.sleep(5000);
        driver.get(newURL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void runAfterTestMethod() {
        driver.close();
        driver.quit();
    }
}



