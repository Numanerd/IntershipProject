package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddEditDeleteParameters {
    LeftNav ln =new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on Fields")
        public void clickOnFields() {
        ln.clickFunction(ln.fields);
    }
    @Then("Click on Search Button")
    public void clickOnSearchButton(){
        dc.clickFunction(dc.searchButton);
    }
}
