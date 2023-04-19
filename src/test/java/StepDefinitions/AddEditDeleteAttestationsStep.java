package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEditDeleteAttestationsStep {



    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();



    @Given("User should click on HumanResources")
    public void userShouldClickOnHumanResources() {
        ln.clickFunction(ln.HumanResources);

    }

    @When("User should click on Setup value")
    public void userShouldClickOnSetupValue() {
        ln.clickFunction(ln.HumanResourcesSetup);

    }

    @And("User should click on Attestations")
    public void userShouldClickOnAttestations() {
        ln.clickFunction(ln.Attestations);

    }

    @Then("User should click on Add button to Add")
    public void userShouldClickOnAddButtonToAdd() {
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput,"Serkan");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();

    }

    @Then("User should click on Edit button to Edit")
    public void userShouldClickOnEditButtonToEdit() {
        dc.clickFunction(dc.searchName);
        dc.sendKeysFunction(dc.searchName,"Serkan");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.nameInput,"SerkanDalli");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();

    }

    @Then("User should click on Delete button to Delete")
    public void userShouldClickOnDeleteButtonToDelete() {
        dc.clickFunction(dc.searchName);
        dc.searchName.clear();
        dc.sendKeysFunction(dc.searchName,"SerkanDalli");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);

    }


}
