package stepDefinitions;

import Pages.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class loginStepDefinition {

    loginPage test;
    Hooks driverAction = new Hooks();

    @Given("open link for login")
    public void prerequisites() throws InterruptedException {

        test = new loginPage();
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");


    }

    @And("^enter valid data \"(.*)\"and\"(.*)\"$")
    public void enterLoginCredentials(String username, String password) throws InterruptedException {
        test.Email(Hooks.driver).sendKeys(username);
        test.Password(Hooks.driver).sendKeys(password);
        sleep(300);
    }

    @Then("click on login button")
    public void clickLoginButton() throws InterruptedException {
        test.loginButton(Hooks.driver).click();
        sleep(500);


    }

    @And("check account tab exists")
    public void tabExistence() throws InterruptedException {
        Assert.assertEquals("Button Doesn't Exists \n", test.myAccountbutton(Hooks.driver).getText(), "My account");
    }
}