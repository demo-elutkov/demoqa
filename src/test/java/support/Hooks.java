package support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;
import static support.TestContext.getDriver;

public class Hooks {

    @Before(order = 0)
    public void scenarioStart() {
        TestContext.initialize();
        getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
    }

    @After(order = 0)
    public void scenarioEnd(Scenario scenario) {
        TestContext.teardown();
    }
}
