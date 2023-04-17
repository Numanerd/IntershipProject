package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEditDeletePositionCategoriesStep {
    DialogContent dc = new DialogContent();



    LeftNav ln = new LeftNav();


    @Given("User should click on HumanResources on LeftNav")
    public void UserShouldClickOnHumanResourcesOnLeftNav() {
        ln.clickFunction(ln.HumanResources);

    }

    @When("User should click on Setup")
    public void userShouldClickOnSetup() {
        ln.clickFunction(ln.HumanResourcesSetup);

    }
    @And("User should click on Position Categories")
    public void userShouldClickOnPositionCategories() {
        ln.clickFunction(ln.PositionCategories);
    }

    @Then("User should click on Add button")
    public void userShouldClickOnAddButton() {
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "Selin");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();


    }


    @And("User should click on Edit button")
    public void userShouldClickOnEditButton() {

        dc.clickFunction(dc.searchName);
        dc.sendKeysFunction(dc.searchName, "Selin");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.nameInput, "SelinTopal");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();


    }

    @Then("User should click on Delete button")
    public void userShouldClickOnDeleteButton() {

        dc.clickFunction(dc.searchName);
        dc.searchName.clear();
        dc.sendKeysFunction(dc.searchName,"SelinTopal");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);



    }


}

