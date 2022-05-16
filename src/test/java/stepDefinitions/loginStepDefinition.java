package stepDefinitions;

import Pages.loginPage;

import Pages.registrationPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class loginStepDefinition {

    loginPage test;
    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();

    @Given("open link for login")
    public void prerequisites() throws InterruptedException {

        test = new loginPage();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");


    }

    @And("^enter valid data \"(.*)\"and\"(.*)\"$")
    public void enterLoginCredentials(String username, String password) throws InterruptedException {
        test.Email(driver).sendKeys(username);
        test.Password(driver).sendKeys(password);
        sleep(300);
    }

    @Then("click on login button")
    public void clickLoginButton() throws InterruptedException {
        test.loginButton(driver).click();
        sleep(500);


    }

    @And("check account tab exists")
    public void tabExistance() throws InterruptedException {
        Assert.assertEquals("Button Doesn't Exists \n", test.myAccountbutton(driver).getText(), "My account");
    }
}