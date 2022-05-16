package stepDefinitions;

import Pages.searchByNameSkuPage;
import Pages.sliderWapperPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class sliderWapperStepDefinition {

    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();
    sliderWapperPage test = null;

    @Given("open browser for slider wrapper")
    public void openBrowser() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");

        test = new sliderWapperPage();
        sleep(2000);
    }

    @And("click on slider wrapper on left")
    public void clickSliderOnLeft() throws InterruptedException {
        test.sliderOnLeft(driver).click();
        sleep(1000);


    }

    @And("click on slider wrapper on right")
    public void clickSliderOnRight() throws InterruptedException {
        test.sliderOnRight(driver).click();
        sleep(3000);


    }
    @Then("user click on slider wrapper")
    public void clickSlider() throws InterruptedException {
        test.sliderClick(driver).click();
        sleep(5000);


    }
}
