package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddEditDeletePositionSteps {
    LeftNav lf = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("User should click on Position")
    public void userShouldClickOnPosition() {
        dc.clickFunction(lf.position);


    }

    @Then("New position")
    public void newPosition() {
        dc.sendKeysFunction(dc.nameInput,"eski");
        dc.sendKeysFunction(dc.shortName,"es");
        dc.clickFunction(dc.saveBtn);
    }

    @And("Search Locations")
    public void searchLocations() {
        dc.sendKeysFunction(dc.searchName,"eski");
        dc.clickFunction(dc.searchButton);

    }

    @And("click to Edit Button Positions")
    public void clickToEditButtonPositions() {
        dc.clickFunction(dc.editImgButton);
        dc.nameInput.clear();
        dc.sendKeysFunction(dc.nameInput,"eskici");
        dc.clickFunction(dc.saveBtn);
    }
}
