package stepDefinitions;

import Pages.addToWishListPage;
import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Pages.addToWishListPage.*;
import static java.lang.Thread.sleep;

public class addToWishListStepDefinition {
    addToWishListPage test;
    registrationPage work = new registrationPage();

    @Then("add valid data in registration")
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

    @And("click on  button")
    public void clickRegisterButton() throws InterruptedException {
        work.registerButton(Hooks.driver).click();
        sleep(500);

    }
    @Then("click on logout tab")
    public void prerequisites1() throws InterruptedException {

        test = new addToWishListPage();

        test.logoutTab(Hooks.driver).click();
        sleep(1000);

    }
    @Then("click on login tab")
    public void prerequisites2() throws InterruptedException {

        test = new addToWishListPage();

        test.loginTab(Hooks.driver).click();
        sleep(1000);

    }


    @Then("login as user")
    public void enterLoginCredentials() throws InterruptedException {
        test.Email(Hooks.driver).sendKeys("thomas@thomassamirsamyab.com");
        test.Password(Hooks.driver).sendKeys("P@ssw0rd");
        sleep(300);
        test.loginButton(Hooks.driver).click();
        sleep(500);
    }
   /* @When("hover on tab")
    public void wishListHomePageAction() throws InterruptedException{
        List<WebElement> x = test.wishListHomePage(Hooks.driver);
        x.get(0).click();
        sleep(5000);
    }*/


    @When("hover on tab")
    public void hoverOnTapAction() throws InterruptedException {

        WebElement tab = menuTap(Hooks.driver);
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(tab);
        act.perform();
        sleep(500);

    }

    @And("click on category")
    public void selectCategory() throws InterruptedException {

        menuItem(Hooks.driver).click();

        sleep(1000);

    }

    @Then("click on item")
    public void selectItem() throws InterruptedException {

        itemSelect(Hooks.driver).click();

        sleep(1000);

    }
    @Then("add to wishlist")
    public void addWishList() throws InterruptedException {

        itemWishlist(Hooks.driver).click();

        sleep(1000);

    }
    @And("assert adding to wish list")
    public void assertAddingToWishList() throws InterruptedException {
        sleep(2000);
      Assert.assertTrue(selectBarNotification(Hooks.driver).isDisplayed(), "true");

        sleep(3000);

    }
    @Given("open wish list to make sure item exist")
    public void openWishList() throws InterruptedException {

        openWishlist(Hooks.driver).click();
        sleep(3000);

    }


}
