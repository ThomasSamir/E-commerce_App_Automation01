package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    static WebDriver driver = null;

    public static @NotNull WebDriver initializeDriver(){

        driver =new ChromeDriver();
        return driver;
    }

     @Before
public void openBrowser(){

        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path);

    }
    @After
    public void closeBrowser(){

        driver.quit();
    }
}
