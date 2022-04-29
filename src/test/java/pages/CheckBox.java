package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckBox extends Page{
    public CheckBox() {
        url = "https://demoqa.com/checkbox";
    }

    @FindBy(xpath="//*[@title='Expand all']")
    private WebElement expandAll;

    @FindBy(xpath="//*[@title='Collapse all']")
    private WebElement collapseAll;

    @FindBy(xpath="//input[@id='tree-node-angular']/..") // or //input[@id='tree-node-workspace']/ancestor::li[1]//label[@for='tree-node-angular']
    private WebElement angularLabel;

    @FindBy(xpath="//input[@id='tree-node-angular']") // or //input[@id='tree-node-workspace']/ancestor::li[1]//input[@id='tree-node-angular']
    private WebElement angularInput;

    public void clickExpandAll(){
        getWait().until(ExpectedConditions.visibilityOf(expandAll)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        expandAll.click();
    }

    public void clickCollapseAll(){
        getWait().until(ExpectedConditions.visibilityOf(collapseAll)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        collapseAll.click();
    }

    public void selectAngularInWorkspace(){
        getWait().until(ExpectedConditions.visibilityOf(angularLabel)); // explicit wait, depends on what the wait strategy (implicit/explicit)
        angularLabel.click();
    }

    public void uncheckAngularInWorkspace(){
        selectAngularInWorkspace();
    }

    public boolean isAngularInWorkspaceSelected(){
        return angularInput.isSelected();
    }
}
