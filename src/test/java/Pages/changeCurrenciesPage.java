package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class changeCurrenciesPage {

    public WebElement currencies(@NotNull WebDriver driver) {
        WebElement x = null;
        x = driver.findElement(By.id("customerCurrency"));
        return (WebElement) x;
    }

    public WebElement currenciesEuro(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));
    }

    public WebElement currenciesDollar(@NotNull WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[1]"));
    }
}
