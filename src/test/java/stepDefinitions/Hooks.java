package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {


    static public WebDriver driver ;
    @Before
    public void openBrowser(){
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path);
        ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser(){

        driver.quit();
    }
}
