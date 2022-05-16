package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchByNameSkuPage {

    public WebElement searchField(@NotNull WebDriver driver) {

        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(@NotNull WebDriver driver) {

        return driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }
    public static WebElement itemMove(@NotNull WebDriver driver){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]"));
    }
}
