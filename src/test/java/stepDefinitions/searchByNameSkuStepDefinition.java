package stepDefinitions;

import Pages.registrationPage;
import Pages.searchByNameSkuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.*;

import static java.awt.SystemColor.window;
import static java.lang.Thread.sleep;

public class searchByNameSkuStepDefinition {
    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();
    searchByNameSkuPage test = null;

    @Given("open browser for search")
    public void openBrowser() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");

        test = new searchByNameSkuPage();
        sleep(2000);
    }

    @And("enter product name in search field")
    public void enterDataClickEnter() throws InterruptedException {
        test.searchField(driver).sendKeys("HTC One M8 Android L 5.0 Lollipop");
        test.searchField(driver).sendKeys(Keys.ENTER);
        sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,400)");

    }

    @And("enter product SKU in search field")
    public void enterSkuClickEnter() throws InterruptedException {
        test.searchField(driver).sendKeys("M8_HTC_5L");
        test.searchField(driver).sendKeys(Keys.ENTER);
        sleep(3000);
    }


}
