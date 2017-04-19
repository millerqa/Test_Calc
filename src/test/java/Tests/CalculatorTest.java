package Tests;
import Pages.CalculatorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Helper.Constants.Switch;
import static Helper.Constants.URL;
import static Helper.Constants.newURL;


public class CalculatorTest{

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


    @Test
    public void testPositive() throws InterruptedException {

        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber2();
        calculator.add();
        calculator.enterNumber4();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "6");
        System.out.println("Result is : " + calculator.getResult());

    }

    @Test
    public void testMinus(){
        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber2();
        calculator.minus();
        calculator.enterNumber1();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "1");
        System.out.println("Result is : " + calculator.getResult());
    }

    @Test
    public void testMultiply(){
        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber2();
        calculator.multiply();
        calculator.enterNumber2();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "4");
        System.out.println("Result is : " + calculator.getResult());

    }

    @Test
    public void testNegative(){
        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber0();
        calculator.add();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());

    }

    @Test
    public void testRoot(){
        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.minus();
        calculator.enterNumber6();
        calculator.root();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());
    }


}