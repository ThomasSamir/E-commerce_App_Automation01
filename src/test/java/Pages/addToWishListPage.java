package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addToWishListPage {
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

    public WebElement myAccountButton(@NotNull WebDriver driver) {

        return driver.findElement(By.xpath("//a[@href=\"/customer/info\"]"));


    }

    public List<WebElement> wishListHomePage(@NotNull WebDriver driver) {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
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

    public static WebElement itemWishlist(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-14\"]"));
    }

    public static WebElement openWishlist(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href=\"/wishlist\"]"));
    }

    public static WebElement selectBarNotification(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
    }
}