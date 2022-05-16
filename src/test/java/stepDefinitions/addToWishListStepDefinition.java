package stepDefinitions;

import Pages.addToWishListPage;
import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Pages.addToWishListPage.*;
import static java.lang.Thread.sleep;

public class addToWishListStepDefinition {
    addToWishListPage test;
    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();
    registrationPage work = new registrationPage();

    @Then("add valid data in registration")
    public void enterValidData() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        work.gender(driver).click();
        sleep(100);
        work.Firstname(driver).sendKeys("Thomas");
        sleep(100);
        work.LastName(driver).sendKeys("Samir");
        sleep(100);
        work.birthDate(driver);
        sleep(100);
        work.Email(driver).sendKeys("thomas@thomassamirsamyab.com");
        sleep(100);
        work.companyName(driver).sendKeys("tCompany");
        WebElement checkbox = work.Newsletter(driver);
        checkbox.click();
        sleep(100);
        work.Password(driver).sendKeys("P@ssw0rd");
        sleep(100);
        work.ConfirmPassword(driver).sendKeys("P@ssw0rd");
        sleep(100);

    }

    @And("click on  button")
    public void clickRegisterButton() throws InterruptedException {
        work.registerButton(driver).click();
        sleep(500);

    }
    @Then("click on logout tab")
    public void prerequisites1() throws InterruptedException {

        test = new addToWishListPage();

        test.logoutTab(driver).click();
        sleep(1000);

    }
    @Then("click on login tab")
    public void prerequisites2() throws InterruptedException {

        test = new addToWishListPage();

        test.loginTab(driver).click();
        sleep(1000);

    }


    @Then("login as user")
    public void enterLoginCredentials() throws InterruptedException {
        test.Email(driver).sendKeys("thomas@thomassamirsamyab.com");
        test.Password(driver).sendKeys("P@ssw0rd");
        sleep(300);
        test.loginButton(driver).click();
        sleep(500);
    }

    @When("hover on tab")
    public void hoverOnTapAction() throws InterruptedException {

        WebElement tab = menuTap((WebDriver) driver);
        Actions act = new Actions((WebDriver) driver);
        act.moveToElement(tab);
        act.perform();
        sleep(500);

    }

    @And("click on category")
    public void selectCategory() throws InterruptedException {

        menuItem(driver).click();

        sleep(500);

    }
    @Then("click on item")
    public void selectItem() throws InterruptedException {

        itemSelect(driver).click();

        sleep(500);

    }
    @Then("add to wishlist")
    public void addWishList() throws InterruptedException {

        itemWishlist(driver).click();

        sleep(500);

    }
    @Given("open wish list to make sure item exist")
    public void openWishList() throws InterruptedException {

        openWishlist(driver).click();
        sleep(3000);

    }

}
