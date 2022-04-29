package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AlertsWindows extends Page{
    public AlertsWindows() {
        url = "https://demoqa.com/alertsWindows";
    }

    @FindBy(xpath="//*[@class='menu-list']//*[text()='Alerts']")
    private WebElement alertsBtn;

    public void clickAlerts(){
        getWait().until(ExpectedConditions.visibilityOf(alertsBtn));
        clickWithJS(alertsBtn);
    }


}
