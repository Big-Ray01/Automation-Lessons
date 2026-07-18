package za.co.test.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.test.base.Initilise;

import java.time.Duration;

public class SignInPage extends Initilise {

    By createNewAccount = By.xpath("//*[contains(text(),'Create a new account')]");

    public void clickCreateNewAccount() throws InterruptedException {

        WebElement element = getDriver().findElement(createNewAccount);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element);

    }

}
