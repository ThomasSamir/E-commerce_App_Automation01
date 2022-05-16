package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class followUsPage {
    public WebElement findFacebook(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement findTwitter(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"] "));
    }

    public WebElement findNews(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"] "));
    }

    public WebElement findYoutupe(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
