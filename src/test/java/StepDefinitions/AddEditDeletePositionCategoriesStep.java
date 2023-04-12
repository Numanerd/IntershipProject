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
    public void UserShouldClickOnHumanResourcesOnLeftNav(){
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
        dc.clickFunction(dc.closeButton);
        
    }

    @And("User should click on Edit button")
    public void userShouldClickOnEditButton() {
        dc.clickFunction(dc.editImgButton);
        dc.clickFunction(dc.closeButton);

        
    }

    @Then("User should click on Delete button")
    public void userShouldClickOnDeleteButton() {
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);

    }
}
