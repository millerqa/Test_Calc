package Tests;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {

    static WebDriver driver;

    @Before
    public void beforeMethod(){
    driver = new FirefoxDriver();
}

    @After
        public void afterMethod(){


        }

    }




