package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement Email(@NotNull WebDriver driver) {

        return driver.findElement(By.id("Email"));
    }
    public WebElement Password(@NotNull WebDriver driver){

        return driver.findElement(By.id("Password"));
    }
    public WebElement loginButton(@NotNull WebDriver driver){
        return driver.findElement(By.className("login-button"));

    }
    public WebElement message(@NotNull WebDriver driver){
        return driver.findElement(By.className("validation-summary-errors"));


    }
    public WebElement myAccountbutton(@NotNull WebDriver driver){

        return driver.findElement(By.xpath("//a[@href=\"/customer/info\"]"));


    }
}