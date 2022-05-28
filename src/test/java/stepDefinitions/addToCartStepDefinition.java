package stepDefinitions;

import Pages.addToCartPage;
import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Pages.addToCartPage.*;
import static java.lang.Thread.sleep;

public class addToCartStepDefinition {


    addToCartPage test;
    Hooks driverAction = new Hooks();
    registrationPage work = new registrationPage();


    @Then("add valid data for registration")
    public void enterValidData() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        work.gender(Hooks.driver).click();
        sleep(100);
        work.Firstname(Hooks.driver).sendKeys("Thomas");
        sleep(100);
        work.LastName(Hooks.driver).sendKeys("Samir");
        sleep(100);
        work.birthDate(Hooks.driver);
        sleep(100);
        work.Email(Hooks.driver).sendKeys("thomas@thomassamirsamyab.com");
        sleep(100);
        work.companyName(Hooks.driver).sendKeys("tCompany");
        WebElement checkbox = work.Newsletter(Hooks.driver);
        checkbox.click();
        sleep(100);
        work.Password(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(100);
        work.ConfirmPassword(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(100);

    }

    @And("click button")
    public void clickRegisterButton() throws InterruptedException {
        work.registerButton(Hooks.driver).click();
        sleep(500);

    }
    @Then("click  logout tab")
    public void prerequisites1() throws InterruptedException {

        test = new addToCartPage();

        test.logoutTab(Hooks.driver).click();
        sleep(1000);

    }
    @Then("click  login tab")
    public void prerequisites2() throws InterruptedException {

        test = new addToCartPage();

        test.loginTab(Hooks.driver).click();
        sleep(1000);

    }


    @Then("logging user")
    public void enterLoginCredentials() throws InterruptedException {
        test.Email(Hooks.driver).sendKeys("thomas@thomassamirsamyab.com");
        test.Password(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(300);
        test.loginButton(Hooks.driver).click();
        sleep(500);
    }

    @When("hover over tab")
    public void hoverOnTapAction() throws InterruptedException {

        WebElement tab = menuTap((WebDriver) Hooks.driver);
        Actions act = new Actions((WebDriver) Hooks.driver);
        act.moveToElement(tab);
        act.perform();
        sleep(500);

    }

    @And("click category")
    public void selectCategory() throws InterruptedException {

        menuItem(Hooks.driver).click();

        sleep(500);

    }
    @Then("click item")
    public void selectItem() throws InterruptedException {

        itemSelect(Hooks.driver).click();

        sleep(500);

    }
    @Then("add cart")
    public void selectItemToCart() throws InterruptedException {

        itemToCart(Hooks.driver).click();

        sleep(500);

    }
    @Given("open cart list to make sure item exist")
    public void actionOpenCart() throws InterruptedException {

        openCart(Hooks.driver).click();
        sleep(3000);

    }

}

