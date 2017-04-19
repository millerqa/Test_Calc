package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Helper.Constants.*;

public class CalculatorPage {

    public WebDriver driver;


    public CalculatorPage(WebDriver driver) {

        this.driver = driver;
    }


    public void enterNumber0(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton0)));
        fieldNumber.click();
    }

    public void enterNumber1(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton1)));
        fieldNumber.click();
    }

    public void enterNumber2(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton2)));
        fieldNumber.click();
    }

    public void enterNumber3(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton3)));
        fieldNumber.click();
    }

    public void enterNumber4(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton4)));
        fieldNumber.click();
    }

    public void enterNumber5(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton5)));
        fieldNumber.click();
    }

    public void enterNumber6(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton6)));
        fieldNumber.click();
    }

    public void enterNumber7(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton7)));
        fieldNumber.click();
    }

    public void enterNumber8(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton8)));
        fieldNumber.click();
    }
    public void enterNumber9(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement fieldNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(numButton9)));
        fieldNumber.click();
    }


    public void add(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add)));
        addButton.click();

    }
    public void minus(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(minus)));
        addButton.click();

    }

    public void multiply(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(multiply)));
        addButton.click();

    }

    public void divide(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(divide)));
        addButton.click();

    }

    public void root(){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(root)));
        addButton.click();

    }

    public void equal(){

        WebElement equalButton = driver.findElement(By.id(equal));
        equalButton.click();
    }

    public String getResult(){

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(result)));
        String result = resultField.getText();
        return result;
    }

}

