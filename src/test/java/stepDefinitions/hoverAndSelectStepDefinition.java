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
import org.openqa.selenium.support.ui.Select;

import static Pages.hoverAndSelectPage.menuItem;
import static Pages.hoverAndSelectPage.menuTap;
import static java.lang.Thread.sleep;

public class hoverAndSelectStepDefinition {
    hoverAndSelectPage work= new hoverAndSelectPage();;
    registrationPage test = new registrationPage();

     Hooks driverAction = new Hooks();
     WebDriver driver = driverAction.initializeDriver();


    @When("userRegisterInBackGround")
    public void enterValidData() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        test.gender(driver).click();
        sleep(100);
        test.Firstname(driver).sendKeys("Thomas");
        sleep(100);
        test.LastName(driver).sendKeys("Samir");
        sleep(100);
        test.birthDate(driver);
        sleep(100);
        test.Email(driver).sendKeys("thomas@thomas.com");
        sleep(100);
        test.companyName(driver).sendKeys("tCompany");
        WebElement checkbox = test.Newsletter(driver);
        checkbox.click();
        sleep(100);
        test.Password(driver).sendKeys("P@ssw0rd");
        sleep(100);
        test.ConfirmPassword(driver).sendKeys("P@ssw0rd");
        sleep(100);

    }

    @And("clickOnRegistrationButton")
    public void clickRegisterButton() throws InterruptedException {
        test.registerButton(driver).click();
        sleep(500);

    }




    @Given("open link to login")
    public void prerequisites() throws InterruptedException {
        sleep(500);
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }

    @And("user login")
    public void enterLoginCredentials() throws InterruptedException {
        work.Email(driver).sendKeys("thomas@thomas.com");
        work.Password(driver).sendKeys("P@ssw0rd");
        sleep(1000);
    }

    @When("click on loginButton")
    public void clickLoginButton() throws InterruptedException {
        work.loginButton(driver).click();
        sleep(500);


    }
    @Then("user hover on tap")
    public void hoverOnTapAction() throws InterruptedException {

        WebElement tab = menuTap((WebDriver) driver);
        Actions act = new Actions((WebDriver) driver);
        act.moveToElement(tab);
        act.perform();
        sleep(1000);

    } @Then("select a category")
    public void selectCategory() throws InterruptedException {

        menuItem(driver).click();

        sleep(1000);

    }




}
