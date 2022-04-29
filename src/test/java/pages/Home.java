package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends Page{
    public Home() {
        url = "https://demoqa.com/";
    }

    @FindBy(xpath="//*[text()='Elements']/preceding::div[@class='card-up'][1]")
    private WebElement elementsTile;

    @FindBy(xpath="//*[text()='Alerts, Frame & Windows']/preceding::div[@class='card-up'][1]")
    private WebElement alertsFrameWindowsTile;

    public void clickElements(){
        getWait().until(ExpectedConditions.visibilityOf(elementsTile)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        elementsTile.click();
    }

    public void clickAlertsFrameWindows(){
        getWait().until(ExpectedConditions.visibilityOf(alertsFrameWindowsTile)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        alertsFrameWindowsTile.click();
    }


}
