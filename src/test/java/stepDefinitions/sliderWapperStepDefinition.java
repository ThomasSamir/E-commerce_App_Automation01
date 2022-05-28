package stepDefinitions;

import Pages.sliderWapperPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static java.lang.Thread.sleep;

public class sliderWapperStepDefinition {

    Hooks driverAction = new Hooks();
    sliderWapperPage test = null;

    @Given("open browser for slider wrapper")
    public void openBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

        test = new sliderWapperPage();
        sleep(2000);
    }

    @And("click on slider wrapper on left")
    public void clickSliderOnLeft() throws InterruptedException {
        test.sliderOnLeft(Hooks.driver).click();
        sleep(1000);


    }

    @And("click on slider wrapper on right")
    public void clickSliderOnRight() throws InterruptedException {
        test.sliderOnRight(Hooks.driver).click();
        sleep(3000);


    }
    @Then("user click on slider wrapper")
    public void clickSlider() throws InterruptedException {
        test.sliderClick(Hooks.driver).click();
        sleep(5000);


    }
}
