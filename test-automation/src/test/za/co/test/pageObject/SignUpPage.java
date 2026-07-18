package za.co.test.pageObject;

import za.co.test.base.Initilise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends Initilise {
    By firstName = By.id("user[first_name]");


    public void enterFirstName(String firstNameValue) {
        getDriver().findElement(firstName).sendKeys(firstNameValue);

    }
}
