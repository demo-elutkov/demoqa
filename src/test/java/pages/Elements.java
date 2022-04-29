package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends Page{
    public Elements() {
        url = "https://demoqa.com/elements";
    }

    @FindBy(xpath="//*[@class='menu-list']//*[text()='Check Box']") // or (//ul[@class='menu-list'])[2]
    private WebElement checkBoxBtn;

    public void clickCheckBox(){
        getWait().until(ExpectedConditions.visibilityOf(checkBoxBtn)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        checkBoxBtn.click();
    }

}
