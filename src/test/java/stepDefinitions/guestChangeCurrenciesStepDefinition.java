package stepDefinitions;


import Pages.changeCurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import static java.lang.Thread.sleep;

public class guestChangeCurrenciesStepDefinition {

    changeCurrenciesPage test;
    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();

    @Given("normal User navigate")
    public void initiate() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");
        test = new changeCurrenciesPage();


    }

    @And("user switch to dollar and vise versa")
    public void switchBetweenCurrencies() throws InterruptedException {
//     WebElement y = test.currencies(driver);
//        Select x = new Select(y);
//            x.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
//        sleep(5000);
//            x.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");

        test.currenciesEuro(driver).click();
        sleep(3000);
        test.currenciesDollar(driver).click();


    }}
