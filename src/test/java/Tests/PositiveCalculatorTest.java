package Tests;
import Pages.CalculatorPage;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;



public class PositiveCalculatorTest extends BaseTest {

        WebDriver driver;


    @Test
    public void testAdd() throws InterruptedException {

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

}

