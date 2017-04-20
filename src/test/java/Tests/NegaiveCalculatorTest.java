package Tests;

import Pages.CalculatorPage;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class NegaiveCalculatorTest extends BaseTest {

    WebDriver driver;


    @Test
    public void testNegative() throws InterruptedException {

        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.enterNumber0();
        calculator.add();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());


    }

    @Test
    public void testRoot() throws InterruptedException {

        CalculatorPage calculator = new CalculatorPage(driver);
        calculator.minus();
        calculator.enterNumber6();
        calculator.root();
        calculator.equal();
        Assert.assertEquals(calculator.getResult().toString(), "Error");
        System.out.println("Result is : " + calculator.getResult());

    }

}
