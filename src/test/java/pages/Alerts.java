package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static support.TestContext.getDriver;

public class Alerts extends Page {
    public Alerts() {
        url = "https://demoqa.com/alerts";
    }

    public void choseAlertOption(String alertStr){
        getDriver().findElement(By.xpath("//*[text()='" + alertStr + "']/../..//button[@type='button']")).click();
    }

    public boolean isAlertPresent() {
        try {
            getWait().until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (TimeoutException msg) {
            return false;
        }
    }

    public void closeAlert() {
        getWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }
}
