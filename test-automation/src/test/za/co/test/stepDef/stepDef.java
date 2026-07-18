package za.co.test.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import za.co.test.base.Initilise;
import za.co.test.pageObject.LandingPage;
import za.co.test.pageObject.SignInPage;
import za.co.test.pageObject.SignUpPage;

public class stepDef extends Initilise {
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    LandingPage landingPage = new LandingPage();

    @Given("the user is on the automation lessons page using {string}")
    public void theUserIsOnTheAutomationLessonsPageUsing(String browser) {
        initialise(browser);
        getDriver().get("https://ultimateqa.com/automation");
    }

    @When("the user clicks on login Automation")
    public void theUserClicksOnLoginAutomation() {
        landingPage.clickLoginAutomation();
    }

    @Then("the user clicks on signUp")
    public void theUserClicksOnSignUp() throws InterruptedException {
        signInPage.clickCreateNewAccount();
    }

    @Then("the user enter the {string}")
    public void theUserEnterThe(String firstName) {
        signUpPage.enterFirstName(firstName);
    }

    @After
    public void tearDown() {
        getDriver().quit();  // closes all windows and ends session
    }

}
