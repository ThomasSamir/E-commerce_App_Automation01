package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sliderWapperPage {

    public WebElement sliderOnLeft(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }
    public WebElement sliderOnRight(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }
    public WebElement sliderClick(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
    }

}
