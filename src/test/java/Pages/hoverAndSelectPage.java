package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class hoverAndSelectPage {
    public WebElement Email(@NotNull WebDriver driver) {

            return driver.findElement(By.id("Email"));
    }
    public WebElement Password(@NotNull WebDriver driver) {

        return driver.findElement(By.id("Password"));

    }
    public WebElement loginButton(@NotNull WebDriver driver){
        return driver.findElement(By.className("login-button"));

    }
    public static WebElement menuTap(@NotNull WebDriver driver){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
    }
    public static WebElement menuItem(@NotNull WebDriver driver){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a"));
    }

}
