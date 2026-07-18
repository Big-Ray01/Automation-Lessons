package za.co.test.pageObject;

import org.openqa.selenium.By;
import za.co.test.base.Initilise;

public class LandingPage extends Initilise {
    By loginAutomation = By.xpath("//*[contains(text(),'Login automation')]");

    public void clickLoginAutomation() {
        getDriver().findElement(loginAutomation).click();
    }
}
