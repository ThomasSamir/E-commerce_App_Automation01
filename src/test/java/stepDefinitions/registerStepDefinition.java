package stepDefinitions;

import Pages.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterTest;

import static java.lang.Thread.sleep;

public class registerStepDefinition {

    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();
    registrationPage test = null;

    @Given("open browser")
    public void prerequisites() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        test = new registrationPage();
    }

    @When("enter valid registration data")
    public void enterValidData() throws InterruptedException {


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

    @And("click on registration button")
    public void clickRegisterButton() throws InterruptedException {
        test.registerButton(driver).click();
        sleep(500);

    }

    @Then("successful registration")
    public void checkRegister() throws InterruptedException {

        Assert.assertEquals("error", "Your registration completed", test.registrationSuccessfull(driver).getText());
        sleep(100);
    }

    @And("check color")
    public void checkColor() throws InterruptedException {

        Color color = null;
        color = new Color(76, 177, 124, 1);

        Assert.assertEquals("errorWrongColor \n", color.asRgba(), test.messageColor(driver).getCssValue("color"));
        sleep(100);

    }

}
