package stepDefinitions;

import Pages.followUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WindowType;

import static java.lang.Thread.sleep;

public class followUsStepDefinition {
    Hooks driverAction = new Hooks();
    followUsPage test = null;

    @Given("open browser check social media icons")
    public void openBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

        test = new followUsPage();
        sleep(3000);
    }

    @And("follow us on facebook")
    public void clickOnFacebook() throws InterruptedException {

        test.findFacebook(Hooks.driver).click();
        sleep(3000);
    }

    @And("follow us on twitter")
    public void clickOnTwitter() throws InterruptedException {

        test.findTwitter(Hooks.driver).click();
        sleep(1000);
    }

    @And("click on news")
    public void clickOnNews() throws InterruptedException {

        String path = Hooks.driver.getCurrentUrl();
        test.findNews(Hooks.driver).click();
        System.out.println(path);
        Hooks.driver.switchTo().newWindow(WindowType.TAB);
        sleep(1000);
        Hooks.driver.navigate().to(path);
        sleep(3000);


    }

    @And("follow us on youtube")
    public void clickOnYouTube() throws InterruptedException {

        test.findYoutupe(Hooks.driver).click();
        sleep(4000);
    }



}
