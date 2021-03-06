package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src\\main\\resources\\features",
        glue = {"stepDefinitions"},
        plugin={"pretty",
                "html:target/cucumber.html",
                "json:target/Cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags="@smoke"



)



public class testRunner extends AbstractTestNGCucumberTests {
}
