package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class AddEditDeleteParameters {
    LeftNav ln =new LeftNav();
    DialogContent dc=new DialogContent();
    JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
    @And("Click on Fields")
        public void clickOnFields() {
        ln.clickFunction(ln.fields);
    }
    @Then("Click on Search Button")
    public void clickOnSearchButton(){
        dc.sendKeysFunction(dc.searchName,"a");
        dc.sendKeysFunction(dc.searchCode,"1");
        dc.clickFunction(dc.searchButton);
    }

    @Given("Navigate to Field Page")
    public void navigateToFieldPage() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.fields);
    }

    @When("Add new Field")
    public void addNewField() {
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "GizemTest");
        dc.sendKeysFunction(dc.codeInput,"33202167");
        dc.clickFunction(dc.saveBtn);
    }

    @And("Search for new Field")
    public void searchForNewField() {
        dc.sendKeysFunction(dc.searchName, "Gizem");
        dc.clickFunction(dc.searchButton);
    }

    @When("Edit new Field")
    public void editNewField() {
        dc.waitUntilClickable(dc.editImgButton);
        js.executeScript("arguments[0].click();", dc.editImgButton);
        dc.sendKeysnoclear(dc.nameInput,"gizems12");
        dc.sendKeysnoclear(dc.codeInput,"0143");
        dc.clickFunction(dc.saveBtn);
    }

    @When("Delete new Field")
    public void deleteNewField() {
        dc.waitUntilClickable(dc.deleteImgButton);
        js.executeScript("arguments[0].click();", dc.deleteImgButton);
js.executeScript("arguments[0].click();", dc.deleteButton) ;
    }
}
