package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {

    public WebElement gender(@NotNull WebDriver driver) {

        return driver.findElement(By.id("gender-male"));
    }

    public WebElement Firstname(@NotNull WebDriver driver) {

        return driver.findElement(By.name("FirstName"));
    }

    public WebElement LastName(@NotNull WebDriver driver) {

        return driver.findElement(By.name("LastName"));
    }

    public void birthDate(WebDriver driver) {

        String[] DayMonthYear = new String[]{"DateOfBirthDay", "DateOfBirthMonth", "DateOfBirthYear"};
        int[] Birthdate = new int[]{15, 10, 2017};
        for (int i = 0; i <= 2; i++) {

            WebElement V = driver.findElement(By.name(DayMonthYear[i]));
            Select sel = new Select(V);
            sel.selectByValue(String.valueOf(Birthdate[i]));
        }

    } // very Important to find solution to it

    public WebElement Email(@NotNull WebDriver driver) {
        return driver.findElement(By.id("Email"));
    }

    public WebElement companyName(@NotNull WebDriver driver) {
        return driver.findElement(By.id("Company"));
    }

    public WebElement Newsletter(@NotNull WebDriver driver) {
        return driver.findElement(By.name("Newsletter"));
    }

    public WebElement Password(@NotNull WebDriver driver) {
        return driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPassword(@NotNull WebDriver driver) {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton(@NotNull WebDriver driver) {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement registrationSuccessfull(@NotNull WebDriver driver) {
        return driver.findElement(By.className("result"));
    }

//    public WebElement messageColor(@NotNull WebDriver driver) {
//
//        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul"));
//    }

}
