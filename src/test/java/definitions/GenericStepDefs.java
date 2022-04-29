package definitions;

import io.cucumber.java.en.Given;
import pages.*;

public class GenericStepDefs {
    @Given("I navigate to {string} page")
    // Also, we can use Map<String, String> pageBook
    // or other data source (file, Db link)
    public void iNavigateToPage(String page) {
        switch (page.trim().toLowerCase()) {
            case "demoqa": // home
                new Home().open();
                break;
            case "elements":
                new Elements().open();
                break;
            case "checkbox":
                new CheckBox().open();
                break;
            case "alerts windows":
                new AlertsWindows().open();
                break;
            case "alerts":
                new Alerts().open();
                break;
            default:
                throw new Error("Unsupported page: " + page); // or Custom Exception, depends on how framework handles Exception
        }
    }
}
