package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
        features = "src/test/resources/features",
        glue = {"definitions", "support"},
        tags = "@task1 and task2" // same as VM option -Dcucumber.options="--tags @predefined"
)
public class TestRunner {
    @BeforeClass
    public static void setup() {
    }

    @AfterClass
    public static void teardown() {
    }
}
