package stepDefinitions;

import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import static java.lang.Thread.sleep;

public class registerStepDefinition {

    Hooks driverAction = new Hooks();
    registrationPage test = null;

    @Given("open browser")
    public void prerequisites() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        test = new registrationPage();
    }

    @When("enter valid registration data")
    public void enterValidData() throws InterruptedException {


        test.gender(Hooks.driver).click();
        sleep(100);
        test.Firstname(Hooks.driver).sendKeys("Thomas");
        sleep(100);
        test.LastName(Hooks.driver).sendKeys("Samir");
        sleep(100);
        test.birthDate(Hooks.driver);
        sleep(100);
        test.Email(Hooks.driver).sendKeys("thomas@thosmass.com");
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

    @And("click on registration button")
    public void clickRegisterButton() throws InterruptedException {
        test.registerButton(Hooks.driver).click();
        sleep(500);

    }

    @Then("successful registration")
    public void checkRegister() throws InterruptedException {

        Assert.assertEquals("Error this account already exists", "Your registration completed", test.registrationSuccessfull(Hooks.driver).getText());
        sleep(100);
    }

    @And("check color")
    public void checkColor() throws InterruptedException {

        Color color = null;
        color = new Color(76, 177, 124, 1);

        Assert.assertEquals("\n errorWrongColor \n", color.asRgba(), test.registrationSuccessfull(Hooks.driver).getCssValue("color"));
        sleep(100);

    }

}
