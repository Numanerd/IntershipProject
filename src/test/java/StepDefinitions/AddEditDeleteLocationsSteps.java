package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddEditDeleteLocationsSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Click on SchoolSetup")
    public void clickOnSchoolSetup()  {
        dc.clickFunction(ln.schoolSetup);

    }

    @And("Click on Locations")
    public void clickOnLocations() {
        dc.clickFunction(ln.locations);
    }


    @Then("new Locations")
    public void newLocations()  {
        dc.sendKeysFunction(dc.nameInput,"ankara");
        dc.sendKeysFunction(dc.shortName,"ank");
        dc.sendKeysFunction(dc.capacity,"10");
        dc.clickFunction(dc.boslukclick);
        dc.clickFunction(dc.saveBtn);

    }

    @And("click to Add Button")
    public void clickToAddButton() {
        dc.clickFunction(dc.addImgButton);
    }

    @And("click to Edit Button")
    public void clickToEditButton() {
        dc.clickFunction(dc.editImgButton);
        dc.nameInput.clear();
        dc.sendKeysFunction(dc.nameInput,"dubai");
        dc.clickFunction(dc.saveBtn);

    }

    @And("click to Delete Button")
    public void clickToDeleteButton() {
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);
    }
}
