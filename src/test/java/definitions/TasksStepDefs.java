package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TasksStepDefs {
    Home homePage = new Home();
    CheckBox checkBoxPage = new CheckBox();
    Elements elementsPage = new Elements();
    AlertsWindows alertsWindowsPage = new AlertsWindows();
    Alerts alertsPage = new Alerts();

    @And("I select {string} tile")
    public void iSelectTile(String strTile) {
        switch (strTile.trim().toLowerCase()) {
            case "elements": // home
                getElementsTile(); // call method or homePage.clickElements();
                break;
            case "alerts, frame, & windows": //alerts
                getAlertsFrameWindows(); // call method or homePage.clickAlertsFrameWindows();
                break;
            default:
                throw new Error("Given tile was not found: " + strTile); // or Custom Exception, depends on how framework handles Exception
        }
    }

    private void getElementsTile() {
        homePage.clickElements();
    }

    private void getAlertsFrameWindows() {
        homePage.clickAlertsFrameWindows();
    }

    @And("I select the {string} option from the side menu")
    public void iSelectTheOptionFromTheSideMenu(String sideMenuOptionIn) {
        switch (sideMenuOptionIn.trim().toLowerCase()) {
            case "text box":
                // elements.clickTextBox(); TODO
                break;
            case "check box":
                elementsPage.clickCheckBox();
                break;
            case "alerts":
                alertsWindowsPage.clickAlerts();
                break;
            default:
                throw new Error("Given option was not found: " + sideMenuOptionIn); // or Custom Exception, depends on how framework handles Exception
        }
    }

    @And("I expand the folder tree using the {string} button on the top right corner")
    public void iExpandTheFolderTreeUsingTheButtonOnTheTopRightCorner(String signIn) {
        if (signIn.trim().equals("+")) { // Expand all
            checkBoxPage.clickExpandAll();
        } else if (signIn.trim().equals("-")) { // Collapse all
            checkBoxPage.clickCollapseAll();
        } else {
            throw new Error("Given sign was not found: " + signIn);
        }
    }

    @And("I select the checkbox {string} under Workspace")
    public void iSelectTheCheckboxUnderWorkspace(String strIn) {
        if (strIn.trim().equalsIgnoreCase("react")) {
            // TODO
        } else if (strIn.trim().equalsIgnoreCase("angular")) {
            checkBoxPage.selectAngularInWorkspace();
        } else if (strIn.trim().equalsIgnoreCase("veu")) {
            // TODO
        } else {
            throw new Error("Given file was not found: " + strIn);
        }
    }

    @Then("I verify the Angular selection")
    public void iVerifyTheAngularSelection() {
        assertThat(checkBoxPage.isAngularInWorkspaceSelected()).isTrue();
    }

    @When("I uncheck the Angular checkbox")
    public void iUncheckTheAngularCheckbox() {
        checkBoxPage.uncheckAngularInWorkspace();
    }

    @Then("I verify it is no longer selected")
    public void iVerifyItIsNoLongerSelected() {
        assertThat(checkBoxPage.isAngularInWorkspaceSelected()).isFalse();
    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String strIn) {
        alertsPage.choseAlertOption(strIn);
    }

    @Then("I verify the alert pop up has appeared")
    public void iVerifyTheAlertPopUpHasAppeared() {
        assertThat(alertsPage.isAlertPresent()).isTrue();
    }

    @And("I close the alert")
    public void iCloseTheAlert() {
        alertsPage.closeAlert();
    }
}
