package stepDefinitions;

import Pages.followUsPage;
import Pages.sliderWapperPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.awt.*;

import static java.lang.Thread.sleep;

public class followUsStepDefinition {
    Hooks driverAction = new Hooks();
    WebDriver driver = driverAction.initializeDriver();
    followUsPage test = null;

    @Given("open browser check social media icons")
    public void openBrowser() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");

        test = new followUsPage();
        sleep(3000);
    }

    @And("follow us on facebook")
    public void clickOnFacebook() throws InterruptedException {

        test.findFacebook(driver).click();
        sleep(3000);
    }

    @And("follow us on twitter")
    public void clickOnTwitter() throws InterruptedException {

        test.findTwitter(driver).click();
        sleep(1000);
    }

    @And("click on news")
    public void clickOnNews() throws InterruptedException {

        String path = driver.getCurrentUrl();
        test.findNews(driver).click();
        System.out.println(path);
        driver.switchTo().newWindow(WindowType.TAB);
        sleep(1000);
        driver.navigate().to(path);
        sleep(3000);


    }

    @And("follow us on youtube")
    public void clickOnYouTube() throws InterruptedException {

        test.findYoutupe(driver).click();
        sleep(50000);
    }



}
