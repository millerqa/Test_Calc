package Tests;

import Pages.CalculatorPage;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class NegaiveCalculatorTest {

    WebDriver driver;


    @Test
    public void testNegative() throws InterruptedException {
        BaseTest run = new BaseTest();
        run.runBeforeTestMethod();
        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber0();
        calculator.add();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());
        run.runAfterTestMethod();

    }

    @Test
    public void testRoot() throws InterruptedException {

        BaseTest run = new BaseTest();
        CalculatorPage calculator = new CalculatorPage(driver);
        run.runBeforeTestMethod();
        calculator.minus();
        calculator.enterNumber6();
        calculator.root();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());
        run.runAfterTestMethod();
    }

}
