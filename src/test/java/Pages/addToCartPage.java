package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.jetbrains.annotations.NotNull;

public class addToCartPage {


    public WebElement Email(@NotNull WebDriver driver) {

        return driver.findElement(By.id("Email"));
    }

    public WebElement Password(@NotNull WebDriver driver) {

        return driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(@NotNull WebDriver driver) {
        return driver.findElement(By.className("login-button"));
    }

    public WebElement loginTab(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }

    public WebElement logoutTab(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }

    public WebElement message(@NotNull WebDriver driver) {
        return driver.findElement(By.className("validation-summary-errors"));


    }

    public WebElement myAccountbutton(@NotNull WebDriver driver) {

        return driver.findElement(By.xpath("//a[@href=\"/customer/info\"]"));


    }

    public static WebElement menuTap(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
    }

    public static WebElement menuItem(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a"));
    }

    public static WebElement itemSelect(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img"));
    }

    public static WebElement itemToCart(@NotNull WebDriver driver) {
        return driver.findElement(By.id("add-to-cart-button-14"));
    }

    public static WebElement openCart(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class=\"cart-label\"]"));
    }
}


