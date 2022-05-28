package stepDefinitions;


import Pages.hoverAndSelectPage;
import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Pages.hoverAndSelectPage.menuItem;
import static Pages.hoverAndSelectPage.menuTap;
import static java.lang.Thread.sleep;

public class hoverAndSelectStepDefinition {
    hoverAndSelectPage work= new hoverAndSelectPage();;
    registrationPage test = new registrationPage();

     Hooks driverAction = new Hooks();


    @When("userRegisterInBackGround")
    public void enterValidData() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        test.gender(Hooks.driver).click();
        sleep(100);
        test.Firstname(Hooks.driver).sendKeys("Thomas");
        sleep(100);
        test.LastName(Hooks.driver).sendKeys("Samir");
        sleep(100);
        test.birthDate(Hooks.driver);
        sleep(100);
        test.Email(Hooks.driver).sendKeys("thomas@thomas.com");
        sleep(100);
        test.companyName(Hooks.driver).sendKeys("tCompany");
        WebElement checkbox = test.Newsletter(Hooks.driver);
        checkbox.click();
        sleep(100);
        test.Password(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(100);
        test.ConfirmPassword(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(100);

    }

    @And("clickOnRegistrationButton")
    public void clickRegisterButton() throws InterruptedException {
        test.registerButton(Hooks.driver).click();
        sleep(500);

    }




    @Given("open link to login")
    public void prerequisites() throws InterruptedException {
        sleep(500);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }

    @And("user login")
    public void enterLoginCredentials() throws InterruptedException {
        work.Email(Hooks.driver).sendKeys("thomas@thomas.com");
        work.Password(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(1000);
    }

    @When("click on loginButton")
    public void clickLoginButton() throws InterruptedException {
        work.loginButton(Hooks.driver).click();
        sleep(500);


    }
    @Then("user hover on tap")
    public void hoverOnTapAction() throws InterruptedException {

        WebElement tab = menuTap((WebDriver) Hooks.driver);
        Actions act = new Actions((WebDriver) Hooks.driver);
        act.moveToElement(tab);
        act.perform();
        sleep(1000);

    } @Then("select a category")
    public void selectCategory() throws InterruptedException {

        menuItem(Hooks.driver).click();

        sleep(1000);

    }




}
