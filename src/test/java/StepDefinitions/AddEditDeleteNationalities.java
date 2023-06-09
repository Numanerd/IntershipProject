package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEditDeleteNationalities {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Given("navigate to Campus Page")
    public void NavigateToCampusPage() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("enter username and password then click login button")
    public void EnterUsernameAndPasswordThenClickLoginButton() {

        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);
    }

    @Then("user should login successfully on the Website")
    public void UserShouldLoginSuccessfullyOnTheWebsite() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }
    @Given("user clicks Setup on the LeftNav")
    public void UserClicksSetupOnTheLeftNav() {

        ln.clickFunction(ln.Setup);
    }
    @When("Click on Parameters")
    public void clickOnParameters() {

        ln.clickFunction(ln.Parameters);
    }
    @And("Click on Nationalities")
    public void Nationalities()
    {
        ln.clickFunction(ln.Nationalities);
    }

    @Then("Click on Add Button")
    public void clickOnAddButton() {
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "Kerim");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();

    }

    @Then("Click on Edit Button")
    public void clickOnEditButton() {

        dc.clickFunction(dc.searchName);
        dc.sendKeysFunction(dc.searchName, "Kerim");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.nameInput, "KerimGulov");
        dc.clickFunction(dc.saveBtn);
        dc.fuseProgressBar();

    }

    @Then("Click on Delete Button")
    public void ClickOnDeleteButton() {

        dc.clickFunction(dc.searchName);
        dc.searchName.clear();
        dc.sendKeysFunction(dc.searchName,"KerimGulov");
        dc.clickFunction(dc.searchButton);
        dc.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);

    }

}

